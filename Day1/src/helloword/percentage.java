package helloword;
import java.util.Scanner;
public class percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the percentage ");
		int percentage=sc.nextInt();
		if(percentage>=40)
         System.out.println(" pass");
		else
			System.out.println("fail");
}
}
