package 贪心与动态规划;
import java.util.Scanner;

public class 背包贪心 {
       public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        while(n-->0)
        {
            int nn=cin.nextInt();
            int sum=cin.nextInt();
            int dwj[]=new int[nn];
            int wight[]=new int[nn];
            for(int i=0;i<nn;i++)
            {
                dwj[i]=cin.nextInt();
                wight[i]=cin.nextInt();
            }
             
            for(int i=0;i<nn-1;i++)
            {
                for(int j=i+1;j<nn;j++)
                {
                    if(dwj[i]<dwj[j])
                    {
                        int t=dwj[i];
                         dwj[i]=dwj[j];
                         dwj[j]=t;
                         int tt=wight[i];
                           wight[i]=wight[j];
                           wight[j]=tt;
                    }
                }
            }
            /*for(int i=0;i<nn;i++)
            {
                System.out.println(dwj[i]+" "+wight[i]);
            }*/
            int index=0,qw=0,as=0;
            for(int i=0;i<nn;i++)
            {
                if(sum<=0)break;
                index=i;
                if(wight[i]<=sum)
                {
                    sum=sum-wight[i];
                }
                else
                {
                    qw=sum;
                    break;
                }
                 
 
            }
            if(qw==0)
            {
            for(int i=0;i<=index;i++)
            {
                as+=dwj[i]*wight[i];
            }
            }
            else
            {
                for(int i=0;i<index;i++)
                {
                    as+=dwj[i]*wight[i];
                }
                qw=qw*dwj[index];
            }
             
            System.out.println(as+qw);
             
        }
    }
}







