
package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.BB_Details.BB_Details_Validation;
import static pages.Google_HP.Google_HomePage_Launch;
import static pages.Google_HP.Search_Btn_click;

public class GoogleHPSteps {

    @When("Homepage is Launched and i enter keyword amazon in search box")
    public void GHPLaunch() throws Throwable  {
        Google_HomePage_Launch();
    }


    @And("I click on Search button")
    public void iClickOnSearchButton() throws Throwable {
        Search_Btn_click();
    }
}
