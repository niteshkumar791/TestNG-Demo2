package sprint_1;


import org.testng.annotations.Test;

public class sprint2 extends base {

	@Test(dataProvider="getdata")
	public void tc04(String un,String pwd) {
		
		System.out.println("Username is = " + un);
		System.out.println("Password is = " + pwd);
	}
	
	
}
