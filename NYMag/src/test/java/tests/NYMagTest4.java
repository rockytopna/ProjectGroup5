package tests;

import homepage.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest4 extends DropDownMenu
{
    @Test
    public void testThatSearchBarWorks()
    {
        DropDownMenu searchBar = PageFactory.initElements(driver, DropDownMenu.class);
        searchBar.clickOnBurgerIcon();
        searchBar.typeInSearchBar("Bernie Sanders");
        searchBar.clickOnSearch();
    }
    @Test
    public void testThatYouCannotSearchWithEmptyField()
    {
        DropDownMenu searchBar = PageFactory.initElements(driver, DropDownMenu.class);
        searchBar.clickOnBurgerIcon();
        searchBar.typeInSearchBar(" ");
        searchBar.clickOnSearch();
    }
    @Test
    public void testThatYouCanClearSearchBar()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.typeInSearchBar("Bernie Sanders");
        clearInputField(".nav-search-input");
        //searchBarWebElement.clear();
    }
    @Test
    public void testGetTextFromDropDownMenu()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.getTextDropDown();
    }
    @Test
    public void testClickOnIntelligencer()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnIntelligencer();
    }
    @Test
    public void testClickOnPolitics()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnPolitics();
    }
    @Test
    public void testClickOnTechnology()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnTechnology();
    }
    @Test
    public void testClickOnBusiness()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBusiness();
    }
    @Test
    public void testClickOnIdeas()
    {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnIdeas();
    }

}
