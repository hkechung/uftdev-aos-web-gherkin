package net.hpe.presales;

import java.io.IOException;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.Verify;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;


/**
 * Created by Administrator on 8/14/2016.
 */
public class AdvantageStepDefinitions
{
    Browser browser;

    @Before
    public void beforeVerifyScenario(Scenario scenario) throws IOException, GeneralLeanFtException, ReportException {
        //the following will start a new test node in the report
        browser = BrowserFactory.launch(BrowserType.CHROME);
    }

    @After
    public void afterVerifyScenario() throws InterruptedException, ReportException, GeneralLeanFtException {
        browser.close();
    }

    @Given("^I am in the site$")
    public void i_am_in_the_site() throws Throwable
    {
        //browser = BrowserFactory.launch(BrowserType.CHROME);
        //browser.navigate("http://www.advantageonlineshopping.com/#/");
        browser.navigate("http://dockerserver:8000/#/");
    }

    @And("^I select the Mice category$")
    public void i_select_the_Mice_category() throws Throwable
    {
        WebElement miceCategory = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("micesImg categoryCell").tagName("DIV").build());
        miceCategory.highlight();
        miceCategory.click();
    }

    @When("^I filter by \"([^\"]*)\" color$")
    public void iFilterByColor(String strSelectColor) throws Throwable
    {
        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("H4").innerText("COLOR ").build()).click();

        String strHexColor = null;
        switch (strSelectColor.toLowerCase()) {
            case "white":
                strHexColor = "FFFFFF";
                break;
            case "black":
                strHexColor = "414141";
                break;
            case "blue":
                strHexColor = "3683D1";
                break;
            case "gray":
                strHexColor = "C3C3C3";
                break;
            case "purple":
                strHexColor = "545195";
                break;
            case "red":
                strHexColor = "DD3A5B";
                break;
            case "yellow":
                strHexColor = "FCC23D";
                break;

        }

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("productColor ").id("productsColors"+strHexColor).tagName("A").innerText("").build()).click();
    }

    @Then("^the mouse price is \"([^\"]*)\"$")
    //public void the_mouse_price_is(double dblPrice) throws Throwable {
    public void the_mouse_price_is(String dblPrice) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(2000);
        String strWebPrice = browser.describe(WebElement.class, new CSSDescription(".category-type-products .cell:nth-child(2) ul .ng-scope:nth-child(1) p:nth-child(5) .productPrice")).getInnerText();

        //Verify.areEqual(Double.toString(dblPrice),strWebPrice.trim());
        //This to generate the html report
        Verify.areEqual(dblPrice, strWebPrice.trim());

        //Assert.assertTrue(dblPrice.trim().equals(strWebPrice.trim()));
        //This to have junit report correct for reporting to Octane
        if (Reporter.getStatus() == Status.Failed){
            Assert.fail();
        }
        // throw new PendingException();
    }
}
