package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Connect With Us']"));
        System.out.println(heading1.isDisplayed()? "Heading validation PASSED" : "Heading validation FAILED");

        WebElement fBLogo = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        System.out.println(fBLogo.isDisplayed() ? "Facebook logo is DISPLAYED" : "Facebook logo is NOT DISPLAYED");

        WebElement facebookLink = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/103179127717601']"));
        System.out.println(facebookLink.isDisplayed() && facebookLink.isEnabled() ? "Facebook link validation PASSED" : "Facebook link validation FAILED");
//        System.out.println(facebookLink.getText().equals("https://www.facebook.com/103179127717601") ? "Facebook link validation PASSED" : "Facebook link validation FAILED"); ASK WHY IT IS FAILED

        WebElement insLogo = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));
        System.out.println(fBLogo.isDisplayed() ? "Instagram logo is DISPLAYED" : "Instagram logo is NOT DISPLAYED");

        WebElement insHyperlink = driver.findElement(By.xpath("//a[@href='https://www.instagram.com/comfyelite']"));
        System.out.println(insHyperlink.isDisplayed() && insHyperlink.isEnabled() ? "Instagram link validation PASSED" : "Instagram link validation FAILED");

        Driver.quitDriver();
    }
}
