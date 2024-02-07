package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.base_class.BasePage;

import java.util.Random;
public class TrekBikesRegisterPage extends BasePage {
    private By fieldNome = By.id("nome");
    private By validaMessage = By.className("alert");



    public void OpenTrekRegisterPage(){

        driver.get("https://www.trekbikes.com/us/en_US/login/");
    }








}
