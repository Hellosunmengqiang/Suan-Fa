package ����;

import java.util.Scanner;

public class ��ʲ���� {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int m=cin.nextInt();
			if(n%(m+1)==0)
				System.out.println("No");//���ֱذ�
			else
				System.out.println("Yes");
		}
	}
}
//��ʲ���ȣ�Bash Game����ֻ��һ��n����Ʒ�������������������Ʒ��ȡ�
//�涨ÿ������ȡһ�������ȡm�������ȡ���ߵ�ʤ��