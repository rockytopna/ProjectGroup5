package tests;

import homepage.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest6 extends DropDownMenu
{
    @Test
    public void testClickOnRestaurantsAndBars()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnRestaurantsAndBars();
    }
    @Test
    public void testClickOnThousandBest()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnThousandBest();
    }
    @Test
    public void testClickOnGiftGuides()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnGiftGuides();
    }
    @Test
    public void testClickOnSales()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnSales();
    }
    @Test
    public void testClickOnBeauty()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBeauty();
    }
    @Test
    public void testClickOnHome()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnHome();
    }
    @Test
    public void testClickOnDining()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnDining();
    }
    @Test
    public void testClickOnFashion()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnFashion();
    }
    @Test
    public void testClickOnTravel()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnTravel();
    }
    @Test
    public void testClickOnElectronics()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnElectronics();
    }
    @Test
    public void testClickOnFitness()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnFitness();
    }
    @Test
    public void testClickOnKids()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnKids();
    }

}
