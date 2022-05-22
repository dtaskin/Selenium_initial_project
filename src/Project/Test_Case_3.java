package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Driver.firstThree();

        WebElement contactUs = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']/span"));
        System.out.println(contactUs.getText().equals("Contact Us") ? "Contact us heading verification is PASSED" : "Contact us heading verification is FAILED");

        WebElement sendUsMessage = driver.findElement(By.xpath("//h4[text()='Send Us a Message']"));
        System.out.println(sendUsMessage.getText().equals("SEND US A MESSAGE") ? "Send us a message heading verification is PASSED" : "Send us a message heading verification is FAILED");

        Driver.quitDriver();
    }
}
