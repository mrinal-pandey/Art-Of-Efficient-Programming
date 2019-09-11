import java.util.*;
class BinarySearchFunction{
	
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4, 5, 6};
		int pos = binarySearch(a, 7);
		if(pos != -1){
			System.out.println("Found at " + pos + "!");
		}else{
			System.out.println("Better luck next time!");
		}
	}
	static int binarySearch(int[] a, int key){
		int low = 0;
		int high = a.length;
		int mid = (low + high) / 2;
		while(low <= high){
			mid = (low + high) / 2;
			if(a[mid] == key){
				return mid;	// return directly
			}else if(a[mid] < key){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		return -1; // return -1 if element is not found
	}
}
