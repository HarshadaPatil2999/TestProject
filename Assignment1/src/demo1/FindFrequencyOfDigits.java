package demo1;

import java.util.Scanner;

public class FindFrequencyOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int n=sc.nextInt();
		int temp=n;
		
		for(int i=0;i<=9;i++)
		{
			int count=0;
			while(n>0)
			{
				int r=n%10;
				
				if(r==i)
				{
					count++;
				}
				n=n/10;
			}
			
			n=temp;
			if(count>0)
		   {
			System.out.println(i+" "+count);
		   }
		}
			
	}

}
