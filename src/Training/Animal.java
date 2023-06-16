package Training;

public class Animal {
	private int height;

	Animal(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void speak() {
		System.out.println("Hello");
	}

	Animal() {
		speak();
	}
}
