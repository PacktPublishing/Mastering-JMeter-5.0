package selTestTwo;

import org.junit.Test;

/*
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestForHtmlUnit {
	@Test
	public void jmeterTestMethodHtml(){
		
		WebDriver Driver = new HtmlUnitDriver();		
		Driver.get("http://ebay.com");
		System.out.println(Driver.getTitle());
		Driver.close();
		
	}

}

*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestForHtmlUnit {
/*
	public TestForHtmlUnit() {
		   // Do nothing
		}

		public TestForHtmlUnit(String test) {
		  this();
		} */
	@Test
	public void jmeterTestMethodHtml(){

        WebDriver driver = new HtmlUnitDriver();
        driver.manage().window().maximize();
        driver.get("https://ebay.com/");
        //System.out.println("Invoking Facebook through HtmlUnitDriver");
        System.out.println(driver.getTitle());
    }
}