package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testcase2 {

	
	@Test
	public void errormessage() throws InterruptedException 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]")).click();
	    
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("R");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=\"Employee Name\"]/../..//div[@role='option']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Rehana");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]")).click();
	
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("john123");
	
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("rehana");
	
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	
	    
	}	
}
