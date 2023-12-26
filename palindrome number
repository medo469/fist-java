# first-java
//palindrome number

public class lap3 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	  boolean i=true;
	    while(i==true)
		{
	System.out.println("\n\n\nPlease enter an integer number to cheak.\n");
	int num =s.nextInt();
    int originalNum = num;
    int reverseNum = 0;
  
    while(num != 0) {
        int digit = num % 10;
        reverseNum = reverseNum * 10 + digit;
        num /= 10;
    }

    if(originalNum == reverseNum) {
        System.out.println(originalNum + " is a palindrome.\n\n");
    } else {
        System.out.println(originalNum + " is not a palindrome.\n\n");
    }
    System.out.println("Enter 1 if you want to Exit.\nEnter any number if you want to countune\n\n");
    int q =s.nextInt();
    if(q==1)
    	i=false;
    else
    	i=true;
	}
}
}
