package ����;

import java.util.Arrays;
import java.util.Scanner;

public class �������� {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  a[i]=cin.nextInt();
			  
		  }
		  for(int i=1;i<n;i++)
		  {
			  int j=i-1;
	          int t=a[i];   //t����Ҫ�������
	          while(j>=0&&a[j]>=t)
	          {
	        	  a[j+1]=a[j];
	        	  j--;
	          }
	          a[j+1]=t;
		  }
		  System.out.println(Arrays.toString(a));
	}

}
