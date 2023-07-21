package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BlinkIt 
{
  @Test
  public void blinkItTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://blinkit.com/");
	  Thread.sleep(1000);
	  driver.close();
  }
}
