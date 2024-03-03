package QKART_TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListenerClass implements ITestListener{
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
      //  ITestListener.super.onTestStart(result);
        System.out.println("Test Case start"+result.getName());
        QKART_Tests.takeScreenshot("START_TEST",result.getName());
    }

   @Override
   public void onTestSuccess(ITestResult result) {
       // TODO Auto-generated method stub
       //ITestListener.super.onTestSuccess(result);
       System.out.println("Test Case succeded"+result.getName());
        QKART_Tests.takeScreenshot("SUCCESS", result.getName());

   }

   @Override
   public void onTestFailure(ITestResult result) {
       // TODO Auto-generated method stub
    //    ITestListener.super.onTestFailure(result);
    System.out.println("Test Case Failed"+result.getName());
        QKART_Tests.takeScreenshot("FAILURE", result.getName());
   }
    

}