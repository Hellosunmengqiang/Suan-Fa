package 典型题目;

import java.util.Scanner;

public class 矩阵旋转 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int m=cin.nextInt();
			int a[][]=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j]=cin.nextInt();
				}
			}
			if(m%4==1)
			{
			int temp[][]=get(a);
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(temp[i][j]+" ");
				}
				System.out.println();
			}
			}
			if(m%4==2)
			{
				int temp0[][]=get(a);
				int temp[][]=get(temp0);
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print(temp[i][j]+" ");
					}
					System.out.println();
				}
			}
			if(m%4==3)
			{
				int tem[][]=get(a);
				int temp0[][]=get(tem);
				int temp[][]=get(temp0);
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print(temp[i][j]+" ");
					}
					System.out.println();
				}
			}
			
		}
	}
		public static int[][] get(int a[][])
		{
			int temp[][]=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					temp[a[i].length-j-1][i]=a[i][j];
				}
			}
			return temp;
		}
}
