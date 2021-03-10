package Testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.loginpage;
import utility.Exceldata;

public class Firsttest {
	
	@DataProvider
	public Object[][] provideData() throws IOException {
		return(Exceldata.readdata("Sheet1"));
	}
		
		
		loginpage lp;
		@Test(dataProvider="provideData")
		public void logintest(String uname,String pass) throws Exception {
			
		
		lp=new loginpage();
		Assert.assertTrue(lp.login(uname,pass),"login failed");
		
		}
		
}
