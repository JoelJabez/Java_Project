package TDD;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
	@Test
	void total() {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2));
		assertEquals(3, Main.total(numbers));
	}
}