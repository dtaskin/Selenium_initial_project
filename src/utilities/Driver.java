package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){

    }
    private static WebDriver driver;

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/deniztaskin/IdeaProjects/Selenuim_initial_project/chromedriver");
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }
    public static void firstThree(){
        driver.get("https://comfyelite.com/");
        WebElement contactButton = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactButton.click();
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "Contact us page validation PASSED" : "Contact us page validation FAILED");
    }
    public static void quitDriver(){
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }
}
