package ch05;
public class R7B2no2_Objectalgoritma_Kadane{
	public static void main(String[] args) {
		System.out.println("Program Algoritma Kadane : Menentukan nilai Maximum dari Subarray");
		System.out.println();

		R7B2no2_algoritma_Kadane i = new R7B2no2_algoritma_Kadane();
			int arrA[] = { 5, 6, -7, -8, 6, 9, -6, 7 };
			i.cetak();
				System.out.println();
				System.out.println("Maximum subarray : " + i.kandane(arrA));
		
			int arrB[] = { -6, -7, -8, -6, -9, -6, -7,-15 };
			i.cetak2();
				System.out.println();
				System.out.println("Maximum Subarray : " + i.KandaneModify(arrB));
	}
}