import java.util.ArrayList;

class Human {		//создание класса людей
	
	String Name;	//объявление полей
	String Gender;
	int Age;

	public Human(String name, String gender, int age) {	//конструктор
		Name = name;
		Gender = gender;
		Age = age;		
	}  
	public void print() {		//печать информации о человеке
		System.out.format("%s %s %d\n", Name, Gender, Age);
	}
}

class Father extends Human {		//создание класса отец с наследованием свойств класса людей(для матери и ребенка аналогично)

	public Father(String name, String gender, int age) {	//конструктор
		super(name, gender, age);
	}

	public void print() {		//печать информации об отце
		System.out.format("Father\n");
		super.print();
	}

}

class Mother extends Human {

	public Mother(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	public void print() {
		System.out.format("Mother\n");
		super.print();
	}

}

class Child extends Human {

	public Child(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	public void print() {
		System.out.format("Child\n");
		super.print();
	}

}

class Family {		//создание класса семьи

	Father father;	//поля класса семьи
	Mother mother;
	ArrayList<Child> children;	//детей может быть несколько

	public Family(Father f, Mother m, ArrayList<Child> c) {		//конструктор
		father = f;
		mother = m;
		children = c;
	}
	public void print() {		//печать информации о семье

		father.print();
		mother.print();
		for(Child child : children) {
			child.print();
		}
	}

}

class Ex1_4 {		//симулятор семьи

	public static void main(String args[]) {

		Father father = new Father("Takeshi", "male", 20);
		Mother mother = new Mother("Tsugumi", "female", 24);
		Child child1 = new Child("Kid", "male", 17);
		Child child2 = new Child("Sara", "female", 17);

		ArrayList<Child> children = new ArrayList<Child>();
		children.add(child1);
		children.add(child2);

		Family family = new Family(father, mother, children);
		family.print();
	}

}

