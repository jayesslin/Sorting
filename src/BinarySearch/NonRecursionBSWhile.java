package BinarySearch;

public class NonRecursionBSWhile {
	public static int NRBS(int[] a, int  key) {
		//出口1
		int low =0 ;
		int high= a.length-1;
		if(key<a[low]||key>a[high]||low>high) {
			return -1;
		}
		while (low<=high) {
			int mid = (low+high)>>1;
		//键大于中间 说明值在右边	
		if(key>a[mid]) {
				low = mid+1;
			}
		//键小于中间 值在左边
			else if(key<a[mid]) {
				high=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1; //最后没找到 仍然返回-1
	} 
	public static void main(String args[]) {
		int[] a= {4,5,6,7,8,9,10,11,12};
		int key = 9;
		int position = NRBS(a,key);
		if (position== -1) {
			System.out.println("查找的是"+key+",序列中没有该数！");
		}
		else {
			System.out.println("查找的是"+key+",位置在第"+(position+1)+"个位置。");
		}
	}
}
