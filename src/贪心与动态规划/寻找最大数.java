package 贪心与动态规划;
import java.util.Scanner;

public class 寻找最大数 {
 
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
        	String s[]=cin.nextLine().split(" ");
        	char []c=s[0].toCharArray();
        	int n=Integer.parseInt(s[1]);
        	
        	for(int i=0,xi=0;i<c.length-n;i++)
        	{
        		
        		int max=-1;
        		 
        		for(int j=xi;j<=i+n;j++)//从下标xi开始寻找最大值
        		{
        			if(max<c[j])
        			{
        				max=c[j];
        				xi=j;//记录最大值的下标
        			}
        		}
        		xi++;//从最大值的下标开始 找下一个最大值
        		System.out.print(max-48);//输出前n个中的最大值
        	}
        	System.out.println();
            
        }
       
    }
 
}
