package ̰���붯̬�滮;
public class ����̰���㷨 {
	public static void main(String[] args) {
		int n = 3; //��Ʒ����
		float m = 20; //����������
		float[] p = {25,24,15}; //��Ʒ��ֵ
		float[] w = {18,15,10}; //��Ʒ����
		float[] x = {1,1,1}; //ÿ����Ʒװ�뱳������
		
		test(n, m, p, w, x);
	}
	
	public static void test(int n,float m,float[] p,float[] w,float[] x){
		float[] value = new float[n]; //��Ʒ��λ��ֵ
		float sum = 0; //���ڴ��װ����ܼ�ֵ
		for(int i = 0;i<n;i++){
			value[i]=p[i]/w[i]; //������õ���Ʒ��λ��ֵ��������
		}
		//��������,����Ʒ��ֵ����Ʒ�������Ե�λ��ֵ�Ӵ�С����
		for(int i = 0;i < n;i++){
			for(int j = i;j < n;j++){
				//��һ�֣��������һλ��ÿһλ�Ƚϣ�ÿ�αȽϰ�ֵ��ķ����һλ���ܱ�֤ѭ���������һλһ�������ġ�
				//�ڶ��֣��ʹ�����ڶ�λ��ʼ����֤�ڶ�λ��ʣ���������ģ��Դ˴ﵽ��������
				//����Ʒ��ֵ����Ʒ�����������򣬱�֤֮���ѭ��һ���ǵ�λ��ֵ�ߵ���Ʒ��װ��
				if(value[i] < value[j]){
					float temp = value[i];
					value[i] = value[j];
					value[j] = temp;
					float temp2 = p[i];
					p[i] = p[j];
					p[j] = temp2;
					float temp3 = w[i];
					w[i] = w[j];
					w[j] = temp3;
				}
			}
		}
		//��ʼ������ʾ���ж�����ûװ
		for(int i = 0;i < n;i++){
			x[i]=0;
		}
		int index = 0; //���ڴ�����һ��ûװ�����Ʒ����
		//�Ƚ���λ��ֵ��ߵ���Ʒ�������
		for(int i = 0;i < n;i++){
			index = i;
			if(w[i]>m){ //����ǰ��Ʒ�������ڱ���ʣ������ʱ����ѭ��
				break;
			}
			x[i]=1; //����ȫ��װ��
			m -= w[i]; //��ȥ��ת�����Ʒ����
		}
		//���ܴ������һ����Ʒ�������Ѿ�����ʣ�����������ܹ�װһ���ֽ�ȥ�����
		if(index < n){
			x[index]=m / w[index]; //��������װ�����
		}
		//�����ܼ�ֵ
		for(int a = 0;a <= index;a++){
			sum += x[a]*p[a]; //װ��ı���*����Ʒ���ܼ�ֵ
		}
		System.out.println("̰���㷨��������ܼ�ֵΪ��" + sum);
	}
}




