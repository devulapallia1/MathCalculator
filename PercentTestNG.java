package mathCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PercentTestNG {
	
	WebDriver driver;
    @BeforeClass
    public void openBrowser() {
    	
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        //Launch the Chrome driver
        driver = new ChromeDriver();
        
        //Get the browser url
        driver.get("http://www.calculator.net");
        
        //Maximize the window
        driver.manage().window().maximize();
        
        //Click on Math calculator
        driver.findElement(By.xpath("//*[@id='homelistwrap']/div[3]/div[2]/a")).click();
        
        //Click on Percentage calculator
        driver.findElement(By.xpath("//*[@id='content']/table[2]/tbody/tr/td/div[3]/a")).click();
        
    }

    @Test
    public void TestCase1() throws InterruptedException {
    	driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("50");
		driver.findElement(By.xpath("//*[@id='content']/form[1]/table/tbody/tr[2]/td/input[2]")).click();
		Thread.sleep(5000);
        
    }
    
    @Test
    public void TestCase2() throws InterruptedException {
    	driver.findElement(By.name("c21par1")).sendKeys("20");
		driver.findElement(By.name("c21par2")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\'content\']/form[2]/table/tbody/tr/td[2]/input[2]")).click();
		Thread.sleep(5000);
    }
    
    @Test
    public void TestCase3() throws InterruptedException {
    	driver.findElement(By.name("c22par1")).sendKeys("20");
		driver.findElement(By.name("c22par2")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\'content\']/form[3]/table/tbody/tr/td[2]/input[2]")).click();
		Thread.sleep(5000);
    }
    
    @Test
    public void TestCase4() throws InterruptedException {
		driver.findElement(By.name("c23par1")).sendKeys("15");
		driver.findElement(By.name("c23par2")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\'content\']/form[4]/table/tbody/tr/td[2]/input[2]")).click();
		Thread.sleep(5000);
    }
    
    @Test
    public void TestCase5() throws InterruptedException {
    	driver.findElement(By.name("c3par1")).sendKeys("40");
		driver.findElement(By.name("c3par2")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\'content\']/form[5]/table/tbody/tr[3]/td/input[2]")).click();
		Thread.sleep(5000);
    }
    
    @Test
    public void TestCase6() throws InterruptedException {
    	driver.findElement(By.name("c2par1")).sendKeys("60");
		driver.findElement(By.name("c2par2")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\'content\']/form[6]/table/tbody/tr[2]/td/input[2]")).click();
		Thread.sleep(5000);
    }

    @AfterClass
    public void closeBrowser() {
            driver.quit();
        }
    }
