package 典型题目;

import java.util.Scanner;

public class 最大子段和 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		System.out.println(max(n,a));
		
	}
	public static int max(int n,int a[])
	{
		int sum=0,b=0;
		for(int i=0;i<n;i++)
		{
			if(b>0) b+=a[i];
			else
				b=a[i];
			if(b>sum)
				sum=b;
		}
		return sum;
	}

}/*8
-20 1 2 3 18 -6 1 2
24*/
