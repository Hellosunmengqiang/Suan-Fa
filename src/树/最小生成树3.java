package 树;

import java.util.Scanner;

public class 最小生成树3 {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	//int n = cin.nextInt();//顶点数
	int m = cin.nextInt();//边的条数
	int i,j = 0,k,min;
	int e[][] = new int[51][51];
	int dis[] = new int[51];
	int book[] = new int[51];
	int count=0,sum=0;
	//开始读入对应的边
	for(i=1;i<=m;i++) {
		for(j=1;j<=m;j++) {
		e[i][j]=cin.nextInt();
	}
	}
	for(i=1;i<=m;i++) {
		for(j=1;j<=m;j++) {
		if(e[i][j]==0&&i!=j)  e[i][j]=99999999; 
	}
	}
	// 初始化dis数组，号顶点到各个顶点的初始距离
	for(i=1;i<=m;i++)
		dis[i]=e[1][i];
	// Prime核心
	book[1]=1;  //用于标记一个顶点是否加入生成树
	count++;
	while(count<m) {
		min = 99999999;
		for(i=1;i<=m;i++) {
			if(book[i]==0&&dis[i]<min) {
				min = dis[i];
				j=i;
			}
		}
			book[j]=1;
			count++;
			sum+=dis[j];
			//扫描当前顶点j所有的边，再以j为顶点，更新生成树到每一个非树顶点的距离
			for(k=1;k<=m;k++) {
				if(book[k]==0&&dis[k]>e[j][k])
					dis[k]=e[j][k];
			}
	}
	System.out.println(sum);
}
}
