package dp;
import java.util.Scanner;

public class dp2 {
    static long[] a = new long[20];
   
    static long[][] dp = new long[20][10];

    
    static long dfs(int pos, int pre, int sta, boolean limit) {
       
        if (pos == -1) {
            return 1;
        }
        //记忆化
        if (!limit && dp[pos][sta] != -1) {
            return dp[pos][sta];
        }
        //当前位枚举上界
        long up = limit ? a[pos] : 9;
        long tmp = 0;
        for (int i = 0; i <= up; i++) {
            if (pre>i) {
                continue;
            }
           
            
            if (pre<=i) {
                tmp += dfs(pos - 1, i, 1, limit && i == a[pos]);
            } else {
                tmp += dfs(pos - 1, i, 0, limit && i == a[pos]);
            }
        }
        if (!limit) {
            dp[pos][sta] = tmp;
        }
        return tmp;
    }

    //分解数位
    static long solve(long r) {
        int pos = 0;
        while (r > 0) {
            a[pos++] = (r % 10);
            r /= 10;
        }
        //从高位枚举
        return dfs(pos - 1, -1, 0, true);
    }

    public static void main(String[] args) {
         long r;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
        	r=cin.nextLong();
            if(1+r==0){
                break;
            }
            for (int i = 0; i < 20; i++) {
                dp[i][0] = dp[i][1] = -1;
            }
            System.out.println(solve(r) - solve(0));
        }
    }
}
