package ̰���붯̬�滮;
import java.util.Scanner;
public class ������̬�滮{//���ɲ��
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int T = in.nextInt();//��ʱ�䣬������
            int M = in.nextInt();//��Ŀ
           
            int []w=new int[M+1];
            int []v=new int[M+1];
            for(int i=1;i<=M;i++){
               w[i] = in.nextInt();
               v[i] = in.nextInt();
            }
            int[][] dp = new int[M+1][T+1];
            for(int i=0;i<=T;i++){
                dp[0][i]=0;
            }
            for(int i=1;i<=M;i++){
                for(int j=0;j<=T;j++){
                    if(j<w[i])
                        dp[i][j] = dp[i-1][j];
                    else
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
                }
            }
            System.out.println(dp[M][T]);
        }
    }
}