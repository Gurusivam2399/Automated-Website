package assessment;

import org.gscode.base.Browser;
import org.gscode.base.Locators;
import org.gscode.base.SeleniumBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase{
	
	@Test
	void searchLetscode() throws InterruptedException {
		setup(Browser.CHROME,"https://www.google.com/");
	//	WebElement element = element("name","q");
		type(element(Locators.name,"q"),"lets code with koushik",Keys.ENTER);
		Thread.sleep(3000);
		quit();
	}

}
