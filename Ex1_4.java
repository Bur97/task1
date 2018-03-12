import java.util.ArrayList;

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

