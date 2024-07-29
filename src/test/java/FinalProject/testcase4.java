package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testcase4 {
	
	@Test
	public void adduser() throws InterruptedException 
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
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[6]/div/button[1]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Charlie");	
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();

        
}

}
