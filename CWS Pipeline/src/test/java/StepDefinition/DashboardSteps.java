
package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static pages.BB_Details.BB_Details_Validation;
import static pages.Proposal_Dashboard_Page.*;

public class DashboardSteps {


    @And("i click on proposal option")
    public void iClickOnProposalOption() {
        Proposal_Creation();
    }
}
