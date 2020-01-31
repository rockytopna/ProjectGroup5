package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DropDownMenu extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".nav-dropdown-button-trigger")
    public static WebElement burgerIcon;

    @FindBy(how = How.CSS, using = ".nav-search-input")
    public static WebElement searchBarWebElement;

    @FindBy(how = How.CSS, using =  ".nav-search-submit-button")
    public static WebElement clickOnSearch;

    @FindBy(how = How.CSS, using = ".dropdown-body-scroll")
    public static WebElement textFromDropDownMenu;

    public static WebElement getBurgerIcon()
    {
        return burgerIcon;
    }
    public static WebElement getSearchBarWebElement()
    {
        return searchBarWebElement;
    }
    public static WebElement getClickOnSearch()
    {
        return clickOnSearch;
    }
    public static WebElement getTextFromDropDownMenu()
    {
        return textFromDropDownMenu;
    }

    public void clickOnBurgerIcon()
    {
        getBurgerIcon().click();
    }
    public void typeInSearchBar(String value)
    {
        getSearchBarWebElement().sendKeys(value);
    }
    public void clickOnSearch()
    {
        getClickOnSearch().click();
    }
    public void getTextDropDown()
    {
        System.out.println(textFromDropDownMenu.getText());
    }
    //------------------------------------------------------------------------------------------
    public void clickOnIntelligencer()
    {
        clickOnElement("a[href='http://nymag.com/intelligencer/politics/']");
    }
    public void clickOnPolitics()
    {
        clickOnElement("a[href='http://nymag.com/intelligencer/politics/']");
    }
    public void clickOnTechnology()
    {
        clickOnElement("a[href='http://nymag.com/intelligencer/tech/']");
    }
    public void clickOnBusiness()
    {
        clickOnElement("a[href='http://nymag.com/intelligencer/business/']");
    }
    public void clickOnIdeas()
    {
        clickOnElement("a[href='http://nymag.com/intelligencer/ideas/']");
    }
    //--------------------------------------------------------------------------------------------

    public void clickOnStyle()
    {
        clickOnElement("//a[text()='Style']");
    }
    public void clickOnSelf()
    {
        clickOnElement("//a[text()='Self']");
    }
    public void clickOnCulture()
    {
        clickOnElement("//a[text()='Culture']");
    }
    public void clickOnPower()
    {
        clickOnElement("//a[text()='Power']");
    }
    public void clickOnDesignHunting()
    {
        clickOnElement("//a[text()='Design Hunting']");
    }
    public void clickOnWeddings()
    {
        clickOnElement("//a[text()=' Weddings']");
    }
    //-----------------------------------------------------------------------------------
    public void clickOnTV()
    {
        clickOnElement("//a[text()='TV']");
    }
    public void clickOnMovies()
    {
        clickOnElement("//a[text()='Movies']");
    }
    public void clickOnComedy()
    {
        clickOnElement("//a[text()='Comedy']");
    }
    public void clickOnMusic()
    {
        clickOnElement("//a[text()='Music']");
    }
    public void clickOnBooks()
    {
        clickOnElement("//a[text()='Books']");
    }
    public void clickOnArt()
    {
        clickOnElement("//a[text()='Art']");
    }
    public void clickOnTheater()
    {
        clickOnElement("//a[text()='Theater']");
    }
    public void clickOnStream()
    {
        clickOnElement("//a[text()='What to Stream']");
    }
    //-------------------------------------------------------------------------------------------
    public void clickOnRestaurantsAndBars()
    {
        clickOnElement("//a[text()='Restaurants & Bars']");
    }
    public void clickOnThousandBest()
    {
        clickOnElement("//a[text()='The Thousand Best']");
    }
    public void clickOnGiftGuides()
    {
        clickOnElement("//a[text()='Gift Guides']");
    }
    public void clickOnSales()
    {
        clickOnElement("//a[text()='Sales']");
    }
    public void clickOnBeauty()
    {
        clickOnElement("//a[text()='Beauty']");
    }
    public void clickOnHome()
    {
        clickOnElement("//a[text()='Home']");
    }
    public void clickOnDining()
    {
        clickOnElement("//a[text()='Kitchen + Dining']");
    }
    public void clickOnFashion()
    {
        clickOnElement("//a[text()='Fashion']");
    }
    public void clickOnTravel()
    {
        clickOnElement("//a[text()='Travel']");
    }
    public void clickOnElectronics()
    {
        clickOnElement("//a[text()='Tech + Electronics']");
    }
    public void clickOnFitness()
    {
        clickOnElement("//a[text()='Fitness']");
    }
    public void clickOnKids()
    {
        clickOnElement("//a[text()='Kids + Babies']");
    }
    //------------------------------------------------------------------------------------
    public void clickOnCurrentIssue()
    {
        clickOnElement("//a[text()='Current Issue']");
    }
    public void clickOnCrossword()
    {
        clickOnElement("//a[text()='Crossword']");
    }

    public void clickOnGiftSubscriptions()
    {
        clickOnElement("//a[text()='Gift Subscriptions']");
    }

    public void clickOnTheUrbanist()
    {
        clickOnElement("//a[text()='The Urbanist']");
    }
    public void clickOnBestOfNewYork()
    {
        clickOnElement("//a[text()='Best of New York']");
    }
    public void clickOnVideos()
    {
        clickOnElement("//a[text()='Videos']");
    }
    public void clickOnBestDoctors()
    {
        clickOnElement("//a[text()='Best Doctors']");
    }
    public void clickOnLegalLeaders()
    {
        clickOnElement("//a[text()='Legal Leaders']");
    }
    public void clickOnNewsletters()
    {
        clickOnElement("//a[text()='Newsletters']");
    }
    public void clickOnAbout()
    {
        clickOnElement("//a[text()='About']");
    }
    //----------------------------------------------------------------------------------------
    public void clickOnNotAGift()
    {
        clickOnElement("//a[text()='Not a Gift?']");
    }
    public void clickOnSubscribeToDigAndPrint()
    {
        clickOnElement("/html/body/section[2]/div/div/div/div/div/div[4]/div/div/div[2]/button/span[1]");
    }

}
