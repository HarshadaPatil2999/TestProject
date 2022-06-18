package examples;
import java.util.Scanner;
public class choice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("accept two number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("press 1-add,2-sub,3-mul,4-div");
		int choice=sc.nextInt();

	 if(choice==1)
		 System.out.println(" addition:"+(a+b));
	     
	    else if(choice==2)
	   System.out.println("substration:"+(a-b));
	     
		else if(choice==3)
	    System.out.println(" multiplication:"+(a*b));
	     
	    else if (choice==4)
		System.out.println(" division:"+(a/b));
	else 
		System.out.println("wrong choice");
}
}
