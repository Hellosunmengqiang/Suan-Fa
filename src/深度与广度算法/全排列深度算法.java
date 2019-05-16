package 深度与广度算法;
import java.util.Scanner;

public class 全排列深度算法 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int m=cin.nextInt();
			int a[]=new int[n+1];
			int b[]=new int[n+1];
			int c[]=new int[n+1];
			for(int i=1;i<=n;i++)
				a[i]=cin.nextInt();
			int sum=0;
			dfs(n,1,m,a,b,c);
			
		}
	}

	private static void dfs(int n,int step, int m, int[] a, int[] b,int c[]) {
		// TODO 自动生成的方法存根
		if(step==m+1)
		{
			for(int i=1;i<=m;i++)
				System.out.print(c[i]+" ");
			System.out.println();
			return;
		}for(int i=1;i<=n;i++)
		{
			if(b[i]==0&&c[step-1]<a[i])//c[step-1]<a[i]
			{
				c[step]=a[i];
				b[i]=1;
				dfs(n,step+1,m,a,b,c);
				b[i]=0;
			}
		}
		
	}
	

}

