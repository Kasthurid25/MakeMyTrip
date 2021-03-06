package org.Make.Mytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAc {
	WebDriver driver =new FirefoxDriver();
	public void log()
	{
	driver.get("https://www.makemytrip.com/");
	}
public static void main(String[] args)	
{
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\Multimedia\\Downloads\\geckodriver-v0.29.0-win32\\geckodriver.exe"); 
	LoginAc	l1= new LoginAc();
	l1.log();
	
}

}
