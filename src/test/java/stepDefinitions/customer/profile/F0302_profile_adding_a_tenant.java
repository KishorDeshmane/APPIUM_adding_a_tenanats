package stepDefinitions.customer.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class F0302_profile_adding_a_tenant {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath="")
	private WebElement adding_a_tenants;

	/**
	 * 
	 * 
	 * 
	 */

	public F0302_profile_adding_a_tenant(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 */
	
	
}
