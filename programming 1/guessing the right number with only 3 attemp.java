//guessing the right number with only 3 attemp
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	double x=(int)( Math.random()*10);
	int y;
	System.out.println("I think about a number between 0 and 9 .can you guess it ?");
	int i=3;
	while(i>0)
	{
		y=s.nextInt();
		if(y==x) {
			System.out.print("you guess it right .");	
	break;
		}else if(x<y){
			System.out.println("your number is more than the guess,guess again");
		}
		else
			System.out.println("your number is less than the guess,guess again");
		i--;
		System.out.println("you have ("+i+") left");
		}
	System.out.println("The correct number is "+x);
	}
	
}
