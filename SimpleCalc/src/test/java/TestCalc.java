import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class TestCalc extends TestCase {

	Calculator calc = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(2, (int)calc.add(1,1));
		assertEquals(0, (int)calc.add(1,-1));
		assertEquals(4, (int)calc.add(1,3));
		assertEquals(0, (int)calc.add(0,0));
		assertNotEquals(-1, (int)calc.add(1,-1));
	}
	
	@Test
	public void testAddBooleans() {			
		assertNotNull((int)calc.add(2,4));
		assertNull(calc.add(999, 999));
	}
	
}
