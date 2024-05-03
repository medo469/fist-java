//Palindrome number with a while loop
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean i=true;
		while(i==true)
		{i=false;
		System.out.println("Please enter a 3-digits number ");
	    int number=s.nextInt();  
		int digit1 = number / 100;
	        int digit3 = number % 10;

	        if(digit1 == digit3)
	            System.out.println(number + " is a palindrome.");
	        else 
	            System.out.println(number + " is not a palindrome.");
		System.out.println("Do you want to Exit?\n Type\n 1 if you want to Exit \n 0 if you want to resume");
		int q=s.nextInt();
		if(q==0)
	   i=true;
	}
	}
	
}
