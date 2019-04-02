package 贪心与动态规划;
import java.util.Scanner;

public class 递增最长子序列 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String s[]=cin.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		while(n-->0)
		{
			String str=cin.nextLine();
			char c[]=str.toCharArray();
			int dp[]=new int[c.length];
			for(int i=0;i<dp.length;i++)
				dp[i]=1;
			int min=1;
			for(int i=0;i<c.length;i++)
			{
				for(int j=i;j>=0;j--)
				{
					if(c[j]<c[i])
					{
						if(dp[i]<dp[j]+1)
							dp[i]=dp[j]+1;
						if(dp[i]>min)
							min=dp[i];
					}
				}
			}
			System.out.println(min);
		}
	}

}
