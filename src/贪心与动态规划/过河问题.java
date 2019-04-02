package 贪心与动态规划;
import java.util.Arrays;
import java.util.Scanner;
 
public class 过河问题{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            int time = 0;
            int n = cin.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=cin.nextInt();
            }
            Arrays.sort(a);
            while(n>3){
                time += Math.min(a[0]+2*a[1]+a[n-1],2*a[0]+a[n-1]+a[n-2]);
                n-=2;
            }
            if(n==1)
                time += a[0];
            if(n==2)
                time += a[1];
            if(n==3)
                time += a[0]+a[1]+a[2];
            System.out.println(time);
        }
    }
}
 
