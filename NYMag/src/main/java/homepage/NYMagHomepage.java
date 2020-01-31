package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NYMagHomepage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".tab-trigger.intelligencer")
    public static WebElement intelligencerWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.wwwthecut")
    public static WebElement theCutWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.vulture")
    public static WebElement vultureWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.grubstreet")
    public static WebElement grubStreetWebElement;

    @FindBy(how = How.CSS, using = ".tab-trigger.strategist")
    public static WebElement strategistWebElement;

    @FindBy(how = How.CSS, using = ".nav-dropdown-button-trigger")
    public static WebElement burgerIcon;

    public static WebElement getIntelligencerWebElement()
    {
        return intelligencerWebElement;
    }

    public static WebElement getTheCutWebElement()
    {
        return theCutWebElement;
    }

    public static WebElement getVultureWebElement()
    {
        return vultureWebElement;
    }

    public static WebElement getGrubStreetWebElement()
    {
        return grubStreetWebElement;
    }

    public static WebElement getStrategistWebElement()
    {
        return strategistWebElement;
    }
    public static WebElement getBurgerIcon()
    {
        return burgerIcon;
    }
    public void clickOnIntelligencerTab()
    {
        getIntelligencerWebElement().click();
    }
    public void clickOnTheCutTab()
    {
        getTheCutWebElement().click();
    }
    public void clickOnGrubStreetTab()
    {
        getGrubStreetWebElement().click();
    }
    public void clickOnVultureTab()
    {
        getVultureWebElement().click();
    }
    public void clickOnStrategistTab()
    {
        getStrategistWebElement().click();
    }
    public void clickOnBurgerIcon()
    {
        getBurgerIcon().click();
    }

    public void hoverOnIntelligencerTab()
    {
        mouseHoverByCSS(".tab-trigger.intelligencer");
    }
    public void hoverOnTheCutTab()
    {
        mouseHoverByCSS(".tab-trigger.wwwthecut");
    }
    public void hoverOnVultureTab()
    {
        mouseHoverByCSS(".tab-trigger.vulture");
    }
    public void hoverOnGrubStreetTab()
    {
        mouseHoverByCSS(".tab-trigger.grubstreet");
    }
    public void hoverOnStrategistTab()
    {
        mouseHoverByCSS(".tab-trigger.strategist");
    }
    public void hoverOnBurgerIcon()
    {
        mouseHoverByCSS(".nav-dropdown-button-trigger");
    }



}
