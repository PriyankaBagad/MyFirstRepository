package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart 
{
  @Test
  public void flipkartTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.close();
	  Thread.sleep(1000);
	  System.out.println("This is Flipkart Page...");
	  System.out.println("Made changes by Priyanka Shinkar...");
  }
}
