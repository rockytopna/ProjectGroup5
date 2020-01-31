package tests;

import homepage.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest5 extends DropDownMenu
{
    @Test
    public void testClickOnStyle()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnStyle();
    }
    @Test
    public void testClickOnSelf()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnSelf();
    }
    @Test
    public void testClickOnCulture()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnCulture();
    }
    @Test
    public void testClickOnPower()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnPower();
    }
    @Test
    public void testClickOnDesignHunting()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnDesignHunting();
    }
    @Test
    public void testClickOnWeddings()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnWeddings();
    }
    @Test
    public void testClickOnTV()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnTV();
    }
    @Test
    public void testClickOnMovies()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnMovies();
    }
    @Test
    public void testClickOnComedy()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnComedy();
    }
    @Test
    public void testClickOnMusic()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnMusic();
    }
    @Test
    public void testClickOnBooks()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBooks();
    }
    @Test
    public void testClickOnArt()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnArt();
    }
    @Test
    public void testClickOnTheater()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnTheater();
    }
    @Test
    public void testClickOnStream()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnStream();
    }

}
