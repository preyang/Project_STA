import java.util.Scanner;


public class TestDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	account ac=new account();
    System.out.println("CS-589 Final Project:");
	System.out.println("Driver for Account class.");
	 Scanner sc = new Scanner(System.in);
     String s="c";


	 while(s.equals("c")){
			System.out.println("Description of the Account class:\n0. open (int b, int p,int id) - the account class is activated which represents the balance by b, represents the pin by p and represents the login id by id \n 1.login(x)- try to log in for enter in the system\n"
+"2. logout() - logout from the system\n"
	+"3. int pin(int x) -  provides pin # (parameter x)\n"
+"4. int deposit (int d) -  deposits amount d to the account\n"
+"5. int withdraw (int w)-  withdraws amount w from the account\n"
+"6. int balance () -  returns the value of the account balance\n"
+"7. int lock (int x) -  locks an account where x is the lock #\n"+
"8. int unlock (int x) - unlock the account where x is the unlock id");
			System.out.println();
			System.out.println();
			System.out.println("Testing Oriented Methods:");
			System.out.println();
			System.out.println("9.Show_balance()");
			System.out.println("10.Show_all_values()");
			System.out.println("11.Show State values");
			System.out.println();
			System.out.println("Enter your choice:");
		 
		 String i = sc.next();
		 int r=0;
	
     switch(i)
		 {
		 case "0":
		    {
				 Scanner sc1 = new Scanner(System.in);
				 System.out.println("You Pressed 0");
				 System.out.println("You called open method");
			     System.out.println("Enter balance-b:");
				 int b = sc1.nextInt();
				 System.out.println("Enter pin-p:");
				 int p = sc1.nextInt();
				 System.out.println("Enter id for login -id:");
				 int id = sc1.nextInt();
				 r=ac.open(b, p,id);
			     System.out.println("Result-"+r);
			 	break;
		 	}
		 case "1":
		   {
				 Scanner sc1 = new Scanner(System.in);
				 System.out.println("You Pressed 1");
System.out.println("So you called login method");
System.out.println("Enter login credential - x:");
				 int x = sc1.nextInt();
				 r=ac.login(x);
				 System.out.println("Result-"+r);
				 break;
		   }
			 
		 case "2":
		    {  
		    	System.out.println("You Pressed 2");
		    	System.out.println("So you called logout method");
		    	r=ac.logout();
		        System.out.println("Result-"+r);  
		        break;
		    } 
		 case "3":
		 	  {
				 Scanner sc1 = new Scanner(System.in);
				 System.out.println("You Pressed 3");
			     System.out.println("So you called pin method");
			     System.out.println("Enter pin p#:");
				 int pn = sc1.nextInt();
				 r=ac.pin(pn);
			     System.out.println("Result-"+r);
			     break;
			  }
		 case "4":
		   {
			   Scanner sc1 = new Scanner(System.in);
			   System.out.println("You Pressed 4");
System.out.println("So you called deposit method");
System.out.println("Enter The amount you want to deposit d:");
			   int d = sc1.nextInt();
			   r=ac.deposit(d);
			   System.out.println("Result-"+r); 
			   break;
			 }
		case "5":
			{
			
				Scanner sc1 = new Scanner(System.in);
System.out.println("You Pressed 5");	System.out.println("So you called   withdraw method");
System.out.println("Enter the amount you want to withdraw:");
				int w = sc1.nextInt();
				r=ac.withdraw(w);
		        System.out.println("Result-"+r);
		        break;
		        }
		case "6":{
				System.out.println("You Pressed 6");
System.out.println("So you called balance method");
				r=ac.balance();
				System.out.println("your balance is: "+r);
				break;   
			}
		case "7":{
				Scanner sc1 = new Scanner(System.in);
				System.out.println("You Pressed 7");
System.out.println("So you called lock method");
System.out.println("your account is locked with id:");
				int id = sc1.nextInt();
				r=ac.lock(id);
				System.out.println("Result-"+r);	 
				break;
		    }
		case "8":
		   {
			   	Scanner sc1 = new Scanner(System.in);
			   	System.out.println("You Pressed 8");
System.out.println("So you called unlock method");
System.out.println("you want to unlock account with id:");
			   	int id1 = sc1.nextInt();
				r=ac.unlock(id1);
				System.out.println("Result-"+r);
				break;
		   }
		case "9":
		{
				System.out.println("You Pressed 9");
				System.out.println("The balance is : ");
				r=ac.show_balance();
				System.out.println("Result-"+r);
				break;
		}
		case "10" : 
		{
				System.out.println("You Pressed 10");
System.out.println("You can see all the values of below:");
				ac.show_all_values();
				break;
		}
case "11" : 
			{
					System.out.println("You Pressed 11");
					ac.Show_State();
					//System.out.println("Result-"+r);
					break;
		}
		
		default:
			{
				System.out.println("wrong choice:");
			}
		  
		 }
System.out.println("Enter ''c'' if you want to continue:");
			 s=sc.next();
	 }	
	
	
	
	
	System.out.println("Exit from Test Driver--------->");	
	}

}
