import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		Queue<Integer> queue=new PriorityQueue<Integer>(n,Q);
		while(n-->0)
		{
		
			queue.add(cin.nextInt());
		 }
		System.out.print("�������ȼ����У�");
		for(Integer e:queue)
			System.out.print(e+" ");
		System.out.print("\n����ɾ�����ȼ������е�Ԫ�أ�");
		while(!queue.isEmpty())
		{
			System.out.print(queue.remove()+" ");
		}
		
	}
	private static  Comparator<Integer> Q = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}
	};
    
}
