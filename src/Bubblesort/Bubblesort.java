package Bubblesort;

public class Bubblesort {
	public static void BS(int[] a) {
		int temp;
		for(int i = 0; i<a.length-1;i++) {
			for(int j = 0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		/*int i, j, temp, len = arr.length;
		for (i = 0; i < len - 1; i++)
			for (j = 0; j < len - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}*/

		
	}
	public static void main(String args[]) {
		int[] a  = {2,3,1,6,4,9,2,3,7};
		BS(a);
		for(int i =0; i <a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
