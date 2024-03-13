
public class InsertionSort {
	public static void insertionsort(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
	        int Cval = arr[i];   //current value
	        
	        int j = i - 1;
	        while(j >= 0 && arr[j] > Cval) { // stop when we reach index 0 or the previous value is less than current value
	            
	            //shift right
	            arr[j+1] = arr[j];
	            j--;
	        }
	        
	        //update element in the correct position
	        arr[j+1] = Cval;
	    }
	}
	
	//testing
	public static void main(String[] args) {
		int [] arr = {1, 3, 2, 9, 7, 5, 6};
		System.out.println( "Before Sorting: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		insertionsort(arr);
		System.out.println( "\n");
		System.out.println( "After Sorting: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
