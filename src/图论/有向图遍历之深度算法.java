package 图论;

import java.util.Scanner;

public class 有向图遍历之深度算法 {
	static int a[][]=new int[222][222];
	static int b[]=new int[222];
	static int m,n,e,c,d;
	static int min=99999999;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		m=cin.nextInt();
		n=cin.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==j)
					a[i][j]=0;
				else
					a[i][j]=99999999;
			}
		}
		for(int i=1;i<=n;i++)
		{
			c=cin.nextInt();
			d=cin.nextInt();
			e=cin.nextInt();
			a[c][d]=e;
			//a[d][c]=e;//无向图使用
		}
		b[1]=1;
		dfs(1,0);//计算从一号到五号的最短距离
		System.out.println(min);
		
	}
	public static void dfs(int cur,int dis)
	{
		if(dis>min)
			return;
		if(cur==m)
		{
		    if(dis<min)
			min=dis;
			return;
		}
		for(int i=1;i<=m;i++)
		{
			if(a[cur][i]!=99999999&&b[i]==0)
			{
				b[i]=1;
				dfs(i,dis+a[cur][i]);
				b[i]=0;
				
			}
		}
		return;
		
	}
	
}




