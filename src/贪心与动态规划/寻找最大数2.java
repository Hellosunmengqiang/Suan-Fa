package ̰���붯̬�滮;
import java.util.Scanner;
public class Ѱ�������2 {
	
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
	    	  for(int j=i+1;j<=i+a&&j<c.length;j++)//Ѱ��ÿ�ε������
	    	  {
	    		  if(c[j]>temp)
	    		  {
	    			  temp=c[j];
	    			  t=j;//��¼�±�λ��
	    		  }
	    	  }
	    	  for(int k=t;k>i;k--)
	    	  {
	    		  c[k]=c[k-1];//�����滻
	    		  a--;//��¼�滻�Ĵ���
	    	  }
	    	  c[i]=temp;
	      }
	      System.out.println(c);
		 
		}   
		  
	}

}
