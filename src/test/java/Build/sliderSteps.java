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


public class sliderSteps {
    WebDriver driver;
    String sliderange;
    @Given("^I launch website$")
    public void launchWeb() throws Throwable {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();


    }

    @When("^I move slider to max$")
    public void moveMax() throws Throwable {
        //Evaluate heading
        assertTrue( "Slider Heading is not displayed", driver.findElement(By.cssSelector("div#content h3")).isDisplayed());
        //Evaluate Slider display
        assertTrue( "Slider Heading is not displayed", driver.findElement(By.cssSelector("div#content input[type=\"range\"]")).isDisplayed());
        //Move the slider
        WebElement slider= driver.findElement(By.cssSelector("div#content input[type=\"range\"]"));
        int width=slider.getSize().getWidth();
        Actions move = new Actions(driver);
        org.openqa.selenium.interactions.Action action  = move.dragAndDropBy(slider, ((width*50)/100), 0).build();
        action.perform();
        Thread.sleep( 3000 );

    }

    @Then("^I evaluate max position$")
    public void evaluateMax() throws Throwable {
        sliderange=driver.findElement(By.cssSelector("span#range")).getText();
        System.out.println("Slide Range:"+sliderange);
       assertTrue( "Max value is not as expected",sliderange.equals( "5" ) );


    }
    @When("^I move slider to min$")
    public void moveMin() throws Throwable {
         WebElement slider= driver.findElement(By.cssSelector("div#content input[type=\"range\"]"));
        for(int i=0;i<=30;i++){
                        //Slide to LEFT
            slider.sendKeys( Keys.ARROW_LEFT);
        }

      Thread.sleep(  3000 );
    }

    @Then("^I evaluate min position$")
    public void evaluateMin() throws Throwable {
        sliderange=driver.findElement(By.cssSelector("span#range")).getText();
        System.out.println("Slide Range:"+sliderange);
        assertTrue( "Min value is not as expected",sliderange.equals( "0" ) );
        driver.quit();
    }

}
