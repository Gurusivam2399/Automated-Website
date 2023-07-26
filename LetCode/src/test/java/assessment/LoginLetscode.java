package assessment;

import org.gscode.base.Locators;
import org.gscode.base.SeleniumBase;
import org.testng.annotations.Test;

public class LoginLetscode extends SeleniumBase{
	
	@Test()
	void login() {
		
		setup("https://letcode.in/");
		click(element(Locators.link,"Log in"));
		type(element(Locators.name,"email"),"gurusivamkl2309@gamil.com");
		type(element(Locators.name,"password"),"Guru2399");
		click(element(Locators.xpath,"(//button[@class='button is-primary'])[1]"));
		quit();
		
		
	}

}
