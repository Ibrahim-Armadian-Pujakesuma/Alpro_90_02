package ch04;
import java.util.Scanner;
public class R6B2_no14{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int sum = 0;
	int n = array.length-2;
	int a = 0;

	public void cetak(){
		for (int num : array){	
			sum = sum + num ;	
		}
			System.out.print("Yaitu : ");
		for (int i = 0; i < array.length ; i++ ) {	
			if (i>n) {
				System.out.print(array[i] +"");
			}else{
				System.out.print(array[i] +", ");
			}	
		}
		System.out.print("\n\n Dan Jumlahnya : "+sum);
	}
	public void cetak2(){
		for (int a=0; a < array.length; a++ ) {
			if (array[a]<=10) {
				a = a+1;
			}	
		}
				int akhir = (array.length*2)-a;
					System.out.println ("Jumlah angka di array :" + akhir);					
	}

}