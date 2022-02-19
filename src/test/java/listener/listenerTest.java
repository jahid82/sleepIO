package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class listenerTest  {
	
	
	@Test
	void test1() {
		System.out.println("Test1-pass");
		Assert.assertEquals("A", "A");
	}
	
	@Test
	void test2() {
		System.out.println("Test2-Fail");
		Assert.assertEquals("A", "B");
	}
	@Test
	void test3() {
		System.out.println("Test3-skip");
		throw new SkipException("This is a skip exception");
	}

}
