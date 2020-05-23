package ch03;
import java.util.Scanner;
public class Objectnomor2{
	public static void main(String[]args){
		nomor2 bil = new nomor2();
		System.out.println(" Program menentukan Nilai Tertinggi dari X,Y, dan Z ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan X : ");
		bil.x = a.nextInt();

		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Y : ");
		bil.y = b.nextInt();

		Scanner c = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Z : ");
		bil.z = c.nextInt();

		bil.cetak();

	}
} 