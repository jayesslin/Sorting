package mergeSort;

import java.util.Arrays;

public class mergeSort {
	public static void sort(int[] a,int start, int end ) {
		//��������ѭ������
		if (end-start<1)
			return;
		int mid= (start+end)>>1;
		sort(a,start,mid);
		sort(a,mid+1,end);
		mergesort(a,start,mid,end);
	}
	
	public static void mergesort(int[] a, int start,int mid,int end) {
		int[] aa=new int[end+1];
		int center= mid +1;
		int left =start;//��������ݹ�ʹ��
		int low=start;//����������������ָ��
		//��·�鲢
		while(start<=mid&&center<=end) {
			//�ж�start �� centerС�� �������� Ϊ Start,��֮center
			aa[low++]=a[start]>=a[center]?a[start++]:a[center++];
		}
		//����������ʣ������ݸ��ƽ���������
		while(start<=mid) {
			aa[low++]=a[start++];
		}
		while(center<=end) {
			aa[low++]=a[center++];
		}
		for(int i =left ; i<=end; i++) {
			a[i]=aa[i];
		}
	}
	
	//������
	public static void main(String args[]) {
		int[] a = {9,7,3,61,12,42,1,0,2,4};
		sort(a,0,a.length-1);
		System.out.print(Arrays.toString(a));
	}
}
