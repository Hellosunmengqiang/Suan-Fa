package ��;

import java.util.Scanner;

public class ��С������3 {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	//int n = cin.nextInt();//������
	int m = cin.nextInt();//�ߵ�����
	int i,j = 0,k,min;
	int e[][] = new int[51][51];
	int dis[] = new int[51];
	int book[] = new int[51];
	int count=0,sum=0;
	//��ʼ�����Ӧ�ı�
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
	// ��ʼ��dis���飬�Ŷ��㵽��������ĳ�ʼ����
	for(i=1;i<=m;i++)
		dis[i]=e[1][i];
	// Prime����
	book[1]=1;  //���ڱ��һ�������Ƿ����������
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
			//ɨ�赱ǰ����j���еıߣ�����jΪ���㣬������������ÿһ����������ľ���
			for(k=1;k<=m;k++) {
				if(book[k]==0&&dis[k]>e[j][k])
					dis[k]=e[j][k];
			}
	}
	System.out.println(sum);
}
}
