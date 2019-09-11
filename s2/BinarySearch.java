import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4, 5, 6};
		int low = 0;
		int key = 6;
		int high = a.length - 1; // do not hard code high as a value
		int pos = -1; // binary search should always return the position at which element is found
		int mid = (low + high) / 2;
		// chech=k whether pos = -1 to avoid having a separate boolean flag
		while(pos == -1 && low <= high){
			mid = (low + high) / 2;
			if(a[mid] == key){
				pos = mid;	// do not use break or goto or continue
			}else if(a[mid] < key){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		if(pos != -1){
			System.out.println("Found at " + pos + "!"); // print position also
		}else{
			System.out.println("Better luck next time!");
		}
	}
}
