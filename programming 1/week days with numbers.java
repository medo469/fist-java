//week days with numbers
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter an integer number");
  int n=input.nextInt();
  if(n==1)
	  System.out.println("sutarday");
  else if (n==2)
	  System.out.println("sunday");
  else if(n==3)
	  System.out.println("monday");
  else if(n==4)
	  System.out.println("tuseday");
  else if(n==5)
	  System.out.println("windsday");
  else if(n==6)
	  System.out.println("thursday");
  else if(n==7)
	  System.out.println("friday");
  else 
	  System.out.println("invalid day");  
	}

}
