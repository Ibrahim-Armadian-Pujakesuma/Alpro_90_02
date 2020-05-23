package ch05;
public class R7B2no4_algoritma_LongestIS{
	static int lis(int arr[],int d){ 
		int lis[] = new int[d]; 
		int i,j,max = 0; 

		/* inialisasi */
		for ( i = 0; i < d; i++ ) 
			lis[i] = 1; 

		/* menghitung nilai lis dari atas kebawah */
		for ( i = 1; i < d; i++ ) 
			for ( j = 0; j < i; j++ ) 
						if ( arr[i] > arr[j] && lis[i] < lis[j] + 1) 
					lis[i] = lis[j] + 1; 

		/* Mengambil nilai tertinggi dari LIS */
		for ( i = 0; i < d; i++ ) 
			if ( max < lis[i] ) 
				max = lis[i]; 
			return max; 
	}
}