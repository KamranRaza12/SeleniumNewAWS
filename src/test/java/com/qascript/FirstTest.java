package com.qascript;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {


   /* @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
        //kamran
    }*/
	
    @Test
    public void OpenBrowser()  {
    	
    	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.close();
    
    }


}


