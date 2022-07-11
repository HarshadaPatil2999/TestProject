package basicjava;
import java.util.Scanner;
public class positivenigative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number and find  it is  positive or zero or negative");
		int n=sc.nextInt();
		if( n>0 || n==0)
			{
			if(n>0)
			System.out.println("number is positive");
			else
			System.out.println("number is zero");
			}
		else
			System.out.println("number is negative");
			
			
	}

}
