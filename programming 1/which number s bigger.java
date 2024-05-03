//the greatest
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
  double n=input.nextDouble();
  System.out.println("enter the second number");
  double m=input.nextDouble();
  System.out.println("enter the third number");
  double r=input.nextDouble();
  if(n>m && n>r)
	  System.out.println("the greatest is : "+n);
  else if(m>n && m>r) 
	  System.out.println("the greatest is : "+m);
  else if(r>n && r>m)
	  System.out.println("the greatest is : "+r);
	}

}
