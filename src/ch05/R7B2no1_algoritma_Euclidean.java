package ch05;
import java.util.Scanner;
public class R7B2no1_algoritma_Euclidean{
		int a,b,r;
	public int getVarA(){
		return a;
	}
	public int getVarB(){
		return b;
	}

	public void cetak(){
		int x = a;
		int y = b;
		while(b!=0){
			r = a % b;
			a = b;
			b = r;
		}
		System.out.println (" PBB dari : ("+x+", "+y+") = "+a);
	}
}