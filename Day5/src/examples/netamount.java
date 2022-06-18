package examples;
import java.util.Scanner;
public class netamount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount ");
		int n=sc.nextInt();
		
		
		if( n>=10000)
		{
		double discount=(20/100.0)*n;
		System.out.println("the discount is "+discount);
		System.out.println("netpayble amount is"+(n-discount));
		
			}
		else
			System.out.println(" not get discount"); 
			

}
}
