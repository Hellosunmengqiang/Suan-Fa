package ͼ��;
import java.util.Scanner;

public class Dijkstra��Դ���·�� {
	static int a[][]=new int[50][50];
	static int dis[]=new int[50];
	static int b[]=new int[50];
	static int m,n,c,d,e,min,u;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		m=cin.nextInt();
		n=cin.nextInt();
		for(int i=1;i<=m;i++)
			for(int j=1;j<=m;j++)
			{
				if(i==j)
					a[i][j]=0;
				else
					a[i][j]=99999999;
			}
		for(int i=1;i<=n;i++)
		{
			c=cin.nextInt();
			d=cin.nextInt();
			e=cin.nextInt();
			a[c][d]=e;
			//a[d][c]=e;
			
		}
		for(int i=1;i<=m;i++)
			dis[i]=a[2][i];  //��ʼ��2(x)�ŵ���������ľ���
		for(int i=1;i<=m;i++)
			b[i]=0;
		
		b[1]=1;
		
		for(int i=1;i<=m-1;i++)
		{
			min=999999999;
			for(int j=1;j<=m;j++)//�����ҵ�����x������ĵ�,����������������ɳ�
			{
				if(b[j]==0&&dis[j]<min)
				{
					min=dis[j];
					u=j;
				}
			}
			b[u]=1;
			for(int k=1;k<=m;k++)//����������ĵ��滻������Զ�ĵ��ֵ
			{
				if(a[u][k]<999999999)
				{
					if(dis[k]>dis[u]+a[u][k])
						dis[k]=dis[u]+a[u][k];
				}
			}
		}
		for(int i=1;i<=m;i++)
			System.out.print(dis[i]+" ");
	}

}//��Զ���·����������ͼ���ҳ�ָ��һ���㵽������ķ������ﵽ����㵽����������·��







