package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio 
{
  @Test
  public void ajioTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  driver.close();
	  Thread.sleep(1000);
	  System.out.println("This is Ajio Page...");
  }
}
