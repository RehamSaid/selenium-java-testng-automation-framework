package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {
        this.driver=driver;
    }
//    locators
    private By example1Link= By.partialLinkText("Example 1:");
//    actions
    public OnePage clickOnExample1Link(){
        driver.findElement(example1Link).click();
        return new OnePage(driver);
    }
}
