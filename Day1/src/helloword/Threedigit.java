package helloword;
import java.util.Scanner;
public class Threedigit {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("accept a number and check it where it 3 digit or not ");
	int n=sc.nextInt();
	
	
	if(n>=100 && n<1000)
		
     {
		System.out.println("it is three digit number");
		int last=n%10;
		int two=n/10;
		 int mid=two/10;
		int first=two%10;
		System.out.println(last+mid+first);
		
     }
	else
	{
		System.out.println(" it is not three digit number");
	}
}
}
