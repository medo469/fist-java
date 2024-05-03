//introduction to student grade
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter your grade");
  int n=input.nextInt();
  if (n>=90)
	  System.out.println("excllent");
  else if (n>=80)
	  System.out.println("very good");
  else if (n>=70)
  {  System.out.println("good");
  if(n%2==0)
	  System.out.println("even");
  else
	  System.out.println("odd");
  }
  else if (n>=60)
	  System.out.println("pass");
  else
	  System.out.println("fail");
		
	}

}
