package ch03;
import java.util.Scanner;
public class nomor2{
	int x,y,z;

	public int getVarX(){
		return x;
	}
	public int getVarY(){
		return y;
	}
	public int getVarZ(){
		return z;
	}
	public void cetak(){
		if (x>y&&x>z) {
			System.out.println("Nilai Bilangan X yaitu "+x+" lebih besar daripada Nilai Bilangan Y yaitu "+y+" dan Nilai Bilangan Z yaitu "+z);

		}else if(y>x&&y>z){
			System.out.println("Nilai Bilangan Y yaitu "+y+" lebih besar daripada Nilai Bilangan X yaitu "+x+" dan Nilai Bilangan Z yaitu "+z);

		}else{
			System.out.println("Nilai Bilangan Z yaitu "+z+" lebih besar daripada Nilai Bilangan X yaitu "+x+" dan Nilai Bilangan Y yaitu "+y);
		}
	}
}
