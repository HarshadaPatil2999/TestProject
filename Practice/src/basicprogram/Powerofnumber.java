package basicprogram;
import java.util.Scanner;
public class Powerofnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    double power=Math.pow(n,m);

	  	System.out.println("power of number:"+power);
}
}
