package tests;

import homepage.DropDownMenu2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest10 extends DropDownMenu2
{
    @Test
    public void CurrentIssueIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnCurrentIssue();
    }
    @Test
    public void CrosswordIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnCrossword();
    }
    @Test
    public void GiftSubscriptionIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnGiftSubscription();
    }
    @Test
    public void TheUrbanistIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnTheUrbanist();
    }
    @Test
    public void BestOfNYIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnBestOfNewYork();
    }
    @Test
    public void VideosIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnVideos();
    }
    @Test
    public void BestDoctorsIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnBestDoctors();
    }
    @Test
    public void LegalLeadersIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnLegalLeaders();
    }
    @Test
    public void NewslettersIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnNewsletters();
    }
    @Test
    public void AboutIconHover()
    {
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnAbout();
    }
}
