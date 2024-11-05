package starinc.mercury.page;

// import starinc.mercury.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FlightConfirmationPage extends BasePage {
	
	@FindBy(css = "#flights-confirmation-section .card-body .row:nth-child(1) .col:nth-child(2)")
	private WebElement flightConfirmationElement;
	
	@FindBy(css = "#flights-confirmation-section .card-body .row:nth-child(3) .col:nth-child(2)")
	private WebElement totalPriceElement;
	
	public FlightConfirmationPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public boolean isAt() {
		this.wait.until(ExpectedConditions.visibilityOf(this.flightConfirmationElement));
		return this.flightConfirmationElement.isDisplayed();
	}
	
	public String getPrice() {
		String price = this.totalPriceElement.getText();		
		return price;
	}
}