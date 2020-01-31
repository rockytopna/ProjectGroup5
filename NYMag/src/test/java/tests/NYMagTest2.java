package tests;

import homepage.NYMagHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest2 extends NYMagHomepage
{
    @Test
    public void intelligencerHover()
    {
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnIntelligencerTab();
    }
    @Test
    public void theCutHover()
    {
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnTheCutTab();
    }
    @Test
    public void vultureHover()
    {
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnVultureTab();
    }
    @Test
    public void grubStreetHover()
    {
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnGrubStreetTab();
    }
    @Test
    public void strategistHover()
    {
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnStrategistTab();
    }
    @Test
    public void burgerIconHover()
    {
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnBurgerIcon();
    }
}
