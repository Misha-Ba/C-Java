
public class MergeSort {
	//Helper method: helps another method
	//create a merge helper method to help merge sort

	
	//create a merge sort method: keeps dividing the array
	private static void mergesort(int[] arr) {
		//recursively divides array into two until the sub array reaches 1
		int length = arr.length; //length of the arr
		
		//base case
		if(length <= 1) { //at the individual arr or arr only has 1 element
			return;
		}
		
		//if has more than 1 element then split by half into left array and right array
		int midIndex = length/2;
		int[]left_arr = new int [midIndex]; //new left array
		int[]right_arr = new int[length - midIndex]; //new right array
		
		//now copy over elements from arr array and populate the left array with left elements and right array with right elements
		//left array
		for(int i = 0; i < midIndex; i++) {
			left_arr[i] = arr[i];
		}
		
		//right array copy and populate
		for(int i = midIndex; i < arr.length; i++) {
			
			//populates right array starting from the 0 index and not from middle index.
			//Eg: if middle index is 5 we want to populate right array from index 0 not index 5
			//5-5 = 0 -> index 0;
			right_arr[i - midIndex] = arr[i]; 
		}
		
		
		//Now we have to merge sort each of the two arrays or keep dividing(recursion)
		mergesort(left_arr);
		mergesort(right_arr);
		
		//call merge method after creating it
		merge(left_arr, right_arr, arr);
		
	}
	
	//Now we merge: merge 2 arrays into 1 sorted array using helper method
	private static void merge(int left_arr[], int right_arr[], int arr[]) {
		//get the length of left array and right array
		int left_arr_size = left_arr.length;
		int right_arr_size = right_arr.length;
		
		//move through both left and right array comparing them to find lowest number
		//add lowest number into arr[] array
		
		int l = 0; //interator for moving through left array
		int r = 0; //interator for moving through right array
		int k = 0;//interator for walking through merged array(arr array)
		
		//while we still have elements in the left or right array
		while(l < left_arr_size && r < right_arr_size) {
			
			if(left_arr[l] <= right_arr[r]) { //if left_arr at l is smaller than right_arr at r
				arr[k] = left_arr[l];
				l++; //look at next element in left arr
				
			}
			else { //the element in the right arr is smaller so add it to the arr[] and increment iterator
				arr[k] = right_arr[r];
				r++;
			}
			k++; //after element is added to arr[] move to the next index to fill
		}
		
		//add any left over elements from left array to the arr[]
		while(l < left_arr_size) {
			arr[k] = left_arr[l];
			l++; 
			k++;
		}
		
		//add any left over elements from right array to arr[]
		while(r < right_arr_size) {
			arr[k] = right_arr[r];
			r++; 
			k++;
		}
	}
	
	
	public static void main(String[] args) {
		int [] arr = {0, 3, 2, 9, 7, 5, 6};
		System.out.println( "Before Sorting: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		mergesort(arr);
		
		System.out.println( "\n");
		System.out.println( "After Sorting: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
