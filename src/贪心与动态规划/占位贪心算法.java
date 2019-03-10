package 贪心与动态规划;
import java.util.ArrayList;
import java.util.Scanner;
public class 占位贪心算法 {
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
				list.add(i);//重点是寻找i位置，存入list中；
				a=e[i];
			}
		}
		return list;
	}
}/*设有n个活动的集合e={1，2，…，n}，其中每个活动都要求使用同一资源，如演讲会场等，
而在同一时间内只有一个活动能使用这一资源。每个活动i都有一个要求使用该资源的起始时间
si和一个结束时间fi,且si< fi。如果选择了活动i，则它在半开时间区间[si，fi]内占用资源。
若区间[si，fi]与区间[sj，fj]不相交，则称活动i与活动j是相容的。也就是说，当si≥fi或sj≥fj时，
活动i与活动j相容。活动安排问题就是要在所给的活动集合中选出最大的相容活动子集合。
*/






