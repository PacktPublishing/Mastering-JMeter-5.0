package FirstSeleniumJmete;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTestClass {
	public FirstSeleniumTestClass() {
		   // Do nothing
		}

		public FirstSeleniumTestClass(String test) {
		  this();
		} 
	@Test
	public void FirstTestMethod() {
		
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.amazon.com/");
		System.out.println(dr.getTitle());
		//dr.close();
	}

}
