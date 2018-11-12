import java.util.Arrays;
public class QKSort {
	
	public static void main(String args[]) {
		int start= 0;
		int[] test = {2,6,11,20,99,7,3,5,89,7,2,2,77,1,5,0};
		int[] a = test;
		int end= a.length-1;
		quick(a,start,end);
		System.out.print(Arrays.toString(a));
	}
	
	public static void quick(int[] a, int low , int high) {
		int start= low;
		int end = high;
		int key = a[low];
		
		while (end>start) {
		//����ǰ�� С����ǰ��
			while (end>start && a[end]>=key) 
				end--;
			if(a[end]<=key) {
				int temp= a[end];
				a[end]=a[start];
				a[start]=temp;
			}
		//��ǰ���� ��������
			while (end >start && a[start]<= key)
				start++;
			if(a[start]>=key) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
			//�ݹ�
			if(start>low) {
				quick(a, low , start-1);
			} 
			if(end<high) {
				quick(a, end+1, high);
			}
		}
	}
}
