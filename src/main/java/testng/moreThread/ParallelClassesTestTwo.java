package testng.moreThread;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//,dependsOnGroups = { "ParallelClassesTestOne" }
@Test(groups = "ParallelClassesTestTwo",dependsOnGroups = { "ParallelClassesTestOne" })
public class ParallelClassesTestTwo {

    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTestTwo Before test-class. Thread id is: " + id);
    }
 
    @Test(priority = 1,invocationCount = 3)
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Classes 2 testMethod 1. Thread id is: " + id);
    }
 
    @Test(priority = 1,invocationCount = 3)
    public void testMethodTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Classes 2 testMethod 2. Thread id is: " + id);
    }
 
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTestTwo After test-class. Thread id is: " + id);
    }
}
