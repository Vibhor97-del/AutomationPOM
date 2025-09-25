package StepsDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;

    private By txt_username = By.id("user-name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login-button");
    private By title  = By.xpath("//div[@class='app_logo']");

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("This not Login Page. The Current page is " + driver.getCurrentUrl());
        }
    }
    public void enterusername(String username){
        driver.findElement(txt_username).sendKeys(username);

    }
    public void enterpassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public boolean checkTitleisDisplayed(){
        return driver.findElement(title).isDisplayed();

    }



}
