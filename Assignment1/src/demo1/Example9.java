package demo1;

public class Example9 {
	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++)
		{int cnt=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			
			if(cnt==1)
			{
				System.out.print(i+" ");
			}
		}
	}

}
