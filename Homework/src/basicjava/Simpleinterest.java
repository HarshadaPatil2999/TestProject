package basicjava;
import java.util.Scanner;
public class Simpleinterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the P,T,R and calculate SI");
		int P=sc.nextInt();
		int T=sc.nextInt();
		int R=sc.nextInt();
		int SI=(P*T*R)/100;
		System.out.println("Simple Interest:"+SI);
	}

}
