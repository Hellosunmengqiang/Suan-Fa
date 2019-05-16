package 树;
import java.util.Scanner;
public class 最小生成树 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int m=cin.nextInt();
		int n=cin.nextInt();
		int f[]=new int[n+1];
		int count=0;
		en a[]=new en[n+1];
		for(int i=0;i<=n;i++)
			a[i]=new en();
		for(int i=1;i<=n;i++)
		{
			a[i].u=cin.nextInt();
			a[i].v=cin.nextInt();
			a[i].w=cin.nextInt();
		}
		int sum=0;
		quick(a,1,n);
		for(int i=1;i<=m;i++)
			f[i]=i;
		for(int i=1;i<=n;i++)
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
