package Build;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static org.junit.Assert.assertTrue;


public class basicAuthSteps {
    WebDriver driver;
    @Given("^I launch authorization page with user credentials$")
    public void authPage() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Vino\\Personal\\Interview\\comwebtest\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        String username="admin";
        String password="admin";
        String hostname= "the"+"-"+"internet.herokuapp.com"+"/"+"basic_auth";
        String launchURL = "http://" + username + ":" + password + "@" + hostname;
        driver.get(launchURL);
        driver.manage().window().maximize();
        Thread.sleep( 2000 );


    }



    @Then("^I can see authorization success page$")
    public void successVerification() throws Throwable {
        assertTrue( "Basic Auth heading is not displayed", driver.findElement(By.cssSelector("div#content h3")).isDisplayed());
        assertTrue( "Success message is not displayed", driver.findElement(By.cssSelector("div#content p")).isDisplayed());
        String message=driver.findElement(By.cssSelector("div#content p")).getText();
        Thread.sleep( 2000 );
        System.out.print( "Success Message:"+message );
        assertTrue( "Authorization message is not displayed correctly", message.contains( "Congratulations!" ));

        driver.quit();
    }

}
