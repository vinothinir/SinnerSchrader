package Build;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertTrue;


public class brokenImageSteps {
    WebDriver driver;
    @Given("^I launch the website$")
    public void i_launch_the_website() throws Throwable {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/broken_images");
        driver.manage().window().maximize();


    }

    @When("^I see the images$")
    public void i_see_the_images() throws Throwable {
       assertTrue( "Heading Broken Images is not displayed", driver.findElement(By.cssSelector("div#content h3")).isDisplayed());
        Thread.sleep( 2000 );
    }

    @Then("^I can evaluate the broken images$")
    public void i_can_evaluate_the_broken_images() throws Throwable {
        assertTrue( "First Broken image is not displayed", driver.findElement(By.cssSelector("div#content img:nth-child(2)")).isDisplayed());
        Thread.sleep( 1000 );
        assertTrue( "Second Broken image is not displayed", driver.findElement(By.cssSelector("div#content img:nth-child(3)")).isDisplayed());
        Thread.sleep( 1000 );
        assertTrue( "Third Broken image is not displayed", driver.findElement(By.cssSelector("div#content img:nth-child(4)")).isDisplayed());
        Thread.sleep( 1000 );
        //assertTrue( "First Broken image is not selected", driver.findElement(By.cssSelector("div#content img:nth-child(2)")).isSelected());
        driver.quit();
    }

}
