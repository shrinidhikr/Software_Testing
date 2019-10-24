import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassTest {

	@Test
	public void testAddNumbers() {
		//fail("Not yet implemented");
		TestClass t = new TestClass();
		int r = t.addNumbers(8, 6);
		assertEquals(14,r);
	}
	@Test
    public void testAddStrings() {
        //System.out.println("addStrings");
        String a = "Shrinidhi ";
        String b = "KR";
        TestClass instance = new TestClass();
        String expResult = "Shrinidhi KR";
        String result = instance.addStrings(a, b);
        assertEquals(expResult, result);
    }
}
