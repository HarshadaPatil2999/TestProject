package helloword;
import java.util.Scanner;

public class simpleinterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle,rate,time");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		int SI=(p*r*t)/100;
		System.out.println("simple Interest:"+SI);
	
	
	}
}
