package basicprogram;
import java.util.Scanner;
public class Angle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two angles of triangle");
	    int angle1=sc.nextInt();
		int angle2=sc.nextInt();
	    int angle3=180-(angle1+angle2);
	  	System.out.println("third angle:"+angle3);
		
	}

}
