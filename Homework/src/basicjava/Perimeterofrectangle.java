package basicjava;
import java.util.Scanner;
public class Perimeterofrectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the length and breadth and calculate perimeter of rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int perimeter= 2*(length+breadth);
		System.out.println(" answer:"+perimeter);
		

}
}
