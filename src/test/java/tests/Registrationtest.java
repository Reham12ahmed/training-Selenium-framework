package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.PageBase;
import pages.Registration;

public class Registrationtest extends Testbase{
	Home home;
	Registration reg;
	PageBase base;
	Logintest loginobj;

	@Test(priority = 0)
	public void usercanregisterationsuccessfully() {
		home=new Home(driver);
		home.registerationPage();
		reg=new Registration(driver);
		reg.userRegistration("Reham", "Ahmed", "a@189.com", "P@ssw0rd", "P@ssw0rd","Google Search", "More Developments (Sales Portal)", "Private Sale");
		Assert.assertTrue(reg.successmessage.getText().contains("result"));
	
	}
	
	@Test(dependsOnMethods = {"usercanregisterationsuccessfully"})
	public void usercanlogout() {
		reg.usercanlogout();
			}

	/*@Test(priority = 1)
	public void Eligibilitychecktest() {
		loginobj=new Logintest();
		loginobj.usercanloginsuccessfully();
		reg.Eligibilitycheck("1000","No","Yes","Yes");
	}*/

}
