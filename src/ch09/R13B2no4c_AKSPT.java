package ch09;
public class R13B2no4c_AKSPT{
static long a[] = new long[100]; 
	static void coef(int n){ 
		a[0] = 1; 
		for (int i = 0; i < n; a[0] = -a[0], i++) { 
			a[1 + i] = 1;

			for (int j = i; j > 0; j--) 
				a[j] = a[j - 1] - a[j]; 
		} 
	} 
	static boolean isPrime(int n){
		coef(n); 

		a[0]++; 
		a[n]--; 

		int i = n; 
		while ((i--) > 0 && a[i] % n == 0); 
		return i < 0; 
	}
}