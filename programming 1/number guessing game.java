//number guessing game
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number betwen 0 and 100");
  double n=input.nextDouble();
  double m=Math.random()*(100) ;
  m=(int)m;
  if(n==m)
	  System.out.println("you guess right");
  else if(m>n) 
	  System.out.println("The number you guess is less than the chosen number \n the chosen number is "+m);
  else if (n>m)
	  System.out.println("The number you guess is more than the chosen number \n the chosen number is "+m);
	}

}
