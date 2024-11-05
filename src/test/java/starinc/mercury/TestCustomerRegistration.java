package starinc.mercury;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import starinc.mercury.page.RegistrationPage;
import starinc.mercury.page.RegistrationConfirmationPage;


public class TestCustomerRegistration {	
	
	private WebDriver driver;

	RegistrationPage registrationPage = new RegistrationPage(driver);
	RegistrationConfirmationPage registrationConfirmationPage = new RegistrationConfirmationPage(driver);
	
	@Test
    public void customerRegistrationTest() {		
        
        registrationPage.goTo("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html");
        Assert.assertTrue(registrationPage.isAt());

        registrationPage.enterUserDetails("John", "Doe");
        registrationPage.enterUserCredentials("john.doe@ymail.com", "Pass@123");
        registrationPage.enterAddress("Wall St.", "Newyork", "10005");
        registrationPage.register();
        
        Assert.assertTrue(registrationConfirmationPage.isAt());
        Assert.assertEquals(registrationConfirmationPage.getFirstName(), "John");  
        
    }
}
