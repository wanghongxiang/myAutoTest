package testng.depends;

import org.testng.annotations.Test;

public class DependsGroup1 {

	@Test(groups="group1")
	public void GroupMethod1(){
		System.out.println("DependsGroup1  This is GroupMethod1");
		throw new RuntimeException();
	}
	
	@Test(groups="group2",dependsOnMethods="GroupMethod1")
	public void GroupMethod2(){
		System.out.println("DependsGroup1  This is GroupMethod2");
	}
}
