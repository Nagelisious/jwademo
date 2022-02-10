package day8;

interface Beverages {

	public final int cost = 5; // can put public final, not required

	abstract void prepareTea(); // can put abstract, not required

	default void mix() {
		System.out.println("Mix the beverages");
	}

	static void ratings() {
		System.out.println("Ratings for beverages");
	}

}

interface Games {

	int numOfGames = 10;

	void play();

	void pause();

}

interface ClassicGames {

	void polygons();

	void saveState();

}

interface ModernGames extends Games, ClassicGames {

	void graphics();

	void animations();

}

class Men implements Beverages, ModernGames {

	@Override
	public void mix() {
		// TODO Auto-generated method stub
		Beverages.super.mix();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub

	}

	@Override
	public void graphics() {
		// TODO Auto-generated method stub

	}

	@Override
	public void animations() {
		// TODO Auto-generated method stub

	}

	@Override
	public void polygons() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveState() {
		// TODO Auto-generated method stub

	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Men m = new Men();
		m.play();
		m.pause();
		m.prepareTea();
	}

}
