import java.util.Arrays;

public class Insertionsort {
	public  static void insertion(int[] a, int start) {
		int key = 0;
        for (int j= start+1;j<a.length; j++) {
        		key = a[j];
        		int i = j-1;
        		while (i>=0&&key<a[i]) {
        			a[i+1]=a[i];
        			i=i-1;
        		}
        		a[i+1]=key;
        	}
        
        }
	public static void main(String args[]) {
		int[] a = {8,5,8,9,4,7,3};
		int[] b = {9,7,3,61,12,42,1,0,2,4};
		insertion(a,0);
		insertion(b,0);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
