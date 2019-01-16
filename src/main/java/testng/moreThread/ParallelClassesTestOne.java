package testng.moreThread;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = "ParallelClassesTestOne")
public class ParallelClassesTestOne {
    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTestOne Before test-class. Thread id is: " + id);
    }
 
    @Test(priority = 2,invocationCount = 3)
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Classes 1 testMethod 1. Thread id is: " + id);
    }
 
//    这里同时也是多个注解生效的方式，3个线程 一共执行6次
//    @Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
//    public void testMethodTwo() {
//        long id = Thread.currentThread().getId();
//        System.out.println("ParallelClassesTestOne Sample test-method Two. Thread id is: " + id);
//    }
 
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTestOne After test-class. Thread id is: " + id);
    }
}
