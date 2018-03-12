import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Ex1_5 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<String> matrix = new ArrayList<String>();

		String str = in.nextLine();		//считывание матрицы
		while(!str.contentEquals("")) {
			matrix.add(str);
			str = in.nextLine();
		}

		int i = 0;
		int p, l;
		int s1 = 0;
		int s2 = 0;
		int t1 = 0;
		int t2 = 0;
		int m1 = 0;
		int m2 = 0;
		for(String str1 : matrix) {
			String b[] = str1.split(" ");		//выделение одной строки матрицы
			l = b.length;
			int a[] = new int[l];		
			for(int j = 0; j < l; j++) {
				a[j] = Integer.parseInt(b[j]);		//приведение данных строки матрицы к числовому типу
			}
			if (i % 2 != 0) {
				int N = (int)Math.floor((float)l / 1.24733);	//сортировка расческой по возрастанию
				while(N >= 1) {
					for(int k = 0; k < l - N; k++) {
						if (a[k] > a[k + N]) {
							p = a[k];
							a[k] = a[k + N];
							a[k + N] = p;
						}
						t1++;
					}
					s1 = s1 + t1;
					t1 = 0;
					N = (int)Math.floor((float)N / 1.24733);
				}
				m1 = m1 + s1;
				s1 = 0;
				for(int j = 0; j < l; j++)
					System.out.format("%d ", a[j]);
				System.out.format("\n");	
			}
			else {
				int N = (int)Math.round((float)l / 1.24733);	//сортировка расческой по убыванию
				while(N >= 1) {
					for(int k = 0; k < l - N; k++) {
						if (a[k] < a[k + N]) {
							p = a[k];
							a[k] = a[k + N];
							a[k + N] = p;
						}
						t2++;
					}
					s2 = s2 + t2;
					t2 = 0;
					N = (int)Math.floor((float)N / 1.24733);
				}
				m2 = m2 + s2;
				s2 = 0;
				for(int j = 0; j < l; j++)
					System.out.format("%d ", a[j]);
				System.out.format("\n");	
			}
			i++;

		}
		System.out.format("%d\n", m1 + m2);	//число итераций

	}	

}
