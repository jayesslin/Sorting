import java.util.Arrays;

public class mergesort1 {
	public static void sort(int[]a, int start,int end) { 
		if(end-start<1) {
			return;
		}
		int mid = (start+end)>>1;  //����1----------------------------------------------------------------------------
		sort(a,start,mid);
		sort(a,mid+1,end);
		mergesort(a,start,mid,end);
	} 
	public static void mergesort(int[] a, int start, int mid, int end) {
		int key_forward=start; //���������ָ��
		int key_center=mid+1;
		int lower = start;
		int[] aa = new int[end+1];

		while(start<=mid&&key_center<=end) {
			aa[lower++]=a[start]>=a[key_center]?a[start++]:a[key_center++];//����2  ----------------------------------------------------------------------------
		}
	
		while(start<=mid) {
			aa[lower++]=a[start++];
		}
		while(key_center<=end) {
			aa[lower++]=a[key_center++];
		}
		for (int i=key_forward;i<=end;i++){ //����4��û����ȫ��ӡaa[i]----------------------------------------------------------------------------
			a[i]=aa[i];
		}

	}
	public static void main(String args[]) {
		int[] a = {9,7,3,61,12,42,1,0,2,4};
		sort(a,0,a.length-1);//����3�� ע��end=a.length-1----------------------------------------------------------------------------
		System.out.println(Arrays.toString(a));
	}
	
}
