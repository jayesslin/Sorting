package BinarySearch;
//使用递归的二分查找法， 自身调用自身
public class RecursionBinarySearch {
	public static int RecursionBS(int[] a,int key, int low, int high) {
		if( key<a[low] || key>a[high] || low>high) {
			return -1 ; 
		}
		int mid= (low+high)>>1;
		if(key < a[mid]) {
			return RecursionBS(a,key,low, mid-1);
		}
		else if(key >a[mid]) {
			return RecursionBS(a, key, mid+1,high);
		}
		else {
			return mid;
		}
	}
	public static void main(String arg[]) {
			int[] a= {4,5,6,7,8,9,10,11,12};
			int key = 11;
			int low=0;
			int high=a.length-1;
			int position = RecursionBS(a,key,low,high);
			if (position== -1) {
				System.out.println("查找的是"+key+",序列中没有该数！");
			}
			else {
				System.out.println("查找的是"+key+",位置在第"+(position+1)+"个位置。");
			}
		}
	}

