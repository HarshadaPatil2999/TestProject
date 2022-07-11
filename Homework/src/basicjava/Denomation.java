package basicjava;
import java.util.Scanner;
public class Denomation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of rs ");
		int amt=sc.nextInt();
		int n2000=amt/2000;
		 amt=amt%2000;
		int n500=amt/500;
		 amt=amt%500;
		int n200=amt/200;
		amt=amt%200;
		int n50=amt/50;
		 amt=amt%50;
		int n20=amt/20;
		 amt=amt%20;
		int n5=amt/5;
		 amt=amt%5;
		 System.out.println("enter the notes of n2000:"+n2000);
		 System.out.println("enter the notes of n500:"+n500);
		 System.out.println("enter the notes of n200:"+n200);
		 System.out.println("enter the notes of n50:"+n50);
		 System.out.println("enter the notes of n20:"+n20);
		 System.out.println("enter the notes of n5:"+n5);
		 System.out.println("enter the remaining amount:"+amt);
	}
		

}
