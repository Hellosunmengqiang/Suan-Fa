package ����;

import java.util.Scanner;

public class ��ķ���� {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int x=cin.nextInt();
			while(n-->1)
			{
				int m=cin.nextInt();
				x^=m;
				
			}
			if(x%2==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
//��ķ���ȣ�Nimm Game���������Ѹ����ɸ���Ʒ��������������ĳһ��ȡ��������Ʒ��
//�涨ÿ������ȡһ�������߲��ޣ����ȡ���ߵ�ʤ��