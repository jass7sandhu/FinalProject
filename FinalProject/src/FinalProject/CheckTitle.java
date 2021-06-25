package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTitle{

    @Test
    public void testlogo(){
    	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jasss\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String actualTitle = "Google";
        Assert.assertEquals(driver.getTitle(), actualTitle );
       WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")  );
       Assert.assertEquals(true, logo.isDisplayed());
        System.out.println("Pass");
        driver.close();
}
}

