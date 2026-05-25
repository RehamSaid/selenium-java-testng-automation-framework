package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver=driver;
    }
//    locators
    private By successMessage= By.id("flash");
//    actions
    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }
}
