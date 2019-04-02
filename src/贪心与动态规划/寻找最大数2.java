package 贪心与动态规划;
import java.util.Scanner;
public class 寻找最大数2 {
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
	      String s[]=cin.nextLine().split(" ");
	      char c[]=s[0].toCharArray();
	      int a=Integer.parseInt(s[1]);
	      
	      for(int i=0;i<c.length&&a>0;i++)
	      {
	    	  int t=i;
	    	  char temp=c[i];
	    	  for(int j=i+1;j<=i+a&&j<c.length;j++)//寻找每次的最大数
	    	  {
	    		  if(c[j]>temp)
	    		  {
	    			  temp=c[j];
	    			  t=j;//记录下标位置
	    		  }
	    	  }
	    	  for(int k=t;k>i;k--)
	    	  {
	    		  c[k]=c[k-1];//依次替换
	    		  a--;//记录替换的次数
	    	  }
	    	  c[i]=temp;
	      }
	      System.out.println(c);
		 
		}   
		  
	}

}
