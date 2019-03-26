package 贪心与动态规划;
import java.util.Scanner;
public class 动态规划找零钱2 {
    public static void main(String[] arg) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] dp = new int[30000];
        int[] numbers = new int[n];
        int[] kinds = new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=cin.nextInt();
            kinds[i]=cin.nextInt();
        }
        int money = cin.nextInt();
        for(int i=1;i<=money;i++)
        {
            dp[i]=1000000;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=kinds[i];j++)
            {
                for(int k=money;k>=numbers[i];k--)
                {
                	
                    dp[k]=Math.min(dp[k],dp[k-numbers[i]]+1);
                }
            }
        }
     System.out.println(dp[money]<money?dp[money]:-1);
    }
}/*
4
1 6
2 6
4 6
5 6
33
7*/