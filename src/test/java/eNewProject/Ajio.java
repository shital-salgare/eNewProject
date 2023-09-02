package eNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Ajio {
  @Test
  public void ajio() throws InterruptedException 
  {
	  WebDriver d=new ChromeDriver();
	  d.get( "https://www.ajio.com/");
	  d.manage().window().maximize();
	  Thread.sleep( 1000);
	  d.close();
  }
}
