package sample;

import java.awt.SecondaryLoop;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omrbranch.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtlogin = driver.findElement(By.xpath("//input[@id='email']"));
		txtlogin.sendKeys("faiyazmhmmd@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Madurai@123");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	
        Thread.sleep(3000);
        //vreify is there any element in cart
       
        WebElement element_cart = driver.findElement(By.xpath("//span[@class='cart badge badge-xs badge-danger position-relative mr-0 cart_count']"));
        String text8 = element_cart.getText();
        
        String a="0";
        
        if(text8!=a) {
       
        WebElement btncart = driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
        btncart.click();
        	
        List<WebElement> btncancel1= driver.findElements(By.xpath("//div[@class='scheduleClose']"));
        
        Thread.sleep(3000);
        for (WebElement elements: btncancel1) {
        elements.click();
        }
        }
        
      //  driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
       //WebElement btncart = driver.findElement(By.xpath("//div[@class='scheduleClose']"));
        //btncart.click();
       
        WebElement btnclose = driver.findElement(By.xpath("//a[text()=' Close ']"));
        btnclose.click();
        
		//print welcome
        WebElement txtwelcome = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String text = txtwelcome.getText();
		System.out.println(text);
		
		//search and print nuts
		Thread.sleep(2000);
		WebElement txtsearch = driver.findElement(By.xpath("//input[@id='search']"));
		txtsearch.sendKeys("nuts");
		String attribute = txtsearch.getAttribute("value");
		System.out.println(attribute);
		
		//click search
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		//add nuts
		driver.findElement(By.xpath("(//a[text()='Add'])[1]")).click();
		
		//add variants
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
		
		//click cart
		Thread.sleep(3000);
		WebElement btngo_to_cart = driver.findElement(By.xpath("//a[@class='hover1']"));
		btngo_to_cart.click();
		
		//print go to cart title
		String title = driver.getTitle();
		System.out.println(title);
		
		//print deleiver add
		WebElement txttitle = driver.findElement(By.xpath("//div[text()='Delivery Address']"));
	    String text2 = txttitle.getText();
	    System.out.println(text2);
		
	    //to add adress
		WebElement txtadd = driver.findElement(By.xpath("//div[@data-toggle='modal']"));
	    txtadd.click();
	    
	    //add type
	    WebElement ddnaddtype = driver.findElement(By.xpath("//select[@name='address_type']"));
	    
	    Thread.sleep(3000);
	    Select se=new Select(ddnaddtype);
	    se.selectByVisibleText("Work ");
	    
	    WebElement txtfirstname = driver.findElement(By.xpath("(//input[@name='first_name'])[1]"));
	    txtfirstname.sendKeys("faiayz");
	    
	    WebElement txtlastname = driver.findElement(By.xpath("(//input[@name='last_name'])[1]"));
		txtlastname.sendKeys("maohamed");
		
		WebElement txtphonenum = driver.findElement(By.xpath("//input[@name='mobile']"));
		txtphonenum.sendKeys("9566456117");
		
		WebElement txtadd1 = driver.findElement(By.xpath("//input[@name='apartment']"));
		txtadd1.sendKeys("2/24 F sriram nagar");
		
		WebElement txtadd2 = driver.findElement(By.xpath("//input[@name='address']"));
		txtadd2.sendKeys("madurai");
		
		WebElement ddnstate = driver.findElement(By.xpath("//Select[@name='state']"));
	
		Select se1=new Select(ddnstate);
		se1.selectByValue("35");
		
		WebElement ddncity = driver.findElement(By.xpath("//Select[@name='city']"));
		Thread.sleep(3000);
		
		Select se2=new Select(ddncity);
		se2.selectByValue("3659");
		
		WebElement txtpinnum = driver.findElement(By.xpath("//input[@name='zipcode']"));
		txtpinnum.sendKeys("600026");
		
		WebElement btnsaveadd = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		btnsaveadd.click();
		
		WebElement titlepayment = driver.findElement(By.xpath("//div[text()='  Payment Method ']"));
		String text3 = titlepayment.getText();
		System.out.println(text3);
		
		
		Thread.sleep(2000);
		WebElement ddnpaymentmet = driver.findElement(By.id("payment_type"));
		Select s=new Select(ddnpaymentmet);
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		WebElement btnvisa = driver.findElement(By.xpath("//label[text()=' Visa ']"));
		btnvisa.click();
		
		WebElement txtcardnum = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		txtcardnum.sendKeys("5555555555552222");
		
		WebElement ddnmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(ddnmonth);
		s1.selectByIndex(2);
		
		WebElement ddnyear = driver.findElement(By.id("year"));
		Select s2=new Select(ddnyear);
		s2.selectByValue("2027");
		
		WebElement txtcvv = driver.findElement(By.xpath("//input[@name='cvv']"));
        txtcvv.sendKeys("0987");
        
        WebElement pricedet = driver.findElement(By.xpath("//div[text()='Price Details']"));
        String text4 = pricedet.getText();
        System.out.println(text4);
        
        WebElement totala = driver.findElement(By.xpath("(//div[@class='d-flex justify-content-between align-items-center mb-2'])[1]"));
		String text5 = totala.getText();
		System.out.println(text5);
		
		WebElement grand = driver.findElement(By.xpath("//div[@class='d-flex justify-content-between align-items-center mb-2 borderTop2 borderBottom2 py-2']"));
		String text6 = grand.getText();
		System.out.println(text6);
		
		WebElement btnplaceorder = driver.findElement(By.xpath("//button[@id='placeOrder']"));
		btnplaceorder.click();
		
		Thread.sleep(10000);
		WebElement ordernum = driver.findElement(By.xpath("//p[contains(text(),'Order No: ')]"));
		String text7 = ordernum.getText();
		System.out.println(text7);

		
	}

}
