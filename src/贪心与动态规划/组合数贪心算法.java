package ̰���붯̬�滮;

import java.util.ArrayList;
import java.util.Scanner;

public class �����̰���㷨 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		String str="";
		int n=cin.nextInt();
		ArrayList<String>  list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(cin.next());
		}
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if((list.get(i)+list.get(j)).compareTo(list.get(j)+list.get(i))<0)
				{
					String as=list.get(i);
					list.set(i, list.get(j));
					list.set(j, as);
				}
			}
		}
		for(int i=0;i<list.size();i++)
		{
			str+=list.get(i);
		}
		System.out.println(str);
		
	}

}

/*���磺n=3ʱ��3������13��312��343�����ɵ��������Ϊ34331213�� 
���磺n=4ʱ��4������7��13��4��246�����ɵ��������Ϊ7424613�� */







