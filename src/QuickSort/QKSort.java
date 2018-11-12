package QuickSort;

public class QKSort {
	
	public static void main(String args[]) {
		int start= 0;
		int[] test = {2,6,11,20,99,7,3,5,89,7,2,2,77,1,5,0};
		int[] a = test;
		int end= a.length-1;
		sort(a,start,end);
		for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ,");
		}
	}
	
	public static void sort(int[] a, int low , int high) {
		int start= low;
		int end = high;
		int key = a[low];
		
		while (end>start) {
		//后往前， 小的往前放
			while (end>start && a[end]>=key) 
				end--;
			if(a[end]<=key) {
				int temp= a[end];
				a[end]=a[start];
				a[start]=temp;
			}
		//从前往后 大的往后放
			while (end >start && a[start]<= key)
				start++;
			if(a[start]>=key) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
			//递归
			if(start>low) {
				sort(a, low , start-1);
			} 
			if(end<high) {
				sort(a, end+1, high);
			}
		}
	}
}
