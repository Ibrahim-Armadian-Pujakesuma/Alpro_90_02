package ch03;
import java.util.Scanner;
public class Objectnomor4{
	public static void main(String[] args) {
		nomor4 prima = new nomor4();
		System.out.println("Program Menentukan Bilangan Prima atau Tidak");
		System.out.println();

		Scanner bilangan_yang_dicoba = new Scanner (System.in);
		System.out.print("Masukkan Angka Yang Ingin diCoba : ");
		prima.bil = bilangan_yang_dicoba.nextInt();

		prima.cetak();

	}
} 