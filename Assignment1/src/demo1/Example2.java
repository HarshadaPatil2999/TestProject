package demo1;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		long a=sc.nextLong();
		long sum=0;
		while(a>0)
		{
			long r=a%10;
			sum=sum+r;
			a=a/10;
		}System.out.println("sum:"+sum);
	}

}
