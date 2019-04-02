package 贪心与动态规划;
import java.util.Scanner;

public class 水池数目2 {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    static int n, m;
    static int[][] mp;
 
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
 
        while (t-- > 0) {
            n = cin.nextInt();
            m = cin.nextInt();
            mp = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mp[i][j] = cin.nextInt();
                }
            }
            int t1 = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mp[i][j] == 1) {
                        t1++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(t1);
        }
        cin.close();
    }
 
    private static void dfs(int x, int y) {
        mp[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (nx >= 0 && nx < n && ny >= 0 && ny < m
                    && mp[nx][ny] == 1)
                dfs(nx, ny);
        }
    }
}