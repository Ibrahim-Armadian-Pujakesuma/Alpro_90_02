package ch04;
import java.util.Scanner;
public class R6B2_no8{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int sum = 0;
	int a = 0;

	public void cetak(){
		for (int num : array) {	
			sum = sum + num ;	
		}
			//System.out.println(" Jumlah data di array :" + array.length);
			System.out.println("\n Jika Di jumlah kan : " + sum);
	}
	public void cetak2(){
		for (int b=0; b < array.length; b++ ) {
			if (array[b]<=10) {
				a=a+1;
			}	
		}
			int akhir = (array.length*2)-a;
				System.out.println("Jumlah angka di array :" + akhir);					
	}
}