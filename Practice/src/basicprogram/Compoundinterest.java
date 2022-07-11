package basicprogram;
import java.util.Scanner;
public class Compoundinterest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter P,T,R and find compound interest");
    int P=sc.nextInt();
	int T=sc.nextInt();
    int R=sc.nextInt();
    int n=sc.nextInt();
	double A=P*Math.pow(1+(R/n),n*T);
	double CI=A-P; 
	System.out.println("compound interest after"+T+" years"+CI);
	System.out.println("amount after"+T+"year"+A);
	
}
}
