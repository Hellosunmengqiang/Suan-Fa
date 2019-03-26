package 贪心与动态规划;
import java.util.Scanner;

public class 动态子序列2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String s[]=in.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		while(n-->0)
		{
		String a=in.nextLine();
		String b=in.nextLine();
		int alen=a.length();
		int blen=b.length();
		int [][]dp=new int[alen+1][blen+1];
		
		for(int i=1;i<=alen;i++){
			for(int j=1;j<=blen;j++){
				if(a.charAt(i-1)==b.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[alen][blen]);
	
		}
	}
}