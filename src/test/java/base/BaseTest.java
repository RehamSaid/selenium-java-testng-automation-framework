package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    @BeforeClass
    public void SetUp(){
        driver=new FirefoxDriver();
        homePage= new HomePage(driver);
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void getHomePage(){
        driver.get("https://the-internet.herokuapp.com");
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
