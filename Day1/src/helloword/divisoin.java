package helloword;
import java.util.Scanner;
public class divisoin {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("accept a number and check it where it 2 digit or not ");
	int n=sc.nextInt();
	
	
	if(n>=10 && n<100)
		
     {
		System.out.println("it is two digit number");
		int lastdigit=n%10;
		int firstdigit=n/10;
		int sum=lastdigit+firstdigit;
		System.out.println("sum:"+sum);
		
     }
	else
	{
		System.out.println(" it is not two digit number");
	}
}
}
