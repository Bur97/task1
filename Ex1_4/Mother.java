class Mother extends Human {

	protected Mother(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	protected void print() {
		System.out.format("Mother\n");
		super.print();
	}

}
