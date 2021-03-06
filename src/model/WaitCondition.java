package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCondition extends VP {
	
	/** 
	* @Title: waitTitleContains 
	* @Date:2017年9月13日
	* @author qiang.zhang@ck-telecom.com
	* @Description: 等待页面title包含标题
	* @param title
	* @param timeOutInSeconds 
	*/
	public static void waitTitleContains(String title,int timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public static void waitElementToBeClickable(By by,int timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	public static void waitElementToBeSelected(WebElement element,int timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public static void waitPresenceOfElementLocated(By by,int timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	public static void waitTextToBePresentInElementValue(By locator,String text,int timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
	}
}
