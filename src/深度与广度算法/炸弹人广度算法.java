package 深度与广度算法;
import java.util.Scanner;

public class 炸弹人广度算法 {
	static char a[][]=new char[51][51];
	static int b[][]=new int[51][51];
	static int m,n,sx,sy,ex,ey;
	static int top=0,rear=0;
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	static int flag=0;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String s[]=cin.nextLine().split(" ");
		
		m=Integer.parseInt(s[0]);
		n=Integer.parseInt(s[1]);
		sx=Integer.parseInt(s[2]);
		sy=Integer.parseInt(s[3]);
		
		for(int i=0;i<m;i++)
			a[i]=cin.nextLine().toCharArray();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=0;
			}
		}
		G que[]=new G[2501];
		for(int i=0;i<2501;i++)
			que[i]=new G();
		
		que[rear].xx=sx;
		que[rear].yy=sy;
		b[sx][sy]=1;
		int max=getnum(sx, sy);
		ex=sx;
		ey=sy;
		int sum;
		rear++;
		
		int tx,ty;
		while(top<rear)
		{
		for(int k=0;k<=3;k++)
		{
			tx=que[top].xx+fx[k][0];
			ty=que[top].yy+fx[k][1];
			if(tx<0||tx>m-1||ty<0||ty>n-1)
				continue;
			if(a[tx][ty]=='.'&&b[tx][ty]==0)
			{
				b[tx][ty]=1;
				que[rear].xx=tx;
				que[rear].yy=ty;
				
				rear++;
				sum=getnum(tx, ty);
				if(sum>max)
				{
					max=sum;
					ex=tx;
					ey=ty;
				}
			}
		}
		top++;
		}
		System.out.println("炸弹放置处点:<"+ex+","+ey+">");
		System.out.println("消灭的敌人最多个数："+max);
	}
	public static class G{
		int xx;
		int yy;	
		
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














