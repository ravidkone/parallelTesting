package com.parallel.test;

import org.testng.annotations.Test;

public class parallelTestExecution1 extends base{

	
	@Test
	public void tc_5() {
		System.out.println("Test case 5: "+Thread.currentThread().getId());
	}
	@Test
	public void tc_6() {
		System.out.println("Test case 6:"+Thread.currentThread().getId());
	}
	@Test
	public void tc_7() {
		System.out.println("Test case 7: "+Thread.currentThread().getId());
	}
	@Test
	public void tc_8() {
		System.out.println("Test case 8: "+Thread.currentThread().getId());
	}
}
