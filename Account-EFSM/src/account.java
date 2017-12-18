//***********************************************
//************* CLASS ACCOUNT *******************
//***********************************************



public class account
{
	private int x0;//max attempt of pin
	private int x1;//balance
	private int x2;//locked state flag
	private int x3;//pin
	private int x4;//state -1,0,1,2,3,4(start,idle,check pin,...)
	private int x5;//id
	private int x6;//extra charge if balance go over 500
	private int x7;//balance limit	
	private int x8;//
	private int x9;//attempts of pin
	
public final int show_balance()
{
	System.out.println("Show balance");
	return x1;
	
} //testing oriented method

public final void show_all_values()
{
	
	System.out.println("x0:max number of attempt for pin---" + x0);
	System.out.println("x1:balance---" + x1);
	System.out.println("x2:locked state flag---" + x2);
	System.out.println("x3:pin---" + x3);
	System.out.println("x4:Current State---" + x4);
	System.out.println("x5:id---" + x5);
	System.out.println("x6:Charge in $ if balance is below 500---" + x6);
	System.out.println("x7:balance limit---" + x7);
	System.out.println("x8:---" + x8);
	System.out.println("x9:total attempts you made for pin---" + x9);
	
}
public final void Show_State()
{

	
	if(x4==0)
	{
		System.out.println("You are in idle state.");
	}
	if(x4==1)
	{
		System.out.println("You are in Check pin  state.");
	}
	if(x4==2 && x1 < x7 && x2==0)
	{
		System.out.println("You are in OverDrawn state.");
	}
	if(x4==2 && x9>=x0)
	{
		System.out.println("You are in idle  state.");
	}
	if(x4==2 && x1>x7 && x2==0 )
	{
		System.out.println("You are in Ready  state.");
	}
	if( x4==2 && x1>x7 && x2==1)
	{
		System.out.println("You are in locked state.");
	}

	if( x4==2 && x1<x7 && x2==1)
	{
		System.out.println("You are in locked state.");
	}
	
	
	
}

public account()
{
	x2 = 0;//locked state flag
	x4 = -1;//state
	x6 = 20;//extra charge over 500 balance
	x7 = 500;//balance limit
	x9 = 0;//attempt of pin 
	x0 = 3;//max attempt of pin
}
public final int open(int x, int y, int z)
{
	
	
	if ((x > 0) && (x4 == -1) && (y > 0) && (z > 0))
	{
		x1 = x;
		x3 = y;
		x5 = z;
		x4 = 0;
System.out.println("Set value to open function if all input is correct");
		return 0;
	};
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
	return -1;
}
public final int pin(int x)
{
	
	if (x4 != 1)
	{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
		return -1;
	}
	if (x == x3)
	{
		x4 = 2;
System.out.println("You entered right pin.Please continue!!!");
		return 0;
	}
	else
	{
		x9++;
System.out.println("you enterd wrong pin please try again!");
	}
	if (x9 >= x0)
	{
System.out.println("too many attempts of pin. Please try to login again!!!");
		x4 = 0;
	}
	return -1;
}
public final int logout()
{
	
	if ((x4 == 0) || (x2 == 1))
	{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
		return -1;
	}
	x4 = 0;
	System.out.println("log out Successfully!");
	return 0;
}
public final int login(int x)
{
	
	if (x4 != 0)
	{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
		return -1;
	}
	if (x5 == x)
	{
		x4 = 1;
		x9 = 0;
System.out.println("login credential is correct! you are  logged in to system.");
		return 0;
	}
	System.out.println("Wrong credential...Please Try Again!!! ");
	return -1;
}
public final int balance()
{
	
	if (x4 != 2)
	{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
		return -1;
	}
	System.out.println("your current balance is :");
	return x1;
}
public final int lock(int x)
{
	
	if (x4 != 2)
	{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
		return -1;
	}
	if (x == x3)
	{
System.out.println("System can not be locked because the credential you are trying is same   as pin");
		return -1;
	}
	if (x2 == 0)
	{
		x2 = 1;
		x8 = x;
System.out.println("You are in locked state.You need to perform unlock operation with same credentials.");
		return 0;
	}
	else
	{
		System.out.println("NO operation performed from here!!!");
		return -1;
	}
}
public final int unlock(int x)
{
	
	if (x4 != 2)
	{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
		return -1;
	}
	if ((x2 == 1) && (x == x8))
	{
		x2 = 0;
		System.out.println("Your system is unlocked!!");
		return 0;
	}
	else
	{
		System.out.println("No operation performed from here!!");
		return -1;
	}
}
public final int deposit(int d)
{
	
	if (x4 != 2)
	{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
		return -1;
	}
	if (x2 == 1)
	{
System.out.println("You cannot deposit money when your account is locked. ");
		return -1;
	};
	if ((x1 + d < x7) && (d>0))
	{
		x1 = x1 + d - x6;
System.out.println("Your balance is below 500 so it charged $20 extra and your new money is deposited!");
		return 0;
	}
	else
	{
		if (d > 0)
		{
			x1 = x1 + d;
			System.out.println("Money deposited!!");
			return 0;
		}
	}
System.out.println("No operation done!!!");
 return -1;
}
public final int withdraw(int w)
{
	
if (x4 != 2)
{
System.out.println("This operation not affect the transition as it is ghost transition.!!!");
	return -1;
}
if (x2 == 1)
{
System.out.println("You can not withdraw money without entering pin!!!");
	return -1;
};
if ((x1 > w) && (w > 0))
{
	if (x1 < x7)
	{
		System.out.println("balance is less then balance limit");
		return -1;
	}
	else
	{
		x1 = x1 - w;
		System.out.println("Money Withdraw from account---" + x1);
	};
	if (x1 < x7)
	{
		x1 = x1 - x6;
System.out.println("Money Withdraw from account with $20 extra fees as balance is below 500"+ x1);
	}
  return 0;
}
System.out.println("NO operation Done!!!");
return -1;
}
}
