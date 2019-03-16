package 深度与广度算法;

import java.util.Scanner;

public class 宝岛探险广度算法{
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	static int a[][]=new int[50][50];
	static int b[][]=new int[1000][1111];
	static int m,n,x,y,sx,sy;
	static int tx,ty;
	static int top=0,rear=0,sum=0;;
	
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		 m=cin.nextInt();
		 n=cin.nextInt();
		 x=cin.nextInt();
		 y=cin.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=cin.nextInt();
				b[i][j]=0;
			}
		}
		 
		P1 que[]=new P1[10000];
		for(int r=0;r<1000;r++)
		que[r]=new P1();
		
		que[rear].xx=x;
		que[rear].yy=y;
	
	
		rear++;
		b[x][y]=1;
		sum=1;
		while(top<rear)
		{
			for(int k=0;k<=3;k++)
			{
				tx=que[top].xx+fx[k][0];
				ty=que[top].yy+fx[k][1];
				if(tx<0||tx>m-1||ty<0||ty>n-1)
					continue;
				if(a[tx][ty]>0&&b[tx][ty]==0)
				{
					b[tx][ty]=1;
					sum++;
					que[rear].xx=tx;
					que[rear].yy=ty;
				
					rear++;
				}
			}
			
			top++;//走下一个点
		}
		System.out.println(sum);
		
	}
  public static class P1{
	  int xx;
	  int yy;
  }

}
