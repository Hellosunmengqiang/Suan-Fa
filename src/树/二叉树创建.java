package 树;
import java.util.*;

public class 二叉树创建 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=cin.nextInt();
		BinTree binTree=new BinTree();
		
		binTree.createTree(a);
		binTree.preorder(binTree.getRoot()); 
		System.out.println();
		binTree.inorder(binTree.getRoot()); 
		System.out.println();
		binTree.afterorder(binTree.getRoot()); 
		System.out.println();
		}
	}
}
 class BinTree {
	private BinTree lChild;//左孩子
	private BinTree rChild;//右孩子
	private BinTree root;//根节点
	private Object data; //数据域
	private List<BinTree> datas;//存储所有的节点
	public BinTree(BinTree lChild, BinTree rChild, Object data) {
		super();
		this.lChild = lChild;
		this.rChild = rChild;
		this.data = data;
	}
	public BinTree(Object data) {
		this(null, null, data);
	}
	public BinTree() {
		super();
	}
	
	public void createTree(int[] a){
		datas=new ArrayList<BinTree>();
		for (Object object : a) {
			datas.add(new BinTree(object));
		}
		root=datas.get(0);//将第一个作为根节点
		for (int i = 0; i < a.length/2; i++) {
			datas.get(i).lChild=datas.get(i*2+1);
			if(i*2+2<datas.size()){//避免偶数的时候 下标越界
				datas.get(i).rChild=datas.get(i*2+2);
			}
		}
	}
	public void preorder(BinTree root){
		if(root!=null){
			System.out.print(root.getData()+" ");
			preorder(root.lChild);
			preorder(root.rChild);
		}	
	}
	public void inorder(BinTree root){
		if(root!=null){
			inorder(root.lChild);
			System.out.print(root.getData()+" ");
			inorder(root.rChild);
		}	
	}
	public void afterorder(BinTree root){
		if(root!=null){
			afterorder(root.lChild);
			afterorder(root.rChild);
			System.out.print(root.getData()+" ");
		}	
	}
	public Object getData() {
		return data;
	}
	public BinTree getRoot() {
		return root;
	}
}
 
 
 
 