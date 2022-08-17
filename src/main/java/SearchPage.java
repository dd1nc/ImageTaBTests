import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {


    private static final String IMAGES = "//img[@class='rg_i Q4LuWd']";
    private static final String IMAGE_TAB = "//a[@data-hveid = 'CAEQAw']";

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickImages() {
        driver.findElement(By.xpath(IMAGE_TAB)).click();
    }

    public List<WebElement> getImages() {
        return driver.findElements(By.xpath(IMAGES));
    }
    public WebElement getImageTab() {
        return driver.findElement(By.xpath(IMAGE_TAB));
    }
    public WebElement getSingleImage(){
        return driver.findElements(By.xpath(IMAGES)).get(0);
    }
}
