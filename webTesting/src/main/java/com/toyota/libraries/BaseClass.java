package com.toyota.libraries;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
//	AutoIT
//	Git
//	Jenkins
//	api automation
//	database
//	External sheets
//	Config files for object creation
	
	
}
