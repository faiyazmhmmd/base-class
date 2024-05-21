package BaseClass;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample extends base {

	@BeforeClass
	public static void brforeclass() {
		browserLaunch_static("CHROME");
		enterApplnUrl_static("https://www.linkedin.com/");
		maximizeWindow_static();
		implicitWait_static();

	}

	@AfterClass
	public static void Afterclass() {
		closeCurrentWindow_static();
	}
	@Test
	public void ExecutionClass() throws InterruptedException {
		//1.login
		Login l=new Login();
		l.Loginpage("faiyazmohammed1996@gmail.com","madurai@123");
	//2.search
		SearchPage s=new SearchPage();
		
		Thread.sleep(2000);
		Assert.assertEquals("verify login page","FAIYAZ MOHAMMED ABUTHAGIR",s.getTxtLoginSuccessMsg());
		s.search();

	}
	
	

}
