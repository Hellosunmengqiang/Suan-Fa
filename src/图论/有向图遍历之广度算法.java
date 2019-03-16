package 图论;

import java.util.Scanner;

public class 有向图遍历之广度算法 {
	static int a[][]=new int[222][222];
	static int b[]=new int[222];
	static int m,n,c,d,e;
	static int min=0;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		m=cin.nextInt();
		n=cin.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++ )
			{
				if(i==j)
					a[i][j]=0;
				else
					a[i][j]=99999999;
			}
		}
		for(int i=0;i<n;i++)
		{
			c=cin.nextInt();
			d=cin.nextInt();
			e=cin.nextInt();
			a[c][d]=e;
		}
		int top=1,rear=1;
		int que[]=new int[1111];
		que[rear]=1;
		rear++;
		b[1]=1;
		int cur;
		while(top<rear&&rear<=m)
		{
			cur=que[top];
		for(int k=1;k<=m;k++)
		{
			
			if(a[cur][k]!=99999999&&b[k]==0)
			{
				b[k]=1;
				que[rear]=k;
				rear++;
				
				//buhui
			}
			if(rear>m)
				break;
		}
		top++;
		
		}
		System.out.println();
			
	}
}




