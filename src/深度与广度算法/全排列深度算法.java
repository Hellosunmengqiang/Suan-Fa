package ��������㷨;

import java.util.Scanner;

public class ȫ��������㷨 {
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
			return;//�ص����һ�ε���dfs�ĵط�
		}
		for(int i=1;i<=n;i++)
		{
			if(b[i]==0)
			{
				a[step]=i;    //��i����Ͱ��Ϊstep��Ͱ����
				b[i]=1;         //��i����Ѿ��ù�Ϊ1
				dfs(a,b,step+1,n);
				b[i]=0;        //�ص�iΪ0��û���ù���
			}
		}
		
	}

}
