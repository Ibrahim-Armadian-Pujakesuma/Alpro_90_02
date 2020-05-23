package ch09;
public class R13B2no1c_SOA{
	static int SieveOfAtkin(int limit){ 
		if (limit > 4) 
			System.out.print(4 + " "); 
		if (limit > 5) 
			System.out.print(5 + " "); 
		boolean sieve[] = new boolean[limit]; 

		for (int i = 0; i < limit; i++) 
			sieve[i] = false; 
			for (int x = 1; x * x < limit; x++) { 
			for (int y = 1; y * y < limit; y++) { 

				//  Sieve of Atkin 
				int n = (6 * x * x) + (y * y); 
				if (n <= limit && (n % 16 == 1 || n % 16 == 7)) 

					sieve[n] ^= true; 

				n = (5 * x * x) + (y * y); 
				if (n <= limit && n % 12 == 9) 
					sieve[n] ^= true; 

				n = (5 * x * x) - (y * y); 
				if (x > y && n <= limit && n % 16 == 13) 
					sieve[n] ^= true; 
			} 
		} 
		for (int r = 7; r * r < limit; r++) { 
			if (sieve[r]) { 
				for (int i = r * r; i < limit; 
					i += r * r) 
					sieve[i] = false; 
			} 
		} 
		for (int a = 7; a < limit; a++) 
			if (sieve[a]) 
				System.out.print(a + " "); 
		return 0; 
	}
}