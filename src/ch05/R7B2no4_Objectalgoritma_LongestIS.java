package ch05;
public class R7B2no4_Objectalgoritma_LongestIS{
	public static void main(String args[]){ 
		int arr[] = { 50, 42, 11, 53, 45, 75, 61, 80 }; 
		R7B2no4_algoritma_LongestIS algoritma = new R7B2no4_algoritma_LongestIS();
			int n = arr.length; 
				System.out.println("Length dari LongestIS : " + algoritma.lis( arr, n ) + "\n" ); 
	}
}