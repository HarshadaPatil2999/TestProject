package basicjava;
import java.util.Scanner;
public class mod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mod of two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c= a % b;
		System.out.println("answer:"+c);

}
}
