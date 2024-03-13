
//recursive and iteratively
public class BinarySearch {
	public static int binarysearch(int [] arr, int target) {
		int l; //left
		int r; //right
		
		l=0; //l equal first index
		r = arr.length -1; //r equal last index in array
		
		
		//while we still have elements in the array we have not exhausted the array/while withing array bounds
		while(l <= r) {
			int middle = (l+r)/2; //formula to find middle index
			int middle_val = arr[middle]; //middle index value;
			
			//if middle value = target number
			if (middle_val == target) {
				return middle;
			}
			
			//if middle value > target number
			else if(middle_val > target) {
				
				r = middle-1; //update r
				
			}
			
			else if (middle_val < target){
				l = middle +1; //update l
				
			}
			
			
		}
		//the target number DNE
		return -1; 
		
	}
	
	public static void main(String [] args) {
		
		int a[] = {2,3,4,5,6};
		int target = 3;
		System.out.println(binarysearch(a,target));
		
	}
	
	//recursively have to give the array, 1st index and last index as well as target
	/*public static int binarySearchRecursive(int[] arr, int l, int r, int target) {
        if (l <= r) {
            int middle = l + (r - l) / 2;

            // Check if the middle element is the target
            if (arr[middle] == target) {
                return middle;
            }

            // If the target is smaller than the middle element, it must be in the left subarray
            if (arr[middle] > target) {
                return binarySearchRecursive(arr, l, middle - 1, target);
            }

            // If the target is larger than the middle element, it must be in the right subarray
            return binarySearchRecursive(arr, middle + 1, r, target);
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6};
        int target = 3;
        int result = binarySearchRecursive(a, 0, a.length - 1, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }*/
	
	
	
}
