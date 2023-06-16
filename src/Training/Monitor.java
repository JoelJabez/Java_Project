package Training;

public interface Monitor {
	void printDescription();

	String getMinimumSize();

	String getMaximumSize();

	default void printSize() {
		System.out.println(getMaximumSize());
	}
}
