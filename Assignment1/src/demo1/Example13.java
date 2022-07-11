package demo1;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		char r=sc.next().charAt(0);
		for(char i='A';i<=r;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
