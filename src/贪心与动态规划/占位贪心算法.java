package ̰���붯̬�滮;
import java.util.ArrayList;
import java.util.Scanner;
public class ռλ̰���㷨 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int start[]=new int[5];
		int end[]=new int[5];
		for(int i=0;i<start.length;i++)
		{
			start[i]=cin.nextInt();
			
		}
		for(int i=0;i<start.length;i++)
		{
		
			end[i]=cin.nextInt();
		}
		System.out.println(start[0]+" "+end[0]);
		ArrayList<Integer> list=array(start,end);
		int index;
		for(int i=0;i<list.size();i++)
		{
			index=list.get(i);
			System.out.println(start[index]+" "+end[index]);
		}	
	}
public static ArrayList<Integer> array(int s[],int e[])
	
	{
		int n=s.length;
		int a=e[0];
	   ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(s[i]>=a)
			{
				list.add(i);//�ص���Ѱ��iλ�ã�����list�У�
				a=e[i];
			}
		}
		return list;
	}
}/*����n����ļ���e={1��2������n}������ÿ�����Ҫ��ʹ��ͬһ��Դ�����ݽ��᳡�ȣ�
����ͬһʱ����ֻ��һ�����ʹ����һ��Դ��ÿ���i����һ��Ҫ��ʹ�ø���Դ����ʼʱ��
si��һ������ʱ��fi,��si< fi�����ѡ���˻i�������ڰ뿪ʱ������[si��fi]��ռ����Դ��
������[si��fi]������[sj��fj]���ཻ����ƻi��j�����ݵġ�Ҳ����˵����si��fi��sj��fjʱ��
�i��j���ݡ�������������Ҫ�������Ļ������ѡ���������ݻ�Ӽ��ϡ�
*/






