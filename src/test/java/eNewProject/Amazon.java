package eNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Amazon {
  @Test
  public void test1() throws InterruptedException 
  {
	  
	  WebDriver d =new ChromeDriver();
	  d.get( "https://www.amazon.in/");
	  d.manage().window().maximize();
	  Thread.sleep(2000);
	  d.close();
  }
}
