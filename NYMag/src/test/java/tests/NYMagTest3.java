package tests;

import homepage.NYMagSignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYMagTest3 extends NYMagSignUp
{
    @Test
    public void testThatYouCannotSignUpWithAnInvalidEmail()
    {
        NYMagSignUp signUp = PageFactory.initElements(driver, NYMagSignUp.class);
        signUp.typeEmailName("pnt.com");
        signUp.clickOnSubmit();
    }
    @Test
    public void testThatYouCanSignUpWithValidEmail()
    {
        NYMagSignUp signUp = PageFactory.initElements(driver, NYMagSignUp.class);
        signUp.typeEmailName("tom@pnt.com");
        signUp.clickOnSubmit();
    }
    @Test
    public void testThatSubscribeBtnWorks()
    {
        NYMagSignUp subscribeBtn = PageFactory.initElements(driver, NYMagSignUp.class);
        subscribeBtn.clickOnSubscribeBtn();
    }
    @Test
    public void testThatUserCannotSignInWithInvalidCredentials()
    {
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeEmailName("mpnt.com");
        signIn.typeUserPassword("abcd1234");
        signIn.clickOnSignInBtn();
    }
    @Test
    public void testThatUserCanSignInWithValidCredentials()
    {
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeEmailName("m@pnt.com");
        signIn.typeUserPassword("Abcd1234!");
        signIn.clickOnSignInBtn();
    }
    @Test
    public void testThatUserCannotSignInWithoutEmail()
    {
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeUserPassword("Abcd1234!");
        signIn.clickOnSignInBtn();
    }
    @Test
    public void testThatUserCannotSignInWithoutPassword()
    {
        NYMagSignUp signIn = PageFactory.initElements(driver, NYMagSignUp.class);
        signIn.clickOnUserSignInBtn();
        signIn.typeEmailName("m@pnt.com");
        signIn.clickOnSignInBtn();
    }
}
