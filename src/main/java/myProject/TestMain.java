package myProject;

import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMain {
	@Test
	public void testInputIsEven() {
		assertTrue(Main.checkIfInputIsAnEvenNumber(22));
	}
}
//web token- detects change in project and automatically check test case and update in github