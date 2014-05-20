import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class Mytest extends TestCase{


	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		
		int result1 = Main.mymaxprofit(Main.i);
		int expResult1 = Main.maxprofit(Main.i);
		int result2 = Main.mystonewall(Main.i);
		int expResult2 = Main.stonewall(Main.i);
		//assertEquals(expResult1, result1);
		assertEquals(expResult2, result2);
        
		
	}

}
