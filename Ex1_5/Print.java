import java.util.ArrayList;
import java.util.Arrays;

class Print {

	void print(ArrayList<int[]> list) {
		for(int a[] : list) {
			for(int i = 0; i < a.length; i++)
				System.out.format("%d ", a[i]);
			System.out.format("\n");
		}
	}

}
