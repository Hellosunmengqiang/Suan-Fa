package ������Ŀ;
import java.util.Scanner;
public class ������ {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int a[]=new int[n+1];
			for(int i=1;i<n/2;i++)
			{
				a[i]+=a[i-1]+i;
			}
		
			for(int i=1;i<=n/2+1;i++)
			{
				for(int j=i+1;j<=n/i+i;j++)
				{
					if((i+j)*(j-i+1)==2*n)//��͹�ʽ
						{
					
						System.out.println(i+" "+j);
						}	
				}
			}
			
		}
	}
}
