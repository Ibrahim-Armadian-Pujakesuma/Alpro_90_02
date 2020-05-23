package ch08;
public class R12B2no3c_ObjectKMP{
	public static void main(String args[]){ 
		System.out.println("Program Algoritma Knuth - Morris - Pratt : ");
		System.out.println();
	R12B2no3c_KMP object = new R12B2no3c_KMP();
		String txt = "HIHIKHIHJKHIHIJHIHI"; 
		String pat = "HIHIJHIHI"; 
		object.KMPSearch(pat, txt); 
	}
}