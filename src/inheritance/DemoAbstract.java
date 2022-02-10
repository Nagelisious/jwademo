package inheritance;

abstract class Vehicle {
	
	int price;
	abstract void start();
	abstract void stop();
	abstract void playMusic();
	
	public void applyingBrake() {
		System.out.println("Applying brake should stop vehicle");
	}
	
}

abstract class Car extends Vehicle {
	
	abstract void turnOnBluetooth();
	
	@Override
	void playMusic() {
		System.out.println("Music started playing");
	}
	
}

class Hyundai extends Car {

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void turnOnBluetooth() {
		// TODO Auto-generated method stub
		
	}
	
}

// concrete class
class Bike extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Bike start by self or by kick");
	}

	@Override
	void stop() {
		System.out.println("Bike switches off by using keys");
	}

	@Override
	void playMusic() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DemoAbstract {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.applyingBrake();
		b.stop();
	}

}
