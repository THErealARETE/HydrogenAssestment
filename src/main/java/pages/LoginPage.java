package pages;

import controller.Controller;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage extends Controller {

    private void setEmail(String email) {
        waitForVisibilityOfElementByID(util.LocatorReader.getLocator("emailField")).sendKeys(email);   }

    private void setPassword(String password) {
        waitForVisibilityOfElementByID(util.LocatorReader.getLocator("passwordField")).sendKeys(password);
    }

    private void clickLoginButton() {
        waitForVisibilityOfElementByID(util.LocatorReader.getLocator("loginButton")).click();
    }

    public void cleanLogin(String email, String password) throws IOException {
        openPage();
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }


}
