package ̰���붯̬�滮;
import java.util.Scanner;

public class Ѱ������� {
 
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
        	String s[]=cin.nextLine().split(" ");
        	char []c=s[0].toCharArray();
        	int n=Integer.parseInt(s[1]);
        	
        	for(int i=0,xi=0;i<c.length-n;i++)
        	{
        		
        		int max=-1;
        		 
        		for(int j=xi;j<=i+n;j++)//���±�xi��ʼѰ�����ֵ
        		{
        			if(max<c[j])
        			{
        				max=c[j];
        				xi=j;//��¼���ֵ���±�
        			}
        		}
        		xi++;//�����ֵ���±꿪ʼ ����һ�����ֵ
        		System.out.print(max-48);//���ǰn���е����ֵ
        	}
        	System.out.println();
            
        }
       
    }
 
}
