package examples;
import java.util.Scanner;
public class greaterthan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two number and find  it is  max or equal or min");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if( a>b || a==b)
			{
			if(a>b)
			System.out.println("a is greater than b");
			else
			System.out.println("a is equal to b");
			}
		else
			System.out.println("b is greater than a");
			

}
}
