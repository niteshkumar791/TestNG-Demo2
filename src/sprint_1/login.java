package sprint_1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class login extends base {

	@Test(priority=1,description="FB login test case",enabled=true)
	public void FacebookLogin() {
		System.out.println("Line1");
        logger =  extent.createTest("FB"); 		
        System.out.println("Line2");
		 logger.log(Status.INFO,"Entered username");
			//code for entering username
		 logger.log(Status.INFO, "Entered password");
			//code for password entering
		 logger.log(Status.INFO, "Clicked Login button");
			//code for login button
		 System.out.println("Inside FB test case");
		 Assert.assertTrue(true);
	}
	
	@Test(priority=2,enabled=true)
	public void tc02() {
		logger = extent.createTest("TC02");

		 logger.log(Status.INFO,"Entered username");
			//code for entering username
		 logger.log(Status.INFO, "Entered password");
			//code for password entering
		 logger.log(Status.INFO, "Clicked Login button");
			//code for login button
		 System.out.println("Inside TC02");
		 Assert.assertTrue(false);
	}
/*
	@Test(priority=3,enabled=false)
	public void tc03() {
		System.out.println("Inside TC03");
		//Assert.assertFalse(true);
		Assert.assertFalse(false);
	}*/
	
	
}
