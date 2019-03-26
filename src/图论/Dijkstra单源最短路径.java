package 图论;
import java.util.Scanner;

public class Dijkstra单源最短路径 {
	static int a[][]=new int[50][50];
	static int dis[]=new int[50];
	static int b[]=new int[50];
	static int m,n,c,d,e,min,u;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		m=cin.nextInt();
		n=cin.nextInt();
		for(int i=1;i<=m;i++)
			for(int j=1;j<=m;j++)
			{
				if(i==j)
					a[i][j]=0;
				else
					a[i][j]=99999999;
			}
		for(int i=1;i<=n;i++)
		{
			c=cin.nextInt();
			d=cin.nextInt();
			e=cin.nextInt();
			a[c][d]=e;
			//a[d][c]=e;
			
		}
		for(int i=1;i<=m;i++)
			dis[i]=a[2][i];  //初始化2(x)号到其他顶点的距离
		for(int i=1;i<=m;i++)
			b[i]=0;
		
		b[1]=1;
		
		for(int i=1;i<=m-1;i++)
		{
			min=999999999;
			for(int j=1;j<=m;j++)//遍历找到距离x号最近的点,用来对其他点进行松弛
			{
				if(b[j]==0&&dis[j]<min)
				{
					min=dis[j];
					u=j;
				}
			}
			b[u]=1;
			for(int k=1;k<=m;k++)//遍历用最近的点替换掉距离远的点的值
			{
				if(a[u][k]<999999999)
				{
					if(dis[k]>dis[u]+a[u][k])
						dis[k]=dis[u]+a[u][k];
				}
			}
		}
		for(int i=1;i<=m;i++)
			System.out.print(dis[i]+" ");
	}

}//多远最短路径就是有向图中找出指定一个点到其他点的方案，达到这个点到其他点的最短路径







