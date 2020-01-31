package base;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


   @FindBy(className = "gh-p")
   public static WebElement getDailyDeal;

   @FindBy(id = "gh-ac")
   public static WebElement searchBar;

   @FindBy(id = "gh-btn")
   public static WebElement searchBotton;

   @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
   public static WebElement motorSectionHover;

   @FindBy(className = "hl-cat-nav__js-tab")
   public static WebElement motorSection;

   @FindBy(xpath = "\"//a[@class='gh-p'][contains(text(),'Sell')]\"")
   public static WebElement sellerPage;

   @FindBy( linkText = "Help & Contact")
   public static WebElement helpAndContactCenter;


   @FindBy( linkText = "eBay Money Back Guarantee")
   public static WebElement moneyBack;


   public static WebElement getHelpAndContactCenter() {
      return helpAndContactCenter;

   }

   public static WebElement getMoneyBack(){
      return moneyBack;
   }

   public void clickkHelpCenter(){
      getHelpAndContactCenter().click();
   }

   public void clickMoneyBack() {
      getMoneyBack().click();

   }



//    @FindBy(how = How.CLASS_NAME, using = "gh-p")
//    public static WebElement dailyDeal;



//
//    }
//
//    @Test
//    public void iphoneSearchTest2() throws InterruptedException {
//        System.out.println(driver.getTitle());
//        typeOnElement("gh-ac", "iPhone");
//        clickOnElement("gh-btn");
//        Thread.sleep(2000);
//
//    }
//
//    @Test
//    public void motorSectonTest3() throws InterruptedException {
//        driver.findElement(By.cssSelector(".hl-cat-nav__container > li:nth-of-type(3) > a")).click();
//        Thread.sleep(2000);
//    }
//
//    @Test
//    public void findallPartsTest4() throws InterruptedException {
//        motorSectonTest3();
//        clickOnElement("//a[contains(text(),'All Parts & Accessories')]");
//        Thread.sleep(2000);
//    }
//
//    @Test
//    public void selectCarAndTruckPartsTest5() throws InterruptedException {
//        findallPartsTest4();
//        clickOnElement("//div[@id='w2']//li[5]//a[1]");
//        Thread.sleep(1000);
//
//    }
//
//    @Test
//    public void findSignInBottonTest6() throws InterruptedException {
//        clickOnElement("//a[contains(text(),'Sign in')]");
//        Thread.sleep(2000);
//
//    }
//
//    @Test
//    public void sellerPageTest7() throws InterruptedException {
//        driver.findElement(By.xpath("//a[@class='gh-p'][contains(text(),'Sell')]")).click();
//        Thread.sleep(2000);
//    }
//
//    @Test
//    public void sellerItemSearchTest8() throws InterruptedException {
//        sellerPageTest7();
//        typeOnElement("#smac_complete", "Books");
//        clickOnElement("//button[@id='hero-keyword_searchBox-2[0]']");
//        Thread.sleep(2000);
//
//    }
//
//    @Test
//    public void brandoutletTest9() throws InterruptedException {
//        driver.findElement(By.xpath("//a[contains(text(),'Brand Outlet')]")).click();
//        Thread.sleep(1000);
//

}




