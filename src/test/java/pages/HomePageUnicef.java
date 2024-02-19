package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class HomePageUnicef extends BasePage {

    private By donateButton = By.cssSelector("a[data-label='Donate']");
    public void GetHomePage() {
        driver.get("https://www.unicef.org/");
    }

    public void clickDonateButton() {
        driver.findElement(donateButton).click();
    }
}