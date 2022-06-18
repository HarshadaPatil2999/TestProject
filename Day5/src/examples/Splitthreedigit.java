package examples;
import java.util.Scanner;
public class Splitthreedigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	   int n=sc.nextInt();
		if(n>=100 && n<1000)	 
	
		{ System.out.println(" it is 3 digit number");
	 int a=n%10;
	 int two=n/10;
	 int b=two/10;
	 int c=two%10;
	 int sum= a*a*a+b*b*b+c*c*c;
	 System.out.println("sum:"+(a*a*a+b*b*b+c*c*c));
	 if(sum==n)
		 System.out.println("armstrong number");
	 else
		 System.out.println("not armstrong number");
		}
	 
	else
			System.out.println("it is not three digit number");
}
}
