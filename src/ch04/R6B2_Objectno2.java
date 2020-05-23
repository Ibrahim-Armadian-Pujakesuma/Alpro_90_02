package ch04;
import java.util.Scanner;
public class R6B2_Objectno2{
	public static void main(String[] args) {
		R6B2_no2 matriks = new R6B2_no2();
			System.out.println();
		matriks.cetak();
			System.out.println();
		Scanner a = new Scanner (System.in);
			System.out.print(" Masukkan angka yang dicari : ");
		matriks.angka = a.nextInt();
			System.out.println();		
		matriks.cetak2();
	}
}