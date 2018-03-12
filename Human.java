abstract class Human {		//создание класса людей
	
	private String name;	//объявление полей
	private String gender;
	private int age;

	protected Human(String name, String gender, int age) {	//конструктор
		this.name = name;
		this.gender = gender;
		this.age = age;		
	}  
	protected void print() {		//печать информации о человеке
		System.out.format("%s %s %d\n", name, gender, age);
	}
}

