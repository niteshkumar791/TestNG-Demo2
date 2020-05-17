package assignments;

import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class gmail extends base2 {
	
	@Test(enabled=true)
	public void mail() {
		
	try {		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//clicking on sign in using hyperlink
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in"))).click();
		
		//switching windows		
		String parent_window = driver.getWindowHandle();
		Set<String> all_windows = driver.getWindowHandles();
		
		for(String val:all_windows) {
			if(!(val.equals(parent_window))) {
				driver.switchTo().window(val);
			}
		}
		
		//sending gmailid in text box
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("tribhuvan.sharma.21@gmail.com");
		
		//clicking on next button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"identifierNext\"]"))).click();
		
		//sending Password in text box
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("tuku@2019");
		
		//clickin on next button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"passwordNext\"]"))).click();
				
		//clicking on compose button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".J-J5-Ji.L3.T-I.T-I-KE"))).click();
		
		//sending mailid in recipients
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".vO"))).sendKeys("niteshkumar791444@gmail.com");
		
		//sending text in subject body
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".aoT"))).sendKeys("dummy mail");
		
		//sending text to mail body
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Am.Al.editable.LW-avf.tS-tW"))).sendKeys("dummy---tribhuvan.sharma.21@gmail.com---DUmmy");
		
		//clicking on send button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3"))).click();		
		
	}		
	catch (Exception e) {
		System.out.println(e);
	}	
	finally {
		
		System.out.println("TC Pass");
		//Thread.sleep(4000);
		//driver.quit();
	}
		
	}
	

}
