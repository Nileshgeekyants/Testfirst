package amazon_Project;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("deprecation")
public class Amazon_Login {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	private WebElement Signin;
	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement Userid;
	@FindBy(xpath = "//*[@id='ap_password']")
	private WebElement Password;

	public Amazon_Login(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	
	public void Signin(WebDriver driver) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Signin.click();

	}

	public void Enter_Userid(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Userid.sendKeys("7030550255", Keys.ENTER);

	}

	public void Enter_Password(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Password.sendKeys("Nilesh@1234", Keys.ENTER);
	}

}
