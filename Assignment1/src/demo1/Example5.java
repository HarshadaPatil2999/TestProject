package demo1;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter your Choice:1.Addition 2.Substraction 3.Multiplication 4.Division");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Addition:"+(a+b));
		break;
		case 2:System.out.println("Substraction:"+(a-b));
		break;
		case 3:System.out.println("Multiplication:"+(a*b));
		break;
		case 4:System.out.println("Division:"+(a/b));
		break;
		default:System.out.println("invalid Choice...");
		}
	}

}
