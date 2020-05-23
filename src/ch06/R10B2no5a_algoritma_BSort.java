package ch06;
public class R10B2no5a_algoritma_BSort{
	static void bubbleSort(int arr[], int n) { 
		int i, j, temp; 
		boolean swapped; 
		for (i = 0; i < n - 1; i++) 
		{ 
			swapped = false; 
			for (j = 0; j < n - i - 1; j++) 
			{ 
				if (arr[j] > arr[j + 1]){ 
					temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
					swapped = true; 
				} 
			} 
			if (swapped == false) 
				break; 
		} 
	} 
	static void printArray(int arr[], int size){ 
		int i; 
		for (i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
	public static void main(String args[]){ 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		int n = arr.length; 
		bubbleSort(arr, n); 
			System.out.println(" Urutan Array Setelah di BSort : "); 
		printArray(arr, n); 
	}
}