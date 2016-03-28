package helloworld.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import helloworld.core.HelloWorldHelper;

public class HelloWorldHelperTests {

	private HelloWorldHelper helloWorldHelper = new HelloWorldHelper();

	@Test
	public void HelloWorldHelperReturnsAPopulatedString() {
		String testString = "Hello Jenkins";
		String helperReturnedString = helloWorldHelper.SaySomething(testString);
		assertNotNull(helperReturnedString);
	}
	
	@Test
	public void HelloWorldHelperReturnsSameString() {
		String testString = "Hello Jenkins";
		String helperReturnedString = helloWorldHelper.SaySomething(testString);
		assertEquals(testString, helperReturnedString);
	}
}
