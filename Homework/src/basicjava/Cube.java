package basicjava;
import java.util.Scanner;
public class Cube {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the cube of number");
	int A=sc.nextInt();
	int cube= A*A*A;
	System.out.println("Answer:"+cube);

}
}
