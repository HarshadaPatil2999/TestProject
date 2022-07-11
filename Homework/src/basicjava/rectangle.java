package basicjava;
import java.util.Scanner;
public class rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breadth");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int area= length*breadth;
		System.out.println("area of rectangle:"+area);


}
}
