package tests;

import homepage.NYMagHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest extends NYMagHomepage
{
    @Test
    public void intelligencerTabs()
    {
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnIntelligencerTab();
    }
    @Test
    public void theCutTabs()
    {
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnTheCutTab();
    }
    @Test
    public void vultureTabs()
    {
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnVultureTab();
    }
    @Test
    public void grubStreetTab()
    {
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnGrubStreetTab();
    }
    @Test
    public void strategistTab()
    {
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnStrategistTab();
    }
    @Test
    public void clickOnBurgerIcon()
    {
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.clickOnBurgerIcon();
    }
}
