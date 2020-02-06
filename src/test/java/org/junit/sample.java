package org.junit;

public class sample {
	@Test
	public void test1() { 
		Assert.assertTrue("verify mesg", true);

	}
	@Ignore
	@Test
	
	public void test11() { 
		Assert.assertTrue("verify mesg", true);

	}
	@Test
	public void test12() { 
		Assert.assertTrue("verify mesg", false);

	}@Test
	public void test14() { 
		Assert.assertTrue("verify mesg", true);

	}


}


