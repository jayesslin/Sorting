package BinarySearch;

public class NonRecursionBSWhile {
	public static int NRBS(int[] a, int  key) {
		//����1
		int low =0 ;
		int high= a.length-1;
		if(key<a[low]||key>a[high]||low>high) {
			return -1;
		}
		while (low<=high) {
			int mid = (low+high)>>1;
		//�������м� ˵��ֵ���ұ�	
		if(key>a[mid]) {
				low = mid+1;
			}
		//��С���м� ֵ�����
			else if(key<a[mid]) {
				high=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1; //���û�ҵ� ��Ȼ����-1
	} 
	public static void main(String args[]) {
		int[] a= {4,5,6,7,8,9,10,11,12};
		int key = 9;
		int position = NRBS(a,key);
		if (position== -1) {
			System.out.println("���ҵ���"+key+",������û�и�����");
		}
		else {
			System.out.println("���ҵ���"+key+",λ���ڵ�"+(position+1)+"��λ�á�");
		}
	}
}
