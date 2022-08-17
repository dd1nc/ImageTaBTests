import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;

    private static final String URL = "https://www.google.com/";


    @BeforeTest
    public void setUp() {
        chromedriver().setup();
    }
    @BeforeMethod
    public void setUpDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }
    public SearchPage getSearchPage() {
        return new SearchPage(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

}
