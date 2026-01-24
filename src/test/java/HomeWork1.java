import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        //maximize browser to windows
        driver.manage().window().maximize();
        //wait to upload all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

    @Test
    public void findElementByTagName() {
        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(h2.getText());

        WebElement h3 = driver.findElement(By.tagName("h3"));
        System.out.println(h3.getText());

        WebElement strong = driver.findElement(By.tagName("strong"));
        System.out.println(strong.getText());

        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println(label.getText());
    }

    @Test
    public void findElementById() {
        WebElement small = driver.findElement(By.id("small-searchterms"));
        System.out.println(small.getAttribute("id"));

        WebElement barNotification = driver.findElement(By.id("bar-notification"));
        System.out.println(barNotification.getAttribute("id"));
    }

    @Test
    public void findElementByClassName() {
        WebElement footer = driver.findElement(By.className("footer-disclaimer"));
        System.out.println(footer.getText());

        WebElement facebook = driver.findElement(By.className("facebook"));
        System.out.println(facebook.getLocation());

        WebElement icoLogin = driver.findElement(By.className("ico-login"));
        System.out.println(icoLogin.getText());

        WebElement headerLogo = driver.findElement(By.className("header-logo"));
        System.out.println(headerLogo.getTagName());
    }

    @Test
    public void findElementByCssSelector() {
        WebElement h2 = driver.findElement(By.cssSelector("h2"));
        System.out.println(h2.getText());

        WebElement h3 = driver.findElement(By.cssSelector("h3"));
        System.out.println(h3.getText());

        WebElement strong = driver.findElement(By.cssSelector("strong"));
        System.out.println(strong.getText());

        WebElement label = driver.findElement(By.cssSelector("label"));
        System.out.println(label.getText());

        driver.findElement(By.cssSelector("input[id=small-searchterms]"));
        driver.findElement(By.cssSelector(".bar-notification"));

        WebElement footer = driver.findElement(By.cssSelector(".footer-disclaimer"));
        System.out.println(footer.getText());

        driver.findElement(By.cssSelector("li.facebook"));

        WebElement icoLogin = driver.findElement(By.cssSelector(".ico-login"));
        System.out.println(icoLogin.getText());

        WebElement headerLogo = driver.findElement(By.cssSelector(".header-logo"));
        System.out.println(headerLogo.getTagName());

    }



}
