package 图论;
import java.util.Scanner;
public class 无向图遍历之广度算法 {
	static int a[][]=new int[22][22];
	static int b[]=new int[222];
	static int m,n,x,y,cur;
	static int sum=0;
	
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
			x=cin.nextInt();
			y=cin.nextInt();
			a[x][y]=1;
			a[y][x]=1;
			
		}
		int top=1;
		int rear=1;
		int que[]=new int[222];
		que[rear]=1;
		rear++;
		b[1]=1;
		while(top<rear&&rear<=m)
		{
			cur=que[top];
			for(int i=1;i<=m;i++)
			{
				if(a[cur][i]==1&&b[i]==0)
				{
					b[i]=1;
					que[rear]=i;
					rear++;
				}
				if(rear>m)
					break;
			}
			top++;
		}
		for(int i=1;i<rear;i++)
			System.out.print(que[i]+" ");
		
	}

}







