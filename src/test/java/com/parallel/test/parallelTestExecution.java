package com.parallel.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class parallelTestExecution extends base{
public static	WebDriver driver;
	
	@Test
	public void tc_1() {
			System.out.println("Test case 1: "+Thread.currentThread().getId());
	
		
	}
	@Test
	public void tc_2() {
		System.out.println("Test case 2: "+Thread.currentThread().getId());
	}
	@Test
	public void tc_3() {
		System.out.println("Test case 3: "+Thread.currentThread().getId());
	}
	@Test
	public void tc_4() {
		System.out.println("Test case 4: "+Thread.currentThread().getId());
	}

}
