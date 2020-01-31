package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NYMagSignUp extends CommonAPI
{
    @FindBy(how = How.NAME, using = "email")
    public static WebElement enterEmailWebElement;

    @FindBy(how = How.CLASS_NAME, using = "submit")
    public static WebElement clickOnSubmitBtnWebElement;

    @FindBy(how = How.CSS, using = ".subscribe-link.global-nav-track")
    public static WebElement clickOnSubscribeBtn;

    @FindBy(how = How.CSS, using = ".user-button.sign-in-button")
    public static WebElement clickOnUserSignInBtn;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement enterPassword;

    @FindBy(how = How.CSS, using = ".auth0-label-submit")
    public static WebElement clickOnSignInBtnWebElement;

    public static WebElement getEnterEmailWebElement()
    {
        return enterEmailWebElement;
    }
    public static WebElement getClickOnSubmitBtnWebElement()
    {
        return clickOnSubmitBtnWebElement;
    }
    public static WebElement getClickOnSubscribeBtn()
    {
        return clickOnSubscribeBtn;
    }
    public static WebElement getClickOnUserSignInBtn()
    {
        return clickOnUserSignInBtn;
    }
    public static WebElement getEnterPassword()
    {
        return enterPassword;
    }
    public static WebElement getClickOnSignInBtnWebElement()
    {
        return clickOnSignInBtnWebElement;
    }

    public void typeEmailName(String value)
    {
        getEnterEmailWebElement().sendKeys(value);
    }
    public void clickOnSubmit()
    {
        getClickOnSubmitBtnWebElement().click();
    }
    public void clickOnSubscribeBtn()
    {
        getClickOnSubscribeBtn().click();
    }
    public void clickOnUserSignInBtn()
    {
        getClickOnUserSignInBtn().click();
    }
    public void typeUserPassword(String value)
    {
        getEnterPassword().sendKeys(value);
    }
    public void clickOnSignInBtn()
    {
        getClickOnSignInBtnWebElement().click();
    }

}
