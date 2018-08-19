package com.testng1;

import org.testng.annotations.Test;

import com.toyota.libraries.BaseClass;

public class NewTest1 extends BaseClass{
	


  @Test(priority=0)
  public void f1() {
	  System.out.println("method1");
  }
  
 
  
  @Test
  public void f4() {
	  System.out.println("method4");
  }
  

}


//before suite
//	before test
//		before class
//			before method
//				Method
//			AfterMethod
//		After Class
//	After Testg
//After Suite