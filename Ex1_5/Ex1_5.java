import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Ex1_5 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<String> matrix = new ArrayList<String>();
		ArrayList<int[]> out = new ArrayList<int[]>();
		int Iter = 0; //число итераций для сортировки матрицы

		String str = in.nextLine();		//считывание матрицы
		while(!str.contentEquals("")) {
			matrix.add(str);
			str = in.nextLine();
		}

		int i = 0;
		int iter = 0;
		for(String str1 : matrix) {
			String b[] = str1.split(" ");		//выделение одной строки матрицы
			int a[] = new int[b.length];		
			for(int j = 0; j < b.length; j++)
				a[j] = Integer.parseInt(b[j]);		//приведение данных строки матрицы к числовому типу
			if (i % 2 != 0) {
				Sort sort = new Sort();
				iter = sort.Comb_Sort(a, "<-");	
			}
			else {
				Sort sort = new Sort();
				iter = sort.Comb_Sort(a, "->");
			}
			out.add(a);
			Iter = Iter + iter;
			iter = 0;
			i++;
		}
		Print output = new Print();
		output.print(out);
		System.out.format("\n%d\n", Iter);	//число итераций

	}	

}
