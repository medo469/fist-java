//BMI test
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean i=true;
		while(i==true)
		{i=false;
			System.out.println("Please enter your weight in pounds.");
		double weight=s.nextDouble()*0.45359237;
		System.out.println("Please enter your height in inchs.");
		double height=s.nextDouble()*0.0254;
		double BMI=weight/(Math.pow(height,2));
	if(BMI<18.5&&BMI>0)
	System.out.println(" You are Underweight Try to eat more.");
	else if(18.5<=BMI&&BMI<25)
	System.out.println(" Congratulations you are normal.");
	else if(25<=BMI&&BMI<30)
		System.out.println(" You are overweight try a good Diet.");
	else if(BMI>30)
		System.out.println(" You are Obese ,Please for the sake of the god try an extra diet.");
	else {
		System.out.println("you enter a wrong weight or heigt ");
		System.out.println("Do you want to try again?\n type 1 if you want \n 0 if you wouldn't");
		int q=s.nextInt();
		if(q==1)
	   i=true;
	}
		System.out.println("Do you want to Exit?\n Type\n 1 if you want to Exit \n 0 if you want to resume");
		int q=s.nextInt();
		if(q==0)
	   i=true;
	}
	}
	
}

