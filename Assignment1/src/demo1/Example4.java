package demo1;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Basic Salary");
	int basicSalary=sc.nextInt();
	
	if(basicSalary<=10000)
	{
		float HRA=(basicSalary*20)/100;
		float DA=(basicSalary*80)/100;
		float grossSalary=basicSalary+HRA+DA;
		System.out.println("HRA:"+HRA);
		System.out.println("DA:"+DA);
		System.out.println("Gross Salary of Employee:"+grossSalary);
    }
	else if(basicSalary<=20000)
	{
		float HRA=(basicSalary*25)/100;
		float DA=(basicSalary*90)/100;
		float grossSalary=basicSalary+HRA+DA;
		System.out.println("HRA:"+HRA);
		System.out.println("DA:"+DA);
		System.out.println("Gross Salary of Employee:"+grossSalary);
    }
	else if(basicSalary>20000)
	{
		float HRA=(basicSalary*30)/100;
		float DA=(basicSalary*95)/100;
		float grossSalary=basicSalary+HRA+DA;
		System.out.println("HRA:"+HRA);
		System.out.println("DA:"+DA);
		System.out.println("Gross Salary of Employee:"+grossSalary);
    }
	



}
}
