package pages;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage extends masterpage{

WebDriver driver;
	
	public loginpage () throws Exception  {
		
	}
	
	public  boolean login(String username,String password) throws Exception {
		initialsetup();
	
	clickelement("login_button1");
	senddata("Enteremail_textbox",username);
	clickelement("loginwithatlassian");
	senddata("password_textbox",password);
	clickelement("login_button2");
	senddata("password_textbox",password);
	clickelement("login_button2");
	clickelement("createnewboard");
	senddata("addboardtitle","firstboard");
	clickelement("createboardbutton");
	senddata("enterlisttitle","firstone");
	clickelement("addlist");
	return iselementexists("homelink");
	}
	

}
