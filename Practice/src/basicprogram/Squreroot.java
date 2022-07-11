package basicprogram;
import java.util.Scanner;
public class Squreroot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
	    int n=sc.nextInt();
	    double squre_root=Math.pow(n,0.5);

	  	System.out.println("squre root:"+squre_root);
	}
}
