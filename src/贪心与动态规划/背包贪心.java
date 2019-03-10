package 贪心与动态规划;
public class 背包贪心 {
	public static void main(String[] args) {
		int n=3;
		float m=20;
		float p[]= {25,24,15};
		float w[]= {18,15,10};
		float x[]= {1,1,1};
		text(n,m,p,w,x);
		
	}
	public static void text(int n,float m,float[] p,float[] w,float[] x)
	{
		float v[]=new float[3];
		float sum=0;
		int index=0;
		for(int i=0;i<n;i++)
		{
			v[i]=p[i]/w[i];
		}
		
		
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(v[i]<v[j])
				 {
					 float t1=v[i];
					 v[i]=v[j];
					 v[j]=t1;
					 float t2=p[i];
					 p[i]=p[j];
					 p[j]=t2;
					 float t3=w[i];
					 w[i]=w[j];
					 w[j]=t3;
				 }
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 x[i]=0;
		 }
		 for(int i=0;i<n;i++)
		 {
			 index=i;
			 if(w[i]>m)
			 {
				 break;
			 }
			 x[i]=1;
			 m-=w[i];
		 }
		
			 if(index<n)
			 
				 x[index]=m/w[index];
			 
		 for(int i=0;i<=index;i++)
		 {
			 sum+=x[i]*p[i];
		 }
		 System.out.println(sum);
		 
		
	}
}
	







