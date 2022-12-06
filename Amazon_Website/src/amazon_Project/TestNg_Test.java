package amazon_Project;

 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class TestNg_Test {
	WebDriver driver;

	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void AmazonLogin() throws InterruptedException {
		Amazon_Login al = new Amazon_Login(driver);
		al.Signin(driver);
		al.Enter_Userid(driver);
		al.Enter_Password(driver);
	}

	@Test(priority = 1)
	public void AddToCart() throws InterruptedException {
	Add_Cart ac = new Add_Cart(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.AllSection(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.MobileSection(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.AllMobiles(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.OppoMobile(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.AddtoCart(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.Refersh(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ac.CheckCart(driver);
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.TotalItems(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.RemoveItems(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ac.RemainingItem(driver);
		
	}

	
	@AfterClass
	public void BrowserClose() throws InterruptedException {
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.quit();
	}
}
