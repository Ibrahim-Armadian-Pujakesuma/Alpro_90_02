package ch03;
import java.util.Scanner;
	public class nomor1{
		int x,y;
		public int getVarX(){
			return x;
		}

		public int getVarY(){
			return y;
		}

		public void cetak(){
			if (x>y){
				System.out.println ("Nilai Bilangan X yaitu " +x+ " lebih besar daripada Nilai Bilangan Y yaitu " +y);
			}else{
				System.out.println ("Nilai Bilangan Y yaitu " +y+ " lebih besar daripada Nilai Bilangan X yaitu " +x);
		}
	}
}