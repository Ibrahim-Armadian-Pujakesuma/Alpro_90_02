package ch05;
public class R7B2no3_algoritma_LongestCS{
	int lcs(char[] X, char[] Y, int c, int d) { 
		int L[][] = new int[c + 1][d + 1]; 
			for (int i = 0; i <= c; i++) { 
				for (int j = 0; j <= d; j++) { 
					if (i == 0 || j == 0) 
						L[i][j] = 0; 
					else if (X[i - 1] == Y[j - 1]) 
						L[i][j] = L[i - 1][j - 1] + 1; 
					else
						L[i][j] = max(L[i - 1][j], L[i][j - 1]); 
				} 
			} 
			return L[c][d]; 
		} 
		int max(int a, int b){ 
			return (a > b) ? a : b; 
		} 
}