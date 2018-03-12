import java.util.ArrayList;

class Family {		//создание класса семьи

	private Father father;	//поля класса семьи
	private Mother mother;
	private ArrayList<Child> children;	//детей может быть несколько

	protected Family(Father father, Mother mother, ArrayList<Child> children) {		//конструктор
		this.father = father;
		this.mother = mother;
		this.children = children;
	}
	protected void print() {		//печать информации о семье

		father.print();
		mother.print();
		for(Child child : children) {
			child.print();
		}
	}

}
