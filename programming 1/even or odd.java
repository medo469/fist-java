//even or odd
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter an integer number");
  int n=input.nextInt();
  if(n%2==0)
	  System.out.println(n+" is even");
  else
	  System.out.println(n+" is odd");
 
	}

}
