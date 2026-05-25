package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
//    locators
    private By userNameBox= By.cssSelector("#username");
    private By passwordBox=By.cssSelector("#password");
    private By loginButton=By.cssSelector(".fa.fa-2x.fa-sign-in");
    private By errorMessage=By.id("flash");
//    actions
    public void insertUserName(String name){
        driver.findElement(userNameBox).sendKeys(name);
    }
    public void insertPassword(String password){
        driver.findElement(passwordBox).sendKeys(password);
    }
    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}
