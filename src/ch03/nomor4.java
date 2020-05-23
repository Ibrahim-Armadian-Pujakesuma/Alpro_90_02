package ch03;
import java.util.Scanner;
public class nomor4{
	int bil;
	public int getVarBil(){
		return bil;
	}
	public void cetak(){
		if (bil==4 || bil!=1 && bil%4!=0 ) {
			if (bil==5 || bil%5!=0) {
				if (bil==7 || bil%7!=0) {
					if (bil==9 || bil%9!=0) {
						System.out.println(bil+" Bilangan Prima");
					}else{
						System.out.println(bil+" Bukan Bilangan Prima");	
					}
				}else{
					System.out.println(bil+" Merupakan Bilangan Prima");
				}
			}else{
				System.out.println(bil+" Bukan Bilangan Prima");
			}
		}else{
			System.out.println(bil+" Bukan Bilangan Prima");
		}
	}
} 