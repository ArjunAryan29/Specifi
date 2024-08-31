
package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;
import static pages.Specifi_Login.*;
import static utility.BrowserDriver.driver;

public class RefactorSteps {
    @Given("I enter the URL using <{string}>")
    public void openBrowser(String browser)  throws Throwable  {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
        }
        BrowserDriver.openBrowser(browser);
        driver.get("https://app.specifidev.co.uk/login");
        driver.manage().window().maximize();
        System.out.println("Title of the page:" + driver.getTitle());
    }


    @When("I enter the username and password and click on login")
    public void iEnterCreds() throws Throwable  {
        Login_Specifi();
    }

}
