package explore;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHelloWorld {
  @Test
  public void testEmailGenerator() {
	  RandomEmailGenerator obj = new RandomEmailGenerator();
      String email = obj.generate();

      Assert.assertNotNull(email);
      Assert.assertEquals(email, "feedback@yiibai.com");	
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
//  这个方法很重要，能够搞定多数据测试的情况
//  注意注解中的方法要完全一致
  @Test(dataProvider="TestCase")
  public void printBillSale (BillSale billSale){
	  System.out.println(billSale.getBillid() + " === " + billSale.getBillNo());
  }
}
