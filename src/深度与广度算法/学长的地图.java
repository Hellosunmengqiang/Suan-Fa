package 深度与广度算法;

import java.util.Scanner;
public class 学长的地图 {
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	static int a[][]=new int[1000][1111];
	static int b[][]=new int[1000][1111];
	static int m,n,x,y,sx,sy;
	static int tx,ty;
	static int top=1,rear=1,flag=0;;
	
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		 m=cin.nextInt();
		 n=cin.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=cin.nextInt();
				b[i][j]=0;
			}
		}
		 x=0;
		 y=0;
		P1 que[]=new P1[10000];
		for(int r=0;r<10000;r++)
		que[r]=new P1();
		
		que[rear].xx=x;
		que[rear].yy=y;
		que[rear].f=0;
		que[rear].sept=0;
		
		 sx=m-1;
		 sy=n-1;
		
		rear++;
		b[x][y]=1;
		while(top<rear)
		{
			for(int k=0;k<=3;k++)
			{
				tx=que[top].xx+fx[k][0];
				ty=que[top].yy+fx[k][1];
				if(tx<0||tx>m-1||ty<0||ty>n-1)
					continue;
				if(a[tx][ty]!=-1&&b[tx][ty]==0)
				{
					b[tx][ty]=-1;
					que[rear].f=top;
					que[rear].xx=tx;
					que[rear].yy=ty;
					
					que[rear].sept=que[top].sept+1;
					rear++;
				}
				if(tx==sx&&ty==sy)
				{
					flag=1;
					break;
				}	
			}
			if(flag==1)
			{
				break;
			}
			top++;//走下一个点
		}
		//System.out.println(que[rear-1].sept);
		int x1[]=new int[1000];
		int y1[]=new int[1111];
		int i=0;
		int j=0;
		rear-=1;
		while(que[rear].f!=0)
		{
			x1[i]=que[rear].xx;
			y1[j]=que[rear].yy;
			i++;
			j++;
			rear=que[rear].f;
		}
		
		x1[i]=0;y1[j]=0;
		  for(int q=i;q>0;q--)
		   {
			System.out.print(a[x1[q]][y1[q]]+"->");
			
		  }
		  System.out.println(a[x1[0]][y1[0]]);
		
	}
  public static class P1{
	  int xx;
	  int yy;
	  int f;
	  int sept;
	
  }

}
