package 贪心与动态规划;
import java.util.Scanner;
public class 动态子序列{
    static int[][] dp= new int[200][200];
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
        String cs1 = cin.nextLine();
        String cs2 = cin.nextLine();
        
        get(cs1, cs1.length(), cs2, cs2.length());
    }

    private static void get(String cs1, int length1, String cs2, int length2) {
        for (int i = 0; i <=length1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <=length2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++)
            {
                if(cs1.charAt(i-1)==cs2.charAt(j-1))
                	
                	dp[i][j]=dp[i-1][j-1];
                else
                	
                	dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+1;
            }
        }
        System.out.println(dp[length1][length2]);
    }

}

