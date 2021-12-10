package JUnitTestWebApp;
import static org.junit.Assert.*;

import org.junit.Test;

public class AddTestCase {

	@Test
	public void Addtest() {
		CasteUnitTest junit = new CasteUnitTest();
		int result = junit.add(100,200);
		assertEquals(300,result);
	}

}
