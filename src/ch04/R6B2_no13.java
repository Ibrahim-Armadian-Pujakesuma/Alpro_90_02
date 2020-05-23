package ch04;
import java.util.Scanner;
public class R6B2_no13{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int a = 0;
	int jumlah,jumlah1 = 0;
	
	public void cetak(){
		for (int i = 0; i < 12 ; i++){	
			a = i+1;
			jumlah = array[i] - array[a];
			jumlah1=jumlah1+jumlah;
		}
		System.out.print("jumlah selisihnya adalah : "+jumlah1);
	}

}