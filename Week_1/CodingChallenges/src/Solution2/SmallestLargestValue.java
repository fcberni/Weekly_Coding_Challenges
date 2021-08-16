package Solution2;

/*
Problem 2: Write java Program to Find Smallest and Largest Element in an Array.
Note: Number can not be repeated in the array.
 */
public class SmallestLargestValue {
	
	int Min(int[] a) {
		int large, small, i;
		int n = a.length;
		large = small = a[0];
		for(i=1;i<n;i++) {
			if(a[i]>large)
				large=a[i];
			if(a[i]<small)
				small=a[i];
		}
		return small;
		
		//return large;
	}
	
	int Max(int[] a) {
		int large, small, i;
		int n = a.length;
		large = small = a[0];
		for(i=1;i<n;i++) {
			if(a[i]>large)
				large=a[i];
			if(a[i]<small)
				small=a[i];
		}
		return large;
	}

	public static void main(String[] args) {
		SmallestLargestValue slv = new SmallestLargestValue();
		
		int[] arr1 = {7,5,6,1,4,2};
		int[] arr2 = {5,3,1,2};
		
		System.out.print("\nThe First Array's Smallest element is " + slv.Min(arr1) );
		System.out.print("\nThe First Array's Largest element is " + slv.Max(arr1) );
		System.out.print("\n--------h-----------------------------------------------------");
		System.out.print("\nThe Second Array's Smallest element is " + slv.Min(arr2) );
		System.out.print("\nThe Second Array's Largest element is " + slv.Max(arr2) );
		

	}

}
