package 图论;

import java.util.Scanner;

public class 有向多源最短路径 {
	static int [][]a=new int[55][55];
	static int c,d,e,m,n;
	
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
			
		  }
		  for(int k=1;k<=m;k++)
			  for(int i=1;i<=m;i++)
				  for(int j=1;j<=m;j++)
				  {
					  if(a[i][j]>a[i][k]+a[k][j])
						  a[i][j]=a[i][k]+a[k][j];
				  }
		  for(int i=1;i<=m;i++)
		  {
			  for(int j=1;j<=m;j++)
			  {
				  System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
		  }
	}

}//多远最短路径就是有向图中找出任意两个点的最短方案的距离
