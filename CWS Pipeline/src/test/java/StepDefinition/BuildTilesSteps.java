
package StepDefinition;

import io.cucumber.java.en.And;

import java.io.IOException;

import static pages.Build_Tile_Page.Tiles_Validation;
import static pages.Proposal_Dashboard_Page.Proposal_Creation;

public class BuildTilesSteps {


    @And("I see whether all necessary tiles are displayed")
    public void TileValidation()throws IOException {
        Tiles_Validation();
    }
}
