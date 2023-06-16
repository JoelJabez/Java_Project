package Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

class Main {
	public static void main(String[] args) {
//		String day = "Sun";
//
//		// *If condition
//		long ifStartTime = System.nanoTime();
//		if (day.equals("Mon") ||
//				day.equals("Tue") ||
//				day.equals("Wed") ||
//				day.equals("Thu") ||
//				day.equals("Fri")) {
//			System.out.println("It's a weekday");
//		} else if (day.equals("Sat") || day.equals("Sun")) {
//			System.out.println("It's a weekend");
//		}
//		long ifEndTime = System.nanoTime();
//
//		// *Switch statements
//		long switchStartTime = System.nanoTime();
//		switch (day) {
//			case "Mon", "Tue", "Wed", "Thu", "Fri" -> System.out.println("It's a weekday");
//			case "Sat", "Sun" -> System.out.println("It's a weekend");
//		}
//		long switchEndTime = System.nanoTime();
//
//		System.out.printf("Time taken for if condition to finish is %d microseconds\n", TimeUnit.NANOSECONDS.toMicros(ifEndTime - ifStartTime));
//		System.out.printf("Time taken for switch statement to finish is %d microseconds\n", TimeUnit.NANOSECONDS.toMicros(switchEndTime - switchStartTime));

		ArrayList<String> names = new ArrayList<>(Arrays.asList("Joel", "Jabez", "Alice"));
		ArrayList<String> test = new ArrayList<>(Arrays.asList("Bob"));
		test = names;

		System.out.println(test);
	}
}