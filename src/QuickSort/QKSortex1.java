package QuickSort;

public class QKSortex1 {
	public static void main(String arg[]) {
		
		int[] a = {2,6,11,20,99,7,3,1,5,0};
		int start =0;
		int end = a.length-1;
		sort(a,start,end);
		System.out.println("the final one is :");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}
	
	public static void sort(int[] a, int low ,int high) {
		int start= low;
		int end = high;
		int key = a[low];
		int count =0;
		while (end>start) {
			//后往前
			while (end >start && a[end]>=key)
				end--;
			if (a[end]<=key) {
				int temp = a[start];
				a[start]=a[end];
				a[end] = temp;
				count++;
				for(int i=0; i<a.length;i++) {
					System.out.print(a[i]+",");
				}
			}
			System.out.println(" ");
			
			//前往后
			while(end >start && a[start]<=key)
				start++;
			if(a[start]>=key) {
				int temp =a [end];
				a[end]=a[start];
				a[start]=temp;
				count++;
				for(int i=0; i<a.length;i++) {
					System.out.print(a[i]+",");
					
				}
			}	
			
			System.out.println(" ");
			//System.out.println("the   "+count+"   one is :");
		//递归	
		if(start>low) {
			sort(a, low, start-1);
			}
		if(end<high) {
			sort(a, end+1, high);
		}
		}
	}
}
