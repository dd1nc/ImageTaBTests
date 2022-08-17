import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String SEARCH_BOX = "//input[@class='gLFyf gsfi']";
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        driver.findElement(By.xpath(SEARCH_BOX)).sendKeys(text, Keys.ENTER);
        ;
    }
}

