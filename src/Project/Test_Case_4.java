package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Driver.firstThree();

        WebElement fName = driver.findElement(By.xpath("//div[@data-aid='First Name']/input"));
        WebElement lName = driver.findElement(By.xpath("//div[@data-aid='Last Name']/input"));
        WebElement email = driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_EMAIL']/input"));
        WebElement message = driver.findElement(By.xpath("//div[@data-ux='Block']/textarea"));

        fName.sendKeys("Deniz");
        System.out.println(fName.getAttribute("value").equals("Deniz") ? "First name validation PASSED" : "First name validation FAILED");
        lName.sendKeys("Taskin");
        System.out.println(lName.getAttribute("value").equals("Taskin") ? "Last name validation PASSED" : "Last name validation FAILED");
        email.sendKeys("d-taskin@outlook.com");
        System.out.println(email.getAttribute("value").equals("d-taskin@outlook.com") ? "Email validation PASSED" : "Email validation FAILED");
        message.sendKeys("Hello World");
        System.out.println(message.getAttribute("value").equals("Hello World") ? "Message validation PASSED" : "Message validation FAILED");

        Driver.quitDriver();

    }
}
