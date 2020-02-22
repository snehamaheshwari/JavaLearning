import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitConditionCheck {

	//Q #11) Write a Java Program to demonstrate explicit wait condition check.
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "src/../drivers/chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--disable-arguments");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.navigate().to("https://www.google.com");
       WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Testing");
        element.submit();
        WebDriverWait wait = new WebDriverWait(driver, 20);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Software testing - Wikipedia")));
		//element2.click();
}
}
