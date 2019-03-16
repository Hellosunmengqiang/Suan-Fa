package 图论;

import java.util.Scanner;

public class 最少转机广度算法 {
	static int[][]a=new int[51][51];
	static int b[]=new int[51];
	static int m,n,s,e,c,d;
	static int flag=0;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		   m=cin.nextInt();
		   n=cin.nextInt();
		   s=cin.nextInt();
		   e=cin.nextInt();
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
			   a[c][d]=1;
			   a[d][c]=1;
		   }
		   int top=1;
		   int rear=1;
		   int cur;
		   zui que[]=new zui[m];
		   for(int q=0;q<=m;q++)
			   que[q]=new zui();
		   
		   que[rear].x=s;
		   que[rear].step=0;
            b[s]=1;
            rear++;
            while(top<rear)
            {
            	cur=que[top].x;
            	for(int k=1;k<=m;k++)
            	{
            		if(a[cur][k]!=99999999&&b[k]==0)
            		{
            			b[k]=1;
            			que[rear].x=k;
            			que[rear].step=que[top].step+1;
            			rear++;
            		}
            		if(que[rear-1].x==e)
            		{
            			flag=1;
            			break;
            		}
            	}
            	if(flag==1)
            		break;
            	top++;
            }if(que[rear-1].step>0)
            System.out.println(que[rear-1].step);
            else
            	System.out.println("Connot reach");
		   
	}
	public static class zui{
		int step;
		int x;
	}

}
