package basicjava;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter addition of two numbers");
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=A+B;
		System.out.println("addition:"+C);
}
}
