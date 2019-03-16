package 深度与广度算法;
import java.util.Scanner;
public class 宝岛探险深度算法 {
    static int a[][]=new int[51][51];
	static int b[][]=new int[1100][1100];
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	static int m,n,x,y;
	
	static int sum=0;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
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
		     
		    b[x][y]=1;
		    a[x][y]=-1;//可以走过的路都为-1
		     dfs(x,y);
		     for(int i=0;i<m;i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		System.out.print(String.format("%2d", a[i][j]));
			    	}
			    	System.out.println();
			    }
		  
	}
	public static  void dfs(int x,int y)
	{

		int tx,ty;
		for(int k=0;k<=3;k++)
		{
			tx=x+fx[k][0];
			ty=y+fx[k][1];
			if(tx<0||tx>m-1||ty<0||ty>n-1)
				continue;
			if(a[tx][ty]>0&&b[tx][ty]==0)
			{
				b[tx][ty]=1;
				a[tx][ty]=-1;
				dfs(tx,ty);//往下一层递归
				
			}
		}	
		
	}
}
