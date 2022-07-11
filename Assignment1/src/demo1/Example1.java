package demo1;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater no:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater no:"+b);
		}
		else
			System.out.println("c is greater no:"+c);
	}

}
