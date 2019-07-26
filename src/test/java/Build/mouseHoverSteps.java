package Build;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;


public class mouseHoverSteps {
    WebDriver driver;
    String sliderange;
    public String firstimagedetail,secondimagedetail,thirdimagedetail;
    @Given("^I am on the website$")
    public void launchWeb() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Vino\\Personal\\Interview\\comwebtest\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();


    }

    @When("^I mouse hover on the picture$")
    public void mouseHoverPic() throws Throwable {
        //Evaluate heading
        assertTrue( "Hover Heading is not displayed", driver.findElement(By.cssSelector("div#content h3")).isDisplayed());
        //Evaluate display of images
        assertTrue( "First image is not displayed", driver.findElement(By.cssSelector("div#content div:nth-child(3) > img")).isDisplayed());
        assertTrue( "First image is not displayed", driver.findElement(By.cssSelector("div#content div:nth-child(4) > img")).isDisplayed());
        assertTrue( "First image is not displayed", driver.findElement(By.cssSelector("div#content div:nth-child(5) > img")).isDisplayed());
        Actions action = new Actions(driver);
        WebElement fe=driver.findElement(By.cssSelector("div#content div:nth-child(3) > img"));
        action.moveToElement(fe).build().perform();
        Thread.sleep( 2000 );
        firstimagedetail=driver.findElement(By.cssSelector("div#content div:nth-child(3) > div > h5")).getText();
        System.out.print( "FirstImage Detail"+firstimagedetail );
        WebElement se=driver.findElement(By.cssSelector("div#content div:nth-child(4) > img"));
        action.moveToElement(se).build().perform();
        Thread.sleep( 2000 );
        secondimagedetail=driver.findElement(By.cssSelector("div#content div:nth-child(4) > div > h5")).getText();
        System.out.print( "SecondImage Detail"+secondimagedetail );
        WebElement te=driver.findElement(By.cssSelector("div#content div:nth-child(5) > img"));
        action.moveToElement(te).build().perform();
        thirdimagedetail=driver.findElement(By.cssSelector("div#content div:nth-child(5) > div > h5")).getText();
        System.out.print( "ThirdImage Detail"+thirdimagedetail );
        Thread.sleep( 2000 );






    }

    @Then("^I evaluate the details of picture$")
    public void Details() throws Throwable {

        assertTrue( "First Image Detail is not correct",firstimagedetail.equals( "name: user1" ) );
        assertTrue( "Second Image Detail is not correct",secondimagedetail.equals( "name: user2" ) );
        assertTrue( "Third Image Detail is not correct",thirdimagedetail.equals( "name: user3" ) );
        driver.quit();


    }

}
