package basicprogram;
import java.util.Scanner;
public class Conversiontempf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in celsius");
	    float C=sc.nextInt();
	    float F=(((C*9)/5)+32);
	    
	 	System.out.println("temperature in fahrenhiet:"+F);
}

}
