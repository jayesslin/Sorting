package BinarySearch;
//ʹ�õݹ�Ķ��ֲ��ҷ��� �����������
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
				System.out.println("���ҵ���"+key+",������û�и�����");
			}
			else {
				System.out.println("���ҵ���"+key+",λ���ڵ�"+(position+1)+"��λ�á�");
			}
		}
	}

