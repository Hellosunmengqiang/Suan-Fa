package 深度与广度算法;
import java.util.Scanner;
public class 迷宫问题 {
    static int a[][]=new int[10][10];
	static int b[][]=new int[10][10];
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	static int m;
	static int n;
	static int min=99999999;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
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
		    int sx=cin.nextInt();
		    int sy=cin.nextInt();
		    int ex=cin.nextInt();
		    int ey=cin.nextInt();
		    b[sx][sy]=1;
		    
		     dfs(sx,sy,ex,ey,0);
		     System.out.println(min);
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
		for(int k=0;k<=1;k++)
		{
			tx=x+fx[k][0];
			ty=y+fx[k][1];
			if(tx<0||tx>m-1||ty<0||ty>n-1)
				continue;
			if(a[tx][ty]==0&&b[tx][ty]==0)
			{
				b[tx][ty]=1;
				System.out.println(tx+" "+ty);  //搜索过程
				dfs(tx,ty,p,q,sum+1);//往下一层递归
				b[tx][ty]=0;//取消标记，回到上一层
				
			}
		}	
		
	}
}
