package ch07;
public class R11B2no2b_Objectalgoritma_MergeS{
	public static void main(String args[]){ 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		R11B2no2b_algoritma_MergeS ob = new R11B2no2b_algoritma_MergeS(); 
			System.out.println("Array Yang Diinputkan : "); 
		ob.printArray(arr); 
		ob.sort(arr, 0, arr.length-1); 
			System.out.println();
			System.out.println("Array setelah di Merge Sort : "); 
		ob.printArray(arr); 
	} 
}