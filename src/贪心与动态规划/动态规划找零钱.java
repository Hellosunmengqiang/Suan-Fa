package 贪心与动态规划;
import java.util.Scanner;

public class 动态规划找零钱 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a[]= {1,2,4,5};
		int dp[]=new int[n+1];
		
		for(int i=1;i<=n;i++)
			dp[i]=99999999;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i>=a[j])
				{
					dp[i]=Math.min(dp[i], dp[i-a[j]]+1);
				}
			}
		}
		System.out.println(dp[n]);
	}

}

