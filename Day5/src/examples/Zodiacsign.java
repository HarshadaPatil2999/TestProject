package examples;
import java.util.Scanner;
public class Zodiacsign {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the DD,MM and YY");
	   int DD=sc.nextInt();
	   int MM=sc.nextInt();
	   int YY=sc.nextInt();
	   int febdays;
			if( YY%4==0)
			 febdays=29;
			else
				febdays=28;   	
	   if(MM==1)
	   
		{  
		   if(DD>=1 && DD<=19 )
		   System.out.println(" your zodiac sign capricorn");
		   else if(DD>=20 && DD<=31)
	       System.out.println("your zodiac sign aquarius");
	       else
		   System.out.println("invalid date");
	    }
	      else if(MM==2)
	         {
		       if(DD>=1 && DD<=19)
			   System.out.println(" your zodiac sign aquarius ");
			   else if(DD>=20 && DD<=29 )
		       System.out.println("your zodiac sign pisces");
		        else
	          System.out.println("invalid date");
	}
   else if(MM==3)
	     {
	     if(DD>=1 && DD<=20)
		   System.out.println(" your zodiac sign  pisces ");
		   else if(DD>=21 && DD<=31 )
	       System.out.println("your zodiac sign aries ");
	   else
            System.out.println("invalid date");
	     }
   else if(MM==4)
   {
	   if(DD>=1 && DD<=20)
	   System.out.println(" your zodiac sign aries ");
	   else if(DD>=21 && DD<=30 )
       System.out.println("your zodiac sign taurus");
   else
        System.out.println("invalid date");
     }
   else if(MM==5)
   {
	   if(DD>=1 && DD<=20)
	   System.out.println(" your zodiac sign tauras ");
	   else if(DD>=21 && DD<=31 )
       System.out.println("your zodiac sign gemini");
   else
        System.out.println("invalid date");
     }
   else if(MM==6)
   {
	   if(DD>=1 && DD<=20)
	   System.out.println(" your zodiac sign gemini ");
	   else if(DD>=21 && DD<=30 )
       System.out.println("your zodiac sign cancer");
   else
        System.out.println("invalid date");
	   
     }
   else if(MM==7)
   {
	   if(DD>=1 && DD<=22)
	   System.out.println(" your zodiac sign cancer ");
	   else if(DD>=23 && DD<=31 )
       System.out.println("your zodiac sign leo");
      else
        System.out.println("invalid date");
	 }
   else if(MM==8)
   {
	   if(DD>=1 && DD<=22)
	   System.out.println(" your zodiac sign leo ");
	   else if(DD>=23 && DD<=31 )
       System.out.println("your zodiac sign virgo");
      else
        System.out.println("invalid date");
   }
   else if(MM==9)
   {
	   if(DD>=1 && DD<=22)
	   System.out.println(" your zodiac sign virgo ");
	   else if(DD>=23 && DD<=30 )
       System.out.println("your zodiac sign libra");
      else
        System.out.println("invalid date");
   }
   else if(MM==10)
   {
	   if(DD>=1 && DD<=22)
	   System.out.println(" your zodiac sign libra ");
	   else if(DD>=23 && DD<=31 )
       System.out.println("your zodiac sign scorpio");
      else
        System.out.println("invalid date");
   }
   else if(MM==11)
   {
	   if(DD>=1 && DD<=22)
	   System.out.println(" your zodiac sign scorpio ");
	   else if(DD>=23 && DD<=30 )
       System.out.println("your zodiac sign sagittarius");
      else
        System.out.println("invalid date");
   }
   else if(MM==12)
   {
	   if(DD>=1 && DD<=21)
	   System.out.println(" your zodiac sign sagittarius ");
	   else if(DD>=22 && DD<=31 )
       System.out.println("your zodiac sign capricorn ");
      else
        System.out.println("invalid date");
   }

 else 

 System.out.println(" invalid month");
  
}
   }
