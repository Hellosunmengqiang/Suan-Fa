package 典型题目;
import java.util.Scanner;
public class 数的划分 {//c++写
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{			
		int n=cin.nextInt();
		if(n<=0)break;
		int sum=0;
		int k=cin.nextInt();
		sum=get(n,k);
		/*for(int i=1;i<=n;i++)
		{
			sum+=get(n,i);
		}*/
		System.out.println(sum);
		}	
	}
	public static int get(int n,int k)
	{
		
		if(n==0||n<k||k==0)return 0;
		if(n==1||n==k)return 1;
		
		return get(n-k,k)+get(n-1,k-1);
	}
}
