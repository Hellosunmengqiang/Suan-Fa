import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class list2 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner cin = new Scanner(System.in);
	List<Integer> list=new ArrayList<Integer>();
	int n=cin.nextInt();
	while(n-->0) {
		list.add(cin.nextInt());
	}
	int []a=new int[10];
	for(int i=0;i<10;i++)
		a[i]=cin.nextInt();
	Arrays.sort(a);
	System.out.println(Arrays.toString(a).substring(1, a.length).replaceAll(",", ""));
	for(Integer i:a)
		System.out.print(i);
	System.out.println();
	Collections.sort(list, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}
	});
	for(Integer i:list)
		System.out.print(i+" ");
}
}
