package ����;

import java.util.Scanner;

public class �������� {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int m=cin.nextInt();
			int n=cin.nextInt();
			if(m<n)
			{
				m=m^n;
				n=m^n;
				m=m^n;
			}
			int k=m-n;
			int t=(int) (k*(1+Math.sqrt(5))/2);
			if(t==n)
				System.out.println("0");
			else
				System.out.println("1");
			
		}
	}

}
//�������ȣ�Wythoff Game���������Ѹ����ɸ���Ʒ��������������ĳһ�ѻ�ͬʱ��������ȡͬ�������Ʒ��
//�涨ÿ������ȡһ�������߲��ޣ����ȡ���ߵ�ʤ��