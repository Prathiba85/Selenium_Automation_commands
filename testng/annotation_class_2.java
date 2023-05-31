package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class annotation_class_2 {
	@Test
	void class2_method1()
	{
		System.out.println("This is from class2 method2");
	}
	@Test
	void class2_method2()
	{
		System.out.println("This is from class2 method2");
	}
	@AfterTest
	void aftertest()
	{
		System.out.println("This is from After test");
	}
}
