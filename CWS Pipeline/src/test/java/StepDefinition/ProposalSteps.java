
package StepDefinition;

import io.cucumber.java.en.And;

import static pages.Proposal_Dashboard_Page.*;


public class ProposalSteps {

    @And("I enter the Submit details of customer")
    public void iEnterTheBasicDetailsOfCustomer() {

        Enter_Proposal_Details();
    }
}
