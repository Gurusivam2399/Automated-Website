package org.gscode.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumApi {
	
	
	/**
	 * this method will launch the chrome browser with the given URl
	 * @author ASUS guru 
	 * @param url
	 */
	void setup(String url) ;
		
	
	/**
	 * this method will launch the given browser with the given URl
	 * @author ASUS guru 
	 * @param url
	 * @param browsername
	 */
	void setup(Browser browsername , String url);
	
	/**
	 * this function is used to close the active browser
	 * @author ASUS guru 
	 */
	void close();
	/**
	 * this function is used to quite the  browser instance
	 * @author ASUS guru 
	 */
	void quit();
	
	/**
	 * this method is used to find any webelement with in the page
	 * @author ASUS guru
	 * @param type - element type eg - id,name,linktext
	 * @param value - element value
	 * @return - webElement
	 */
	WebElement element(Locators type ,String value);
	
	/**
	 * this function is used to Switch to specific tab
	 * @author ASUS guru 
	 * @param i
	 */
	void switchtowindow(int i);
	
	/**
	 * this function is used to dropdown with the given value
	 * @author ASUS guru
	 * @param ele
	 * @param value
	 */
	void selectvalue(WebElement ele, String value);
	
	/**
	 * this function is used to dropdown with the given text
	 * @author ASUS guru
	 * @param ele
	 * @param text
	 */
	void selecttext(WebElement ele, String text);
	
	/**
	 * this function is used to dropdown with the given index
	 * @author ASUS guru
	 * @param ele
	 * @param position
	 */
	void selectindex(WebElement ele, int position );
	
	/**
	 * this function will wait until is clickable and click
	 * @param ele
	 */
	void click(WebElement ele);
	
	/**
	 * this function will wait until the element is read and clear the existing value and type
	 * @param ele
	 */
	void type(WebElement ele , String TestData,Keys keys);
	
	/**
	 * this function will wait until the element is read and gets the input
	 * @param ele
	 */
	void appendtext(WebElement ele ,String testdata);
	
	/**
	 * this function return the active page title
	 * @return
	 */
	String getTitle();
	
	/**
	 * this function return the active page URl 
	 * @return
	 */
	String geturl();
	
	/**
	 * this function return the element is visible or not
	 * @return
	 */
	boolean isDisplayed(WebElement ele);
	
	
	
}
