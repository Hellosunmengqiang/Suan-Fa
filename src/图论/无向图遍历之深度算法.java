package 图论;

import java.util.Scanner;

public class 无向图遍历之深度算法 {
	static int a[][]=new int[22][22];
	static int b[]=new int[222];
	static int m,n,x,y;
	static int sum=0;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		m=cin.nextInt();
		n=cin.nextInt();
		for(int i=1;i<=m;i++)  //初始化m*n矩阵点与点之间的关系
			for(int j=1;j<=m;j++)
			{
				if(i==j)
				  a[i][j]=0;
				else
					a[i][j]=99999999;
			}
		for(int i=1;i<=n;i++)//读入两点之间的边
		{
			x=cin.nextInt();
			y=cin.nextInt();
			a[x][y]=1;
			a[y][x]=1;
		}
		b[1]=1;
		bfs(1);
		
	}
	public static void bfs(int cur)
	{
		System.out.print(cur+" ");
		sum++;
		if(sum==m)
			return;//每个点遍历完后强制退出
		for(int i=1;i<=m;i++)
		{
			if(a[cur][i]==1&&b[i]==0)
			{
				b[i]=1;
				bfs(i);
			}
		}
	}

}








