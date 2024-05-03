//p(n,r)
package laps;
import java.util.Scanner;
public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number n ");
		int n=s.nextInt();
		System.out.println("enter a number r ");
	int r=s.nextInt();
		for(r=2*n;n<r;r=s.nextInt()) {
			System.out.println("enter r again and it should be less than n");		
		}
	int fn=1,fr=1;
  for( int i=1;i<=n;i++) {
	fn*=i;
	if(i<=n-r)
	fr*=i;
  }

  System.out.println("p("+n+","+r+") = "+((double)fn/fr));
  }

}

