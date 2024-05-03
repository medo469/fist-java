//is the year a leap ?
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a year");
  int n=input.nextInt();
  if(n%4==0)
	  System.out.println(n+"it's a leap year");
  else
	  System.out.println(n+"it's not a leap year");
	}

}

