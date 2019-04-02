package 贪心与动态规划;
import java.util.Scanner;

public class 回文字符串 {
	public static void main(String[] args) {
		Scanner cin=new  Scanner(System.in);
		String s[]=cin.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		while(n-->0)
		{
			String str=cin.nextLine();
			char c[]=str.toCharArray();
			char cc[]=new char[c.length];
			int t=c.length-1;
			for(int i=0;i<c.length;i++)
			{
				cc[t]=c[i];
				t--;
			}
			int dp[][]=new int[1001][1001];
			
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<cc.length;j++)
				{
					if(c[i]==cc[j])
						dp[i+1][j+1]=dp[i][j]+1;
					else
						dp[i+1][j+1]= Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
			System.out.println(c.length-dp[c.length][cc.length]);
		}
	}

}
