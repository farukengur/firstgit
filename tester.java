package test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {

	@Test
	void testTopla() {
		simpletest simple= new simpletest();
		int c= simple.topla(1, 2);
		assertEquals(3,c);
		}

}
