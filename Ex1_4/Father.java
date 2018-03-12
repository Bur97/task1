class Father extends Human {		//создание класса отец с наследованием свойств класса людей(для матери и ребенка аналогично)

	protected Father(String name, String gender, int age) {	//конструктор
		super(name, gender, age);
	}

	protected void print() {		//печать информации об отце
		System.out.format("Father\n");
		super.print();
	}

}
