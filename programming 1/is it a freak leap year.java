//is it a freak leap year
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year you want to know.");
		int year=s.nextInt();
	boolean x=(year%4==0);
	boolean y=(year%100!=0);
	boolean z=(year%400==0);
	if(x&&(y||z))
	System.out.println(year+" is a leap year.");
	else
	System.out.println(year+" isn't a leap year.");
	}
	
}
