package testng.annotation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHelloWorld {
	
//	使用在如果一段代码没有，准备好，可以下 设置为 没有就绪，执行的时候忽略他
  @Test(enabled = false)
  public void testEmailGenerator() {
	  RandomEmailGenerator obj = new RandomEmailGenerator();
      String email = obj.generate();
      System.out.println("testEmailGenerator: " + email);
      Assert.assertNotNull(email);
      Assert.assertEquals(email, "feedback@yiibai.com");	
  }
  
//  这个标签用于如果超时就算是失败
  @Test(timeOut = 3000) // time in mulliseconds
  public void testThisShouldPass() throws InterruptedException {
      Thread.sleep(2000);
  }
  @Test(expectedExceptions = ArithmeticException.class)
  public void divisionWithException() {
      int i = 1 / 0;
      System.out.println("After division the value of i is :"+ i);
  }
  
  @DataProvider(name="TestCase")
  public Object[][] aa(){
	  
	  BillSale billSale1 = new BillSale(1,"SX001"); 
	  BillSale billSale2 = new BillSale(2,"SX001"); 
	  BillSale billSale3 = new BillSale(3,"SX001"); 
	  BillSale billSale4 = new BillSale(4,"SX001"); 
	  BillSale billSale5 = new BillSale(5,"SX001"); 
	  
	  return new Object[][]{
          {billSale1},
          {billSale2},
          {billSale3},
          {billSale4},
          {billSale5}
	  };
  }

  
  @Test(dataProvider="TestCase")
  public void printBillSale (BillSale billSale){
	  System.out.println(billSale.getBillid() + " === " + billSale.getBillNo());
  }
}
