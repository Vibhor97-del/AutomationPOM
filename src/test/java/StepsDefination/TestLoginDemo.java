package StepsDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestLoginDemo{
    WebDriver driver = null;
    Loginpage login;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("=== I am inside browser is open ====");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @And("User is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://www.saucedemo.com/" );


    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password){
        login = new Loginpage(driver);
        login.enterusername(username);
        login.enterpassword(password);
    }

    @And("User clicks on login button")
    public void user_clicks_on_login_button() {
        login.clickLogin();

    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        login.checkTitleisDisplayed();
        Thread.sleep(2000);
        driver.close();
    }

}
