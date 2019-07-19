package ash;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculator {
	calcu c= new calcu();
	@Test
	public void test() {
		assertEquals(7, c.add(4, 3));
		assertEquals(1, c.sub(4, 3));
	}
}
