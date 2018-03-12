class Child extends Human {

	protected Child(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	protected void print() {
		System.out.format("Child\n");
		super.print();
	}

}
