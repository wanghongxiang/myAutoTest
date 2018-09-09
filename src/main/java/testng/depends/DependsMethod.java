package testng.depends;

import org.testng.annotations.Test;

public class DependsMethod {

//	配置了依赖之后，要不全部执行，如果被依赖的方法出现异常，那么依赖的方法会被跳过
	@Test
	public void method1(){
		System.out.println("This is method1");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "method1")
	public void method2(){
		System.out.println("This is method2");
	}
}
