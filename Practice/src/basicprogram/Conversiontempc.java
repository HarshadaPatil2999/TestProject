package basicprogram;
import java.util.Scanner;
public class Conversiontempc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in Fahrenhiet");
	    double F=sc.nextDouble();
	    double C=((F-32)/1.8);
	    
	 	System.out.println("temperature in celsius :"+C);

}
}
