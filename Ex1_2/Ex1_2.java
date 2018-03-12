class Ex1_2 {
	public static void main(String args[]) {
		int a[] = new int[7];
		for(int i = 0; i < 7; i++) {			//заполнение массива
			a[i] = (int)(Math.random()*200);
			a[i] = a[i] * 2;
			System.out.format("%d ", a[i]);
		}
		System.out.format("\n");
		for(int i = 0; i < 7; i++) {		//выполнение заданного действия с элементами
			if (i % 2 != 0)
				a[i] = a[i] * a[i - 1];
			System.out.format("%d ", a[i]);
		}
		System.out.format("\n");
 	}
}
