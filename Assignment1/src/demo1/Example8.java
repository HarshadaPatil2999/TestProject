package demo1;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n=sc.nextInt();
		int temp=n;
		//145 =1!+4!+5!=145
		int sum=0;  //   145=1+(4*3*2*1)+(5*4*3*2*1)
		while(n>0)
		{int fact=1;
			int r=n%10;
			
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			
//			while(r>0)
//			{
//				
//				fact*=r;
//				r--;
//			}
			n=n/10;
			sum=sum+fact;
			
		}
		if(temp==sum)
		{
			System.out.println("no is Krishnmurthy");
		}
		else
			System.out.println("no is not Krishnmurthy");
	}

}
