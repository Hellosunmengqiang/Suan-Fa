package ��;
import java.util.*;

public class ���������� {
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
	private BinTree lChild;//����
	private BinTree rChild;//�Һ���
	private BinTree root;//���ڵ�
	private Object data; //������
	private List<BinTree> datas;//�洢���еĽڵ�
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
		root=datas.get(0);//����һ����Ϊ���ڵ�
		for (int i = 0; i < a.length/2; i++) {
			datas.get(i).lChild=datas.get(i*2+1);
			if(i*2+2<datas.size()){//����ż����ʱ�� �±�Խ��
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
 
 
 
 