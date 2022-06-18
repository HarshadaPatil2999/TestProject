package examples;
import java.util.Scanner;
public class equilatraltriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of triangle ");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		if( side1==side2 || side2==side3)
			{
		
			System.out.println("equililatral triangle");
		
			}
		else
			System.out.println("not equilatral"); 
			


}
}
