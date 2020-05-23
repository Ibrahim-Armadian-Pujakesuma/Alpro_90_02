package ch04;
import java.util.Scanner;
public class R6B2_no2{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int angka;
	boolean found = false;
	public void cetak(){

	for (int i = 0; i < array.length ; i++){				
		System.out.print(array[i]+" . ");
	}		

	}
	public void cetak2(){
		for (int i = 0; i < array.length ; i++){		
			if (array[i]==angka){
				found = true;
				int c = i;
				System.out.print("Data ditemukan di index ke-" +c);	
			}
			
		}
			if(found == false){
				System.out.print("Data tidak ditemukan");
		}
	}
}