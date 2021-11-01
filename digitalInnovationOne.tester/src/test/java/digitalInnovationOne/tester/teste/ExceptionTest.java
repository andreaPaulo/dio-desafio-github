package digitalInnovationOne.tester.teste;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTest {
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}

}
