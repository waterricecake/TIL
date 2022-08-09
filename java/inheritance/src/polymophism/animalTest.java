package polymophism;
import java.util.ArrayList;
class Animal{
	public void move() {
		System.out.println("animal move");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("human move by two legs");
	}
	public void readBooks() {
		System.out.println("human read book");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("tiger move by four legs");
	}
	public void hunting() {
		System.out.println("tiger hunting");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("eagle fly");
	}
	public void flying() {
		System.out.println("eagle fly away");
	}
}


public class animalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAniaml = new Tiger();
		Animal eAnimal = new Eagle();
		
		//Human human = (Human)hAnimal;
		//human.readBooks();
		
		//Eagle human = (Eagle)hAnimal; //오류
		if(hAnimal instanceof Human) {
			Human human= (Human)hAnimal;
			human.readBooks();
		} // instanceof를 통해 안전하게 코딩
		/*
		animalTest test = new animalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAniaml);
		test.moveAnimal(eAnimal);
		*/ 
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAniaml);
		animalList.add(eAnimal);
		animalTest test = new animalTest();
		test.testDownCasting(animalList);
		
		/*
		for(Animal animal: animalList) {
			animal.move();
		}
		*/
	}
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}

