package basicprogram;
import java.util.Scanner;
public class Logicaloperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
	    int  a=sc.nextInt();
	    int b=sc.nextInt();
	    if(a<b||a==b)
	    	{if(a<b)
	    		System.out.println("a is smaller than b ");
	    	else
            System.out.println("a is equal b ");
	    	
	    	}
	    	else 
	    		System.out.println(" a is greater than b");
	    	
	   
	}

}
