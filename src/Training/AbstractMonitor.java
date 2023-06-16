package Training;

public abstract class AbstractMonitor implements Monitor{
	@Override
	public void printDescription() {
		System.out.println("Minimum size: " + getMinimumSize());
		System.out.println("Maximum size: " + getMaximumSize());
	}
}
