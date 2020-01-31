package tests;

import homepage.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest7 extends DropDownMenu
{
    @Test
    public void testClickOnCurrentIssue()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnCurrentIssue();
    }
    @Test
    public void testClickOnCrossword()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnCrossword();
    }

    @Test
    public void testClickOnGiftSubscription()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnGiftSubscriptions();
    }

    @Test
    public void testClickOnTheUrbanist()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnTheUrbanist();
    }
    @Test
    public void testClickOnBestOfNewYork()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBestOfNewYork();
    }
    @Test
    public void testClickOnVideos()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnVideos();
    }
    @Test
    public void testClickOnBestDoctors()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBestDoctors();
    }
    @Test
    public void testClickOnLegalLeaders()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnLegalLeaders();
    }
    @Test
    public void testClickOnNewsletters()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnNewsletters();
    }
    @Test
    public void testClickOnAbout()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnAbout();
    }

}
