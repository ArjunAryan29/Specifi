package pages;

import utility.BrowserDriver;
import utility.TestData;
import utility.XPathConstants;


import java.io.IOException;
import java.time.Duration;

public class Proposal_Dashboard_Page extends BrowserDriver {

    public static void Proposal_Creation(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        BrowserDriver.clickByXpath(driver,XPathConstants.Proposals_And_Projects_Tab);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        BrowserDriver.clickByXpath(driver,XPathConstants.Proposals_Tab);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        BrowserDriver.clickByXpath(driver,XPathConstants.Create_Proposal_Btn);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void Enter_Proposal_Details(){
        BrowserDriver.DDByVisibleText(driver,XPathConstants.Proposal_Priority_DD,TestData.DropDown_Value);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Proposal_Name_Tbx,TestData.Proposal_Name);
        BrowserDriver.ScrollToElement(driver,XPathConstants.Post_Code_Tbx);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.First_Name_Tbx,TestData.First_Name);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Last_Name_Tbx,TestData.Last_Name);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Phone_Number_Tbx,TestData.Phone_Number);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Email,TestData.Email_Address);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Address_Line1_Tbx,TestData.First_Line_Address);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Address_Line2_Tbx,TestData.Second_Line_Address);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.City_Tbx,TestData.City);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Post_Code_Tbx,TestData.Post_Code);
        BrowserDriver.ScrollToElement(driver,XPathConstants.Create_Proposal_Submit_Btn);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowserDriver.clickByXpath(driver,XPathConstants.Create_Proposal_Submit_Btn);
    }



    public static void Login_Specifi() throws IOException {
        BrowserDriver.clickByXpath(driver,XPathConstants.Login_ID);
        BrowserDriver.clearText(driver,XPathConstants.Login_ID);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Login_ID,TestData.Username);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.Password_CWS);
        BrowserDriver.clearText(driver,XPathConstants.Password_CWS);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.Password_CWS,TestData.Password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.Login_Btn);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public static void Success_Login_CWS() throws IOException {
        BrowserDriver.Text_Assertion(driver,XPathConstants.Home_Msg,TestData.Home_Msg);
    }

    public static void Enter_CRN(String CRN) throws IOException{
        BrowserDriver.clickByXpath(driver,XPathConstants.Patient_Search);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.CRN_Search);
        BrowserDriver.clearText(driver,XPathConstants.CRN_Search);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.CRN_Search,CRN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public static void Click_BB() throws IOException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.Blood_Bank);
    }
}