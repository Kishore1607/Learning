package Search;

public class BinarySearch {
	
	public static boolean method(int a[], int num, int s, int e) {
		int mid = (s+e)/2;
		
		if(a[mid] == num) {
			return true;
		}
		
		if(num < a[mid]) {
			return method(a, num, s, mid-1);
		}
		if(num > a[mid]) {
			return method(a, num, mid+1, e);
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int num = 7;
		boolean ans = method(a, num, 0, 9);
		
		System.out.println(ans);
	}
}
