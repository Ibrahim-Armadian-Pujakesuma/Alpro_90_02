package ch06;
public class R10B2no5c_Objectalgoritma_SSort{
	public static void main(String args[]){ 
		R10B2no5c_algoritma_SSort ob = new R10B2no5c_algoritma_SSort(); 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		ob.sort(arr); 
		System.out.println("Urutan Array setelah di SSort : "); 
		ob.printArray(arr); 
	}
}