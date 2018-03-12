import java.util.Scanner;

class Ex1_3 {

	private static int sum(int N) {	//подсчет суммы цифр в числе рекуррентым методом

		if (N / 10 == 0)
			return N;
		else
			return sum(N / 10) + (N % 10);		
	} 


	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int s = sum(N);

		System.out.format("%d\n", s);		
	}
}
