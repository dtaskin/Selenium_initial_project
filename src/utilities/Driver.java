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
            /*
            WHY WE NEED IMPLICIT WAIT
            - This applies to each line that locates web elements
            -findElement() or findElements() if cannot find the element in 30 seconds -> NoSuchElementsException
             */
        }
        return driver;
    }
    public static void firstThree(){
        driver.get("https://comfyelite.com/");
        WebElement contactButton = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactButton.click();
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ? "Contact us page validation PASSED" : "Contact us page validation FAILED");
        //YOU CAN ALSO VALIDATE THE TITLE ON CONTACT US PAGE (RECAP)
    }
    public static void quitDriver(){
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }
}
