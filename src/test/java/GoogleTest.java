import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GoogleTest extends BaseTest {


    @Test
    public void checkIfPageContainsImages() {
        getHomePage().search("image");
        getSearchPage().waitForElementToBeVisible(getSearchPage().getImageTab(),30);
        getSearchPage().clickImages();
        getSearchPage().waitForElementToBeVisible(getSearchPage().getSingleImage(),30);
        assertTrue(getSearchPage().getImages().size() != 0);
    }

}


