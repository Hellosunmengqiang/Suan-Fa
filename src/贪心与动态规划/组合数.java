package ̰���붯̬�滮;
import java.util.Scanner;

public class ����� {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		int a[]=new int[13];
		int b[]=new int[13];
		a[0]=9999999;
		for(int i=0;i<b.length;i++)
			b[i]=0;
		dfs(a,b,1,n,m);
		
	}
	public static void dfs(int a[],int b[],int step,int n,int m)
	{
		if(step==m+1)
		{
			for(int i=1;i<=m;i++)
				System.out.print(a[i]);
			System.out.println();
			return;//�ص����һ�ε���dfs�ĵط�
		}
		for(int i=n;i>0;i--)
		{
			if(b[i]==0&&a[step-1]>i)
			{
				
				a[step]=i;    //��i����Ͱ��Ϊstep��Ͱ����
				b[i]=1;         //��i����Ѿ��ù�Ϊ1
				dfs(a,b,step+1,n,m);
				b[i]=0;        //�ص�iΪ0��û���ù���
			}
		}
		
	}

}
