package ̰���붯̬�滮;
import java.util.Scanner;

public class ��̬�滮����{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext())
        {
        int m=cin.nextInt();
        int a[]=new int[m+1];
        int b[]=new int[m+1];
        for(int i=1;i<=m;i++)
        {
            a[i]=cin.nextInt();
            b[i]=1; 
        }
        int min=1;
        for(int i=1;i<=m;i++)
        {
            for(int j=i-1;j>0;j--)
            {
                if(a[j]>=a[i])
                {
                    if(b[i]<b[j]+1)
                        b[i]=b[j]+1;
                    if(b[i]>min)
                        min=b[i];
                }
            }
        }
        System.out.println(min);
        }
    }
 
}
