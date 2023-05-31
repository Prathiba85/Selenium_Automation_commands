package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation_class_1 {
	@BeforeTest
	void beforetest()
	{
		System.out.println("This is from Before test");
	}
	@Test
	void class1_method1()
	{
		System.out.println("This is test from class1");
	}
	void class1_method2()
	{
		System.out.println("This is test from class1");
	}

}
