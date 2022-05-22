package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_5 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Driver.firstThree();

        WebElement signUp = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement signUpInput = driver.findElement(By.cssSelector("input[data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));

        signUp.click();
        System.out.println(signUpInput.isSelected() ? "Checkbox is Toggled on = PASSED" : "Checkbox is Toggled off = FAILED");

        signUp.click();
        System.out.println(!signUpInput.isSelected() ? "Checkbox is Now Toggled off = PASSED" : "Checkbox is still Toggled on = FAILED");


        Driver.quitDriver();
    }
}
