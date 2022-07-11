package demo1;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=r;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
