package amazon_Project;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("deprecation")
public class Add_Cart {
	WebDriver driver;
	@FindBy(xpath = "//a[@id='nav-hamburger-menu']/i")
	private WebElement MenuSection;
	@FindBy(xpath = "//*[text()='Mobiles, Computers']")
	private WebElement MobileSection;
	@FindBy(xpath = "//*[text()='All Mobile Phones']")
	private WebElement AllMobiles;
	@FindBy(xpath = "//*[@alt='A54']")
	private WebElement OppoMobile;
	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	private WebElement AddToCart;
	@FindBy(xpath = "//*[@id='nav-cart-count']")
	private WebElement CheckCart;
	@FindBy(xpath = "//*[@id='sc-subtotal-label-activecart']")
	private WebElement TotalItems;
	@FindBy(xpath = "//*[@value='Delete']")
	private WebElement RemoveItem;
	@FindBy(xpath = "//*[@id='sc-subtotal-label-activecart']")
	private WebElement RemainingItem;

	public Add_Cart(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void AllSection(WebDriver driver) throws InterruptedException {

		MenuSection.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public void MobileSection(WebDriver driver) throws InterruptedException {

		MobileSection.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void AllMobiles(WebDriver driver) throws InterruptedException {

		AllMobiles.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void OppoMobile(WebDriver driver) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(OppoMobile);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		OppoMobile.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void AddtoCart(WebDriver driver) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(AddToCart);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		AddToCart.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void Refersh(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void CheckCart(WebDriver driver) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(CheckCart);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		CheckCart.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public void TotalItems(WebDriver driver) throws InterruptedException {

		String subTotalItems = TotalItems.getText();
		System.out.println("AfterItemsAddedTotal: " + subTotalItems);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void RemoveItems(WebDriver driver) throws InterruptedException {

		RemoveItem.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void RemainingItem(WebDriver driver) throws InterruptedException {

		String subTotalItems = RemainingItem.getText();
		System.out.println("AfterItemsRemoveTotal: " + subTotalItems);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}
