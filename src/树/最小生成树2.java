package 树;
import java.util.Scanner;
public class 最小生成树2 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
		int m=cin.nextInt();
		int f[]=new int[51];	
		int count=0;
		en a[]=new en[2501];
		for(int i=0;i<2501;i++)
			a[i]=new en();
		int t=1,as=0;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				int p=cin.nextInt();
				if(p==0)
					continue;
				else
				{
					a[t].u=i;
					a[t].v=j;
					a[t].w=p;
					t++;
					as++;
				}
			}
		}		
		int sum=0;
		quick(a,1,as);
		for(int i=1;i<=m;i++)
			f[i]=i;
		for(int i=1;i<=as;i++)
		{		
			if(mery(a[i].u,a[i].v,f))
				{
				count++;
				sum+=a[i].w;
				}
			if(count==m-1)
				break;
			}
			
		System.out.println(sum);
		}
	}
	private static boolean mery(int u, int v,int f[]) {
		// TODO 自动生成的方法存根
		int x,y;
		x=getf(u,f);
		y=getf(v,f);
		if(x!=y)
			{
			f[y]=x; return true;
			}
		return false;
	}
	private static int getf(int u,int f[]) {
		// TODO 自动生成的方法存根
		return u==f[u]?u:(f[u]=getf(f[u],f));
	}
	private static void quick(en[] a, int left, int right) {
		// TODO 自动生成的方法存根
		int i;
		int j;
		if(left>right)
			return;
		en t;
		i=left;
		j=right;
		while(i!=j)
		{
			while(a[j].w>=a[left].w&&i<j)
				j--;
			while(a[i].w<=a[left].w&&i<j)
				i++;
			if(i<j)
			{
			     t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}	
		}
		t=a[left];
		a[left]=a[i];
		a[i]=t;
		quick(a,left,i-1);
		quick(a,i+1,right);		
		return;
	}
	private static class en{
		int u;
		int v;
		int w;		
	}
}
