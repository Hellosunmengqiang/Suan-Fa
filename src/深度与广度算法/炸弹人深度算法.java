package 深度与广度算法;

import java.util.Scanner;

public class 炸弹人深度算法 {
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	static char a[][]=new char[1111][1111];
	static int  b[][]=new int [1111][1111];
	static int m,n,x,y,ex,ey,max=0;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String as[]=cin.nextLine().split(" ");
		 m=Integer.parseInt(as[0]);
		n=Integer.parseInt(as[1]);
	    x=Integer.parseInt(as[2]);
	     y=Integer.parseInt(as[3]);
		 for(int i=0;i<m;i++)
		 {
			 a[i]=cin.nextLine().toCharArray();
		 }
		 
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
				 b[i][j]=0;
		 }
		 dfs(x,y);
		 System.out.println("所在的位置："+"<"+ex+","+ey+">");
		 System.out.println("消灭敌人最多的个数："+max);
		
		
	}
	public static void dfs(int x,int y)
	{
		int sum = 0;
		int tx,ty;
		sum=getnum(x,y);
		if(sum>max)
		{
			max=sum;
			ex=x;
			ey=y;
		}
		for(int k=0;k<=3;k++)
		{
			tx=x+fx[k][0];
			ty=y+fx[k][1];
			if(tx<0||tx>m-1||ty<0||ty>n-1)
				continue;
			if(a[tx][ty]=='.'&&b[tx][ty]==0)
			{
				b[tx][ty]=1;
				dfs(tx,ty);
			}
		}
		return;
	}
	public static int getnum(int x,int y)
	{
		int sum=0;
		int ii=0,jj=0;
		ii=x;
		jj=y;
		while(a[x][y]!='#')
		{
			if(a[x][y]=='G')
			  sum++;
			  x--;
			if(x>=m||y>=n||x<0||y<0)
					break;
		}
		x=ii;
		y=jj;
		while(a[x][y]!='#')
		{
			if(a[x][y]=='G')
			sum++;
		    x++;
		 if(x>=m||y>=n||x<0||y<0)
					break;
		}
		x=ii;
		y=jj;
		while(a[x][y]!='#')
		{
		if(a[x][y]=='G')
			sum++;
			y--;
		if(x>=m||y>=n||x<0||y<0)
					break;
		}
		x=ii;
		y=jj;
		while(a[x][y]!='#')
		{
			if(a[x][y]=='G')
			   sum++;
				y++;
			if(x>=m||y>=n||x<0||y<0)
					break;
		}
		return sum;
		
	}
}







