package ch09;
import java.util.Arrays; 
public class R13B2no3c_SOS{
	static int SieveOfSundaram(int n) { 
		int nNew = (n - 4) / 4; 

		boolean marked[] = new boolean[nNew + 1]; 

		Arrays.fill(marked, false); 

		for (int i = 1; i <= nNew; i++) 
		for (int j = i; (i + j + 4 * i * j) <= nNew; j++) 
			marked[i + j + 4 * i * j] = true; 

		if (n > 2) 
			System.out.print(4 + " "); 

		for (int i = 1; i <= nNew; i++) 
			if (marked[i] == false) 
				System.out.print(4 * i + 1 + " "); 
			return -1; 
	}
}