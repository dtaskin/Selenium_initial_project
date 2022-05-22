package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_6 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Driver.firstThree();

        WebElement sendButton = driver.findElement(By.xpath("//button[@data-ux='ButtonPrimary']"));
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() ? "Send button validation PASSED" : "Send button validation FAILED");
        WebElement sendButtonText = driver.findElement(By.xpath("//button[text()='Send']"));
        System.out.println(sendButtonText.getText().equals("SEND") ? "Send button text validation PASSED" : "Send button text validation FAILED");

        Driver.quitDriver();
    }
}
