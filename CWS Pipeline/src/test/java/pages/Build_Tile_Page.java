package pages;

import utility.BrowserDriver;
import utility.TestData;
import utility.XPathConstants;

import java.io.IOException;
import java.time.Duration;

public class Build_Tile_Page extends BrowserDriver {

    public static void Tiles_Validation() throws IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        BrowserDriver.Text_Assertion(driver,XPathConstants.Proposal_Title_Txt,TestData.Proposal_title_txt);
    }
}