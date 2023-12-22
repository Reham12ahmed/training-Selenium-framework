package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import pages.Login;
import pages.Registration;

public class Logintest extends Testbase{
	Home homepage;
	Login loginscreen;
	Registration reg;
	
	@Test
	public void usercanloginsuccessfully() {
		homepage=new Home(driver);
		homepage.OpenLoginPage();
		loginscreen=new Login(driver);
		loginscreen.userlogin("a@186.com", "P@ssw0rd");
		reg=new Registration(driver);
		Assert.assertTrue(reg.LogoutLink.getText().contains("Log out"));
		
		
	}


}
