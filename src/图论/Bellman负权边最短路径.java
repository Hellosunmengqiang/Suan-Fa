package ͼ��;

import java.util.Scanner;

public class Bellman��Ȩ�����·�� {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int dis[]=new int[22];
		int u[]=new int[22];
		int v[]=new int[22];
		int w[]=new int[22];
		
		int m=cin.nextInt();
		int n=cin.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			u[i]=cin.nextInt();
			v[i]=cin.nextInt();
			w[i]=cin.nextInt();
		}
		for(int i=1;i<=m;i++)
			dis[i]=99999999;
		dis[2]=0;//��ʼ��2�ŵ㣬ֻ��������ͼ
		for(int k=1;k<=m-1;k++)
			for(int i=1;i<=n;i++)//ֻ�ܴ������еı�
			{
				if(dis[v[i]]>dis[u[i]]+w[i])
					dis[v[i]]=dis[u[i]]+w[i];
			}
		for(int i=1;i<=m;i++)
			System.out.print(dis[i]+" ");
	}
}
