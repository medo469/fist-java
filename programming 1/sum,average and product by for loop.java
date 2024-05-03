//sum,average and product by for loop
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);//sum,average and product by for loop
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number n");
		int n=s.nextInt();
		int sum=0;
		int product=1;
		double average=0.0;
  for( int i=1;i<=n;i++) {
	sum+=i;
	product*=i;
	average=(double)sum/i;
  }

  System.out.println("The sum of numbers from 1 to "+n+" is : "+sum);
  System.out.println("The proudct of numbers from 1 to "+n+" is : "+product);
  System.out.println("The average of numbers from 1 to "+n+" is : "+average);
	}

}


		System.out.println("enter a number n");
		int n=s.nextInt();
		int sum=0;
		int product=1;
		double average=0.0;
  for( int i=1;i<=n;i++) {
	sum+=i;
	product*=i;
	average=(double)sum/i;
  }

  System.out.println("The sum of numbers from 1 to "+n+" is : "+sum);
  System.out.println("The proudct of numbers from 1 to "+n+" is : "+product);
  System.out.println("The average of numbers from 1 to "+n+" is : "+average);
	}

}

