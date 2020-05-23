package ch04;
import java.util.Scanner;
public class R6B2_no9{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int a = 0;
	public void cetak(){
		for (int i = 0; i < 12 ; i++){	
			a = i+1;
			System.out.print ("(");
			System.out.print (array[i]-array[a] +"),");
		}
	}
}