package 深度与广度算法;

import java.util.Scanner;

public class 全排列深度算法 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a[]=new int[13];
		int b[]=new int[13];
		for(int i=0;i<b.length;i++)
			b[i]=0;
		dfs(a,b,1,n);
		
	}
	public static void dfs(int a[],int b[],int step,int n)
	{
		if(step==n+1)
		{
			for(int i=1;i<=n;i++)
				System.out.print(a[i]);
			System.out.println();
			return;//回到最近一次调用dfs的地方
		}
		for(int i=1;i<=n;i++)
		{
			if(b[i]==0)
			{
				a[step]=i;    //把i放在桶号为step的桶里面
				b[i]=1;         //把i标记已经用过为1
				dfs(a,b,step+1,n);
				b[i]=0;        //回调i为0，没有用过；
			}
		}
		
	}

}
