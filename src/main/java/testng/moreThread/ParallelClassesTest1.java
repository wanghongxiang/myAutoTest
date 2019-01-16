package testng.moreThread;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class ParallelClassesTest1 {
    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTest1 Before test-class. Thread id is: " + id);
    }
 
    @Test
    public void testMethodOne_001() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTest1 testMethodOne_001 1. Thread id is: " + id);
    }
 
    

    
    @Test
    public void testMethodOne_003() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTest1 testMethodOne_003 1. Thread id is: " + id);
    }
    
    @Test
    public void testMethodOne_002() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTest1 testMethodOne_002 1. Thread id is: " + id);
    }
    
    @Test
    public void testMethodOne_004() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTest1 testMethodOne_004 1. Thread id is: " + id);
    }
    
    
    
    
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("ParallelClassesTest1 After test-class. Thread id is: " + id);
    }
}
