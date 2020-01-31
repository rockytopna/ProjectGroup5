package tests;

import homepage.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest8 extends DropDownMenu
{
    @Test
    public void testClickOnNotAGift()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnGiftSubscriptions();
        element.clickOnNotAGift();
    }
    @Test
    public void testSubscribeToMagazineViaNotAGift()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnGiftSubscriptions();
        element.clickOnNotAGift();
        driver.get("https://subs.nymag.com/magazine/subscribe/official-subscription.html");
        element.clickOnSubscribeToDigAndPrint();
    }
}
