package BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends base {
	public Login(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="session_key")
	private  WebElement txtusername;
	
	@FindBy(id="session_password")
	private WebElement txtpassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public void Loginpage(String username, String pass) {
		elementSendKeys(txtusername, username);
		elementSendKeys(txtpassword, pass);
		elementclick(btnlogin);
	}
	

}
