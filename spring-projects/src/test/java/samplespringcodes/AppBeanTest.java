package samplespringcodes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppBeanTest {
	@Test
	public void testAppend(){
		String appName = "Test Name";
		AppBean appBean = new AppBean("Test Name","app");
		assertEquals(appName+".app",appBean.append());
	}
}
