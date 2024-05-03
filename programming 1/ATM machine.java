//ATM machine
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int balance=5000 ;
		boolean i=true,x=true;
		System.out.println("Dear customer please enter your ATM card .");
		System.out.println("\t\t\tPress any button if you enter your card.");
		String o=s.nextLine();
		while(x==true) {
		System.out.println("\t\t\t\t\tpassword \n\t\t\t\t\t  ----");
			int password=s.nextInt();
		
		if(password>999&&password<10000) {
			x=false;}
		else {
			System.out.println("\t\t\t    Wrong password please try again. \n");
			x=true;
			}
		}	
		while(i==true)
		{
		System.out.println("_________________________________________________________________________________"
				+"\n Please Choose the operation number :\n 1)Withdraw the money.\n 2)Deposit the money.\n 3)Check the balance.\r\n 4)Exit."
				+"\n_________________________________________________________________________________");
		int c=s.nextInt();
		switch (c)
	    {
	    case 1:
	    	int j=1;
	    	while(j==1)
	    	{
	    		 System.out.println("Please enter the amount of money you want to withdraw.");
	    	int withdraw=s.nextInt();
	        if(withdraw<balance) {
	        balance=balance-withdraw;
	        System.out.println("\nCollect your money. ");
	        j=2;}else
		    	System.out.println("you enter more than your balance which is "+balance+"$ . please try again with a a little number.\n\n");
		    	}
	    break;
	    case 2:
	    System.out.println("Please enter the amount of money to be Deposit.");
	    		int Deposit=s.nextInt();
	    	
	    	balance=balance+Deposit;
	    	System.out.println("Your money has been deposited successfully .");
	    	
	    break;
	    case 3:
	    	System.out.println("Dear customer you have "+balance+"$ in your account .");
	    break;	
	    case 4:
		   i=false;
	    break;
	    }
	
	}
	}
	
}
