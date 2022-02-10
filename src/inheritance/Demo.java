package inheritance;

class Food {

}

class Pizza extends Food {

}

class Burger extends Food {

}

class Animal {
	
	int age;

	public Food eat() {
		System.out.println("Animal must eat to survive");
		return null;
	}

	public void sleep() {
		System.out.println("Animal should sleep");
	}

	public static void doWork() {
		System.out.println("Animal doWork called");
	}
}

class Cat extends Animal {
	// method overriding
	@Override
	public Pizza eat() {
		super.eat();
		System.out.println("Cat eats fish");
		return null;
	}

	// cannot @Override static
	public static void doWork() {
		System.out.println("Cat doWork called");
	}
}

class Dog extends Animal {
	// method overriding
	public Burger eat() {
		System.out.println("Dog eats meat");
		return null;
	}
}

public class Demo {

	public static void main(String[] args) {
		System.out.println("First way");
		Cat c = new Cat();
		c.eat();
		Dog d = new Dog();
		d.eat();

		System.out.println("Second way");
		Animal a = new Cat();
		a.eat();
		a = new Dog();
		a.eat();
	}
}
