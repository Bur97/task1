import java.util.Arrays;

class Sort {

	final double factor = 1.24733;

	int Comb_Sort(int a[], String dir) {
		
		int iter = 0;	//для подсчета всех итераций	
		int n = a.length;
		int p = 0;
		int i = 0;
		int N = (int)Math.floor((double)n / factor);	//сортировка расческой
		while(N >= 1) {
			for(int k = 0; k < n - N; k++) {
				if (a[k] < a[k + N] && dir.contentEquals("->") || a[k] > a[k + N] && dir.contentEquals("<-")) {
					p = a[k];
					a[k] = a[k + N];
					a[k + N] = p;
				}
				i++;
			}
			iter = iter + i;
			i = 0;
			N = (int)Math.floor((double)N / factor);
		}
		return iter;
	}

}
