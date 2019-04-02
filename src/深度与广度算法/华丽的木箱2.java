package 深度与广度算法;

import java.util.Scanner;

public class 华丽的木箱2 {
	static int fx[][]= {{0,1},{1,0},{0,-1},{-1,0}};
	
     public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		   while(cin.hasNext())
		   {
			   int n=cin.nextInt();
			   int a[][]=new int[n+1][n+1];
			   int b[][]=new int[n+1][n+1];
			   for(int i=0;i<n;i++)
			   {
				   for(int j=0;j<n;j++)
				   {
					   a[i][j]=cin.nextInt();
				   }
			   }
			   System.out.print(a[0][0]+" ");
			   int top=1,rear=1;
			   huali que[]=new huali[n*n+1];
			   for(int i=0;i<n*n+1;i++)
				   que[i]=new huali();
			   que[rear].x=0;
			   que[rear].y=0;
			   b[0][0]=1;
			   rear++;
			   int tx,ty;
			   int flag=0;
			   while(top<rear)
			   {
				   for(int k=0;k<=3;k++)
				   {
					   tx=que[top].x+fx[k][0];
					   ty=que[top].y+fx[k][1];
					   if(tx>=0&&tx<n&&ty>=0&&ty<n&&b[tx][ty]==0)
					   {
						   que[rear].x=tx;
						   que[rear].y=ty;
						   b[tx][ty]=1;
						   System.out.print(a[tx][ty]+" ");
						   rear++;
					   }
					   if(tx==n-1&&ty==n-1)
					   {
						   flag=1;
						   break;
					   }
				   }
				   if(flag==1)
					   break;
				   top++;
			   }
			   
			   System.out.println();
		   }
		   
	}
     public static class huali{
    	 int x;
    	 int y;
    	 public huali()
    	 {
  
    	 }
     }
}
