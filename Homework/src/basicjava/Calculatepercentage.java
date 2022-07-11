package basicjava;
import java.util.Scanner;
public class Calculatepercentage {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter the five subject of marks and calculate total,average and percentage");
	int marathi=sc.nextInt();
	int hindi=sc.nextInt();
    int english=sc.nextInt();
    int physics=sc.nextInt();
    int chemistry=sc.nextInt();
    int total=marathi+hindi+english+physics+chemistry;
	System.out.println("Total:"+total);
	double average=total/5.0;
	System.out.println("Average:"+average);
	double percentage=(total/500.0)*100.0;
	System.out.println("Percentage:"+percentage);

}
}
