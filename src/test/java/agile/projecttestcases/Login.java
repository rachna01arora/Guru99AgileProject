package agile.projecttestcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import agile.genericappmethods.AgileProjectmethods;

public class Login extends AgileProjectmethods {
    
	
	@Parameters({"applicationName"})
	
	@BeforeTest
	public void setData(String applicationName) throws IOException, InterruptedException, AWTException {
		testCaseName = "Login in Agile" + applicationName;
		testDescription = "The following test case is to login into Guru 99 Agile application";
		nodes = "login" + applicationName;
		category = "Smoke";
		authors = "Rachna";
		dataSheetName="test";
	}
	
	@Test(dataProvider="fetchData")	
	public void logintest(String property, String UserID, String Password){
		startapp(property,UserID, Password);

		closeapp();
	}

	
}
