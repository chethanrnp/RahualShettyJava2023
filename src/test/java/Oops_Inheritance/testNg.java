package Oops_Inheritance;

import org.testng.annotations.Test;
/*
 * In testNg when you extend the class you can call parent method with out creating object
 */
public class testNg extends ParentClass {

	@Test
	public void test() {
		gear();
	}
}
