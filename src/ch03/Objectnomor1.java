package ch03;
import java.util.Scanner;
public class Objectnomor1{
	public static void main(String[]args){
		nomor1 bil = new nomor1();
		System.out.println(" Program menentukan Nilai Tertinggi dari X dan Y");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan X : ");
		bil.x = a.nextInt();
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Y : ");
		bil.y = b.nextInt();
		
		bil.cetak();
		
	}
}