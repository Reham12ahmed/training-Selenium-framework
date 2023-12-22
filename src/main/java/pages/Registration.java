package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends PageBase{


	public Registration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "FirstName")
	WebElement FirstName1;

	@FindBy(id = "LastName")
	WebElement LastName1;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement Password0;

	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPassword1;

	@FindBy(id = "consent1")
	WebElement checkbox;

	@FindBy(id = "register-button")
	WebElement registerbutton;

	@FindBy(id = "SourceOfEnquiry")
	WebElement SourceOfEnquiryDDL;

	@FindBy(xpath = "//*[@id=\"SchemeList\"]")
	WebElement DevelopmentDDL;

	@FindBy(id = "PrimaryInterest")
	WebElement PrimaryInterestDDL;

	@FindBy(css = "div.result")
	public WebElement successmessage;

	@FindBy(linkText = "Log out")
	public WebElement LogoutLink;

	@FindBy(id = "GrossAnnualHouseIncome")
	WebElement thefirstquestion;

	@FindBy(id = "tll_homeowner")
	WebElement thesecquestion;

	@FindBy(id = "tll_Aged18orOverEnum")
	WebElement thethirdquestion;

	@FindBy(id = "tll_rightofukresidency")
	WebElement theforthquestion;

	@FindBy(css = "button.reg-btn")
	WebElement nextbutton;

	public void userRegistration(String FirstName ,String LastName ,String Email ,String Password , String ConfirmPassword ,String Sourceofenquiry ,String Development, String PrimaryInterest) {
		//email.sendKeys(Email);
		//Password.sendKeys(enteredPassword);
		//Loginbutton.click();

		Settextinelements(FirstName1, FirstName);
		Settextinelements(LastName1, LastName);
		Settextinelements(email, Email);
		Settextinelements(Password0, Password);
		Settextinelements(ConfirmPassword1, Password);
		selectfromDDL(SourceOfEnquiryDDL, Sourceofenquiry);
		selectfromDDL(DevelopmentDDL, Development);
		selectfromDDL(PrimaryInterestDDL, PrimaryInterest);
		clickbutton(checkbox);
		clickbutton(registerbutton);


	}

	public void usercanlogout() {
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		clickbutton(LogoutLink);

	}

	public void Eligibilitycheck(String value , String currenthomeowner , String yourage , String residency) {
		Settextinelements(thefirstquestion, value);
		clickbutton(thesecquestion);
		selectfromDDL(thesecquestion, currenthomeowner);
		clickbutton(thethirdquestion);
		selectfromDDL(thethirdquestion, yourage);
		clickbutton(theforthquestion);
		selectfromDDL(theforthquestion, residency);
		clickbutton(nextbutton);


	}

}
