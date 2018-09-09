package testng.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFactoryCase {
	private int param;
	public TestFactoryCase(int param){
		this.param = param;
	}
	
	@DataProvider(name="testCase1")
	public Object[][] aa(){
		return new Object[][]{
			{"Data1"},
			{"Data2"}
		};
	}
	
	@Test(dependsOnMethods = {"test2"})
	public void test1(){
		System.out.println("Test method 1 with param values: " + this.param);
	}
	@Test(dataProvider="testCase1")
	public void test2(String Name){
		System.out.println("Test method 2 with param values: " + this.param + " Name: " + Name);
	}
}
