// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CreatenewPostLJTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void createnewPostLJ() {
    driver.get("https://morena-morana.livejournal.com/1378380.html?media&ila_campaign=medius&ila_location=category_psihologiya&ila_context=psihologiya_block");
    driver.manage().window().setSize(new Dimension(1936, 1048));
    driver.findElement(By.cssSelector(".s-logo .s-logo-title")).click();
    driver.findElement(By.cssSelector(".short-post-toolbar__item:nth-child(3) span")).click();
    driver.switchTo().frame(3);
    driver.findElement(By.cssSelector(".text-0-2-59")).click();
    driver.findElement(By.cssSelector(".text-0-2-59")).sendKeys("Новый пост");
    driver.findElement(By.cssSelector(".public-DraftStyleDefault-block")).click();
    driver.findElement(By.cssSelector(".text-0-2-59")).sendKeys("Новый Пост");
    driver.findElement(By.cssSelector(".notranslate")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".notranslate"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<div data-contents=\"true\"><div class=\"contentEditableHelper beforeAll\" style=\"height: 1px; overflow: hidden; font-size: 0px; opacity: 0;\"></div><div class=\"aentry-post__block--unstyled\" data-block=\"true\" data-editor=\"djs2u\" data-offset-key=\"16gg0-0-0\"><div data-offset-key=\"16gg0-0-0\" class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"><span data-offset-key=\"16gg0-0-0\"><span data-text=\"true\">Hello world!</span></span></div></div><div class=\"contentEditableHelper afterAll\" data-offset-key=\"16gg0-0-0\" style=\"height: 1px; overflow: hidden; font-size: 0px; opacity: 0;\"></div></div>'}", element);
    }
    driver.findElement(By.cssSelector(".submitBtn-0-2-77 > .rootIn-0-2-95")).click();
  }
}
