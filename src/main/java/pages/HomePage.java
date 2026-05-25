package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // locators
    private By formeAuthenticationLink= By.linkText("Form Authentication");
    private By dynamicLoadinLink=By.linkText("Dynamic Loading");
    // actions
    public LoginPage clickOnFormeAuthenticationLink(){
        driver.findElement(formeAuthenticationLink).click();
        return new LoginPage(driver);

    }
    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadinLink).click();
        return new DynamicLoadingPage(driver);
    }
}
