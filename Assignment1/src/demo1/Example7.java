package demo1;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term");
		int term=sc.nextInt();
		int a=0,b=1;
		for(int i=0;i<term;i++)
		{
		  	System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			
		}
		
	}

}
