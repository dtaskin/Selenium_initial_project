package utilities;

import org.openqa.selenium.WebDriver;

public class FirstThreeMethods {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
    }
}
