package ArraySums;

public class AdditionDivision {

	public static void main(String[] args) {
		
		int[] a = {432, 6, 9, 71, 5, 10, 8, 7, 9, 8};
		
		for(int i=0; i<a.length; i=i+2) {
			int x = a[i];
			int y = a[i+1]*a[i+1];
			int z = (y/x)*x;
			System.out.println(z+"/"+y+" : "+z%y);
			if(z%y == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
