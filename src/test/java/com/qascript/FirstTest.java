package com.qascript;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class FirstTest {


  @Test
    public void OpenBrowser()  {
    	WebDriver driver;
    	
    	//String chromeDriverPath = System.getenv("CHROMEDRIVER_PATH");
    	//System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    	//driver = new ChromeDriver();

    	
    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("New Updates to be printed on console");

        System.out.println("TestCase 1");
        
		driver.close();
    
    }
  

   /* @Test
    public void OpenBrowserNew()  {
    	WebDriver driver;
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamran\\Downloads\\chromedriver.exe");
    	//ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //options.addArguments("disable-gpu");
        //driver = new ChromeDriver(options);
    	//System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
    	//System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
    	driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("New Updates to be printed on console");

        System.out.println("TestCase 2");
        
		driver.close();
    
    }*/
}


