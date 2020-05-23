package ch03;
import java.util.Scanner;
public class nomor3{
	int a = 4;
	int bil;
	int terkecil;

	public int getVarBil(){
		return bil;
	}

	public void cetak(){
		while(a<=bil){
			if (bil%a==0) {
				terkecil=a;
            	System.out.println(terkecil+" pembagi terkecil dari "+bil);
            	break;

			}else{
				a=a+1;
                	if(bil%a==0){
                		terkecil=a;
                		System.out.println(terkecil+" pembagi terkecil dari "+bil);
				break;
				}
			}a++;
		}
	}
} 