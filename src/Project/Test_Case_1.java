package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        Driver.firstThree();

        WebElement logo = driver.findElement(By.cssSelector("#n-48560"));
        System.out.println(logo.isDisplayed() ? "Logo validation is PASSED" : "Logo validation is FAILED");

        WebElement heading2 = driver.findElement(By.id("dynamic-tagline-48605"));
        System.out.println(heading2.getText().equals("High quality comfy pillows and accessories for travel, office and home.") ? "Heading2 validation is PASSED" : "Heading2 validation is FAILED");
        System.out.println(heading2.isDisplayed() ? "Heading2 is DISPLAYED" : "Heading2 is NOT DISPLAYED");

        Driver.quitDriver();
    }
}