package basicprogram;
import java.util.Scanner;
public class conversionlength {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lenght in centimeter");
		int cen=sc.nextInt();
		double mtr=cen/100.0;
		double kmtr=cen/100000.0;
		System.out.println("length in meter"+mtr);
		System.out.println("length in km"+kmtr);
	
		
		
	}

}
