package testng.depends;

import org.testng.annotations.Test;

public class DependsGroup2 {

	@Test(groups="group3",dependsOnGroups={"group2","group1"})
	public void GroupMethod1(){
		System.out.println("DependsGroup2 This is GroupMethod1");
	}
	
	
	@Test(groups="group4",dependsOnGroups={"group2","group3"})
	public void GroupMethod2(){
		System.out.println("DependsGroup2 This is GroupMethod2");
	}
}
