package basicprogram;
import java.util.Scanner;
public class conversiondays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter days");
		int days=sc.nextInt();
		int year=days/365;
	    int week=(days%365)/7;
		int day=days-((year*365)+(week*7));
		System.out.println("enter the numbers of year"+year);
		System.out.println("enter the numbers of week"+week);
		System.out.println("enter the numbers of day"+day);
		
}
	
}
