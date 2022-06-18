package examples;
import java.util.Scanner;
public class Gread {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the percentage ");
	int percentage=sc.nextInt();
	if(percentage>=75)
		System.out.println("u got distingtion");
	else if(percentage>=60)
		System.out.println("u got first class");
	else if(percentage>=50)
		System.out.println("second class");
	else
		System.out.println("fail");
	

}
}
