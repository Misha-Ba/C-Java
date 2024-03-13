
public class SelectionSort {
	public static void selectsort(int arr[]) {
		int length = arr.length; //length of the array
		
		//list the 1st index as lowest and get inner loop to go through rest of array for lowest
		for(int i = 0; i<length-1; i++) {
			int low = arr[i]; //element at current index
			int lowIndex = i;  //current index
			
			//Inner loop
			for(int j = i+1; j < length; j++) {
				
				//go through array updating for lowest number and index it was found at
				if(arr[j] < low) {
					low =arr[j];
					lowIndex = j;
					
					int temp = arr[i];
	                arr[i] = arr[lowIndex];
	                arr[lowIndex] = temp;


				}
			}
			//if lower number is found, swap with index i
			//swap(arr, i, lowIndex);
		}
	}
	
	public static void swap(int a[], int b, int c) {
		int temp = a[b];
		a[b]= a[c];
		a[c] = temp;
	}

	
	public static void main(String[] args) {
		int [] arr = {1, 3, 2, 9, 7, 5, 6};
		System.out.println( "Before Sorting: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		selectsort(arr);
		System.out.println( "\n");
		System.out.println( "After Sorting: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
