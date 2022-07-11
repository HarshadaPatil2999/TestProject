package basicprogram;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
	    int  radius=sc.nextInt();
	    int diameter=2*radius;
	    double circumference=2*3.14*radius;
	    double area=3.14*radius*radius;
	 	System.out.println("enter the value of  diameter :"+ diameter);
	 	System.out.println("enter the value of circumference :"+circumference);
	 	System.out.println("enter the value of area:"+area );
	}

}
