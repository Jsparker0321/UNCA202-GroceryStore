import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		Customer junit = new Customer(40, 3);
		int result = junit.decreaseTime();
		assertEquals(105, result);
	}

}
