package 典型题目;
import java.util.Scanner;

public class 连接电脑 {
	static int t=0;
	static int f[];
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			int m=cin.nextInt();
		    int n=cin.nextInt();
			if(m==0)
				break;
			init(m);
			for(int i=0;i<n;i++)
			{
				end(cin.nextInt(),cin.nextInt());
			}
			System.out.println(t-1);
		}
	}
	private static void end(int x, int y) {
		// TODO 自动生成的方法存根
		int tx=find(x);
		int ty=find(y);
		if(tx==ty)return;
		f[tx]=ty;
		t--;
	}
	private static int find(int x) {
		// TODO 自动生成的方法存根
		return x==f[x]?x:f[x];
	}

	private static void init(int x) {
		// TODO 自动生成的方法存根
		t=x;
		f=new int[x+1];
		for(int i=1;i<=x;i++)
			f[i]=i;	
	}
}
/*#include<bits/stdc++.h>
using namespace std;
int bin[1002];              //分组标识数组 
int findx(int x){           //找到其“根结点” 
    int r=x;
    while(bin[r]!=r)
    r=bin[r];
    return r;
}
void merge(int x,int y){
    int fx,fy;
    fx=findx(x);
    fy=findx(y);
    if(fx!=fy)
    bin[fx]=fy;
}
int main(){
    int n,m;
    int i;
    int x,y,count;
    cin>>n;
    for(i=1;i<=n;i++)
    bin[i]=i;
    for(cin>>m;m>0;m--){
        cin>>x>>y;
        merge(x,y);
    }
    for(count=0,i=1;i<=n;i++)
    if(bin[i]==i) 
    count++;
    cout<<count<<endl;
    return 0;
}
*/