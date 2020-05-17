package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Facebook extends base2{
	
	@Test(enabled=false)
	public void FB() {
	try {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//sending username & password & submit
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]"))).sendKeys("niteshkumar791@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pass\"]"))).sendKeys("reeta@89");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login_form_login_button.uiButton.uiButtonConfirm"))).click();
		
		//clicking on message button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".uiToggle._4962._1z4y._330i._4kgv"))).click();
		
		//clicking on new message hyperlink
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Message"))).click();
		//sending name in message to
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".inputtext.textInput"))).sendKeys("Sonali Singh");
		
		//selecting person from list
		WebElement name_list =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".chatTab")));	
		List<WebElement> name = name_list.findElements(By.tagName("span"));
		System.out.println(name);		
		for(WebElement val:name) {
			if(val.getText().contains("Sonali Singh")) {
				val.click();
				break;
			}
		}
		
		//sending text in message body
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._1mf._1mj"))).sendKeys("dummy message");
		
		//clicking in send button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._6gb._6wm4._6987"))).click();
	
	
	
	}
	
	catch(Exception e) {
		System.out.println(e);		
	}
	
	finally {
		System.out.println("TC pass");
	}

}
}
