//introduction to math laibarary 
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter your name");
		String x=input.nextLine();
		System.out.println("enter any double number");
		double y=input.nextDouble();
		System.out.println("enter any real number");
		float z=input.nextFloat();
		System.out.println("enter any intger");
		int u=input.nextInt();
		System.out.println("your name is "+x);
		System.out.println(y+" to the power"+z+" = "+Math.pow(y,z));
		System.out.println(z+"is close to "+Math.round(z));
		System.out.println(z+" close lower intger is "+Math.floor(z));
		System.out.println(z+" close upper intger is "+Math.ceil(z));
		System.out.println("the abslute value of "+u+" is "+Math.abs(u));
		System.out.println("the squere root for "+y+" is "+Math.sqrt(y));
		System.out.println(Math.max(z, y)+" is bigger than "+Math.min(z, y));
		System.out.println(Math.min(Math.E,Math.PI)+" is lower than "+Math.max(Math.E,Math.PI));
		System.out.println(Math.random()+"this is a random number bitween 0 and 1 ");
		System.out.println("The logarithm for "+u+" is "+Math.log(u));
		System.out.println("enter an intger number ");
		u=input.nextInt();
		System.out.println("this is "+Math.sin(u)+" sin");
		System.out.println("this is "+Math.cos(u)+" cos");
		System.out.println("this is "+Math.tan(u)+" tan");
		System.out.println(u+" in degree is equal to "+Math.toDegrees(u));
		System.out.println(u+" in degree is equal to "+Math.toRadians(u));
		
	}

}
