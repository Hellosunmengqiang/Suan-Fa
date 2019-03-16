package 深度与广度算法;
import java.util.Scanner;
public class 迷宫问题 {
    static int a[][]=new int[11][11];
	static int b[][]=new int[11][11];
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	static int m;
	static int n;
	static int min=99999999;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cin=new Scanner(System.in);
		     m=cin.nextInt();
		     n=cin.nextInt();

		    for(int i=1;i<=m;i++)
		    {
		    	for(int j=1;j<=n;j++)
		    	{
		    		a[i][j]=cin.nextInt();
		    		b[i][j]=0;
		    	}
		    }
		    int sx=cin.nextInt();
		    int sy=cin.nextInt();
		    int ex=cin.nextInt();
		    int ey=cin.nextInt();
		    b[sx][sy]=1;
		    
		     dfs(sx,sy,ex,ey,0);
		     if(min<99999999)
		     System.out.println(min);
		     else
		    	 System.out.println("No Way!");
	}
	public static  void dfs(int x,int y,int p,int q,int sum)
	{

		
		if(x==p&&y==q)
		{
			if(sum<min)
				min=sum;
		
		 return;  //退出递归
		}
		int tx,ty;
		for(int k=0;k<=3;k++)
		{
			tx=x+fx[k][0];
			ty=y+fx[k][1];
			if(tx<1||tx>m||ty<1||ty>n)
				continue;
			if(a[tx][ty]==0&&b[tx][ty]==0)
			{
				b[tx][ty]=1;
				dfs(tx,ty,p,q,sum+1);//往下一层递归
				b[tx][ty]=0;//取消标记，回到上一层
				
			}
		}	
		
	}
}
