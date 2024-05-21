package org.base_class;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {
	
	 WebDriver driver;
	 
	//1.enter url
	 public void enterAppUrl(String Url) {
		 driver.get("url");
	    }
	
	 
    //2.maximize the window
	 public void maximizeWindow() {
		 driver.manage().window().maximize();
	 }
	//3.insert the value in textbox
	 public void elementSendkey(WebElement element,String value) {
		 element.sendKeys(value);
	 }
	 //4.click button
	 public void elementclick(WebElement element) { 
	 element.click();
	 }
    //5.click ok in alert box:
	 public void alertaccept() {
		 Alert al=driver.switchTo().alert();
		 al.accept();
	 }
	 //6.click cancel in alert box:
	public void clickCancleAlert() {
		Alert al=driver.switchTo().alert();
		al.dismiss();
	}
     //7.get text from web page
	 public String elementGetText(WebElement element) {
		  String text = element.getText();
		
		 return text;
	 }
	//8.get the instent value from textbox
    //String attribute=element.getAttribute(String attributevalue);
	 public String elementGetAttribute(WebElement element,String attributeValue) {
		 String attribute = element.getAttribute(attributeValue);
		return attribute;
		 
	 }
	             //(or)
	 public String elementGetAttribute(WebElement element) {
		 String attribute = element.getAttribute("value");
		return attribute;
		 
	 }
	 
	 
	 //9.close all window
	 //driver.quit();---i:no--o:no
	 public void closeAllWindow() {
	 
		 driver.quit();
	 }
	 
	 //10.close current window
	 //driver.close();---io:no--o:no
	 public void closeCurrentWindow() {
		 driver.close();
	 }
	 
	 //11.get title
	 //String title=driver.getTitle();---i:no---o:String
	 public String getAppTitle() {
		 String title = driver.getTitle();
		return title;
		 }
	
	 //12.get the entered Ulr in text
	 //String currentUrl = driver.getCurrentUrl();---i:no---o:String
	 public String getCurrentUrl() {
		 String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	 }
    
	 //13.select dropdown option by text
	 //Select is a class
	//Select objectName=new Select(element);
	//objectName.selectByVisibleText(String text);
	 public void SelectoptionBytext(WebElement element,String text) {
		Select se=new Select(element);
		se.selectByVisibleText(text);
		  }
	 
	 //14.select dropdown option by attributeValue
	 //Select is a class
	 //select objectName=new Select(element);
	 //objectName.selectByValue(String value);
	 public void SelectoptionByAttributevalue(WebElement element,String attributevalue) {
		 
		 Select se=new Select(element);
		 se.selectByValue(attributevalue);
		 }
	
	 
	    //15.select dropDown option by index
	    //Select is a class
		 //select objectName=new Select(element);
		 //objectName.selectByValue(int index);
	 public void selectOptionbyindex(WebElement element,int index) {
		 
		 Select se=new Select(element);
		 se.selectByIndex(index);
		}
	 //16.insert the value in textbox using Js
	 //JavaScriptExecution js=(JavaScriptExecutor)driver;
	 //js.executorScript("argument[0].setAttribute('value','helle')",webelement refname);
	 public void elementsendkeyJS(WebElement element,String data) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value','"+data+")'",element);
	 }
	 //17.click button by js
	 //JavaScriptExecution js=(JavaScriptExecutor)driver;
	 //js.executorScript("argument[0].click();"webelement element);
	 
	 
	//18.Web browser
		 public void browser() {
			driver=new ChromeDriver();
	       }
    //19.switch to child window
		 public void switchtochildWindow() {
			 String pwindow = driver.getWindowHandle();
			 Set<String> allwindows = driver.getWindowHandles();
			 for (String eachwindows : allwindows) {
				 if(!pwindow.equals(allwindows)) {
					 driver.switchTo().window(eachwindows);
				 }}}
	//20.switch to frame by index
		 public void switchtoframByIndex(int index) {
			 driver.switchTo().frame(index);
			 }
	//21.switch to frame by Id:
		 public void switchtoframeById(String Idname) {
			 driver.switchTo().frame(Idname);
		 }
	 
	//22.find the locator of id
	//WebElement locatorId=driver.findElement(By.id("AttributeValue"));
	//i:String---o:webelement
	 public WebElement findLocatorById(String attributeValue) {
		 WebElement element = driver.findElement(By.id(attributeValue));
		 return element;
	 
	 }
	//23.find the locator of name
	//WebElement locatorId=driver.findElement(By.name("AttributeValue"));
    //i:String---o:WebElement
	 public WebElement findLocatorByName(String AttributeValue) {
		 WebElement element = driver.findElement(By.name(AttributeValue));
		 return element;
	  }
	 
	//24.find the locator by classname:
	//webelement locatorclassname=driver.findelement(By.className(classattribute));
	//i:string----o:webelement
	 public WebElement findlocatorByclassName(String classAtribute) {
		 WebElement element = driver.findElement(By.className(classAtribute));
		return element;
		 
	 }
	 
	 //25.find the locator by xpath:
	 public WebElement findlocatorByxpath(String xpath) {
		 WebElement element = driver.findElement(By.xpath(xpath));
		return element;
		  }
	 
	 //26.get all option from dropdown as text:
	 //Select se=new Select(element);
	 //list<webelement>option=se.getoption();
	 //for(int i=0;i<option.size();i++){
	 // se,selectByindex(i);}
	 //list<webelement>alloption=se.getalloption();
	 //for(webelement element:alloption){
	 // string text=element.gettext();
	 //sysout(text);}
	 //i:List<webelement>----o:String
	 public List<WebElement> getallOptiontext(WebElement element) {
		 Select se=new Select(element);
		List<WebElement> options = se.getOptions();
		for (int i = 0; i <options.size(); i++) {
			se.selectByIndex(i);
			}
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement X : allSelectedOptions) {
			String text = X.getText();
			System.out.println(text);
		}
		return allSelectedOptions;
	 }
	 
	 //27.get all option from deopdown as attribute value:
	 //i:webelement ,string ---o:List<webelement>
     public List<WebElement> getalloptionattributevalue(WebElement element,String value){
     Select se=new Select(element);
		List<WebElement> options = se.getOptions();
		for (int i = 0; i <options.size(); i++) {
			se.selectByIndex(i);
			}
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement X : allSelectedOptions) {
			String attribute = X.getAttribute(value);
			System.out.println(attribute);
		}
		return allSelectedOptions;  }

     
     //28.get all first selected option text in dd
     public List<WebElement> getfirstoptiontext(WebElement element,String value){
         Select se=new Select(element);
    		List<WebElement> options = se.getOptions();
    		for (int i = 0; i <options.size(); i++) {
    			se.selectByIndex(i);
    			}
    		WebElement firstSelectedOption = se.getFirstSelectedOption();
    		System.out.println(firstSelectedOption);
			return options;
     }
     //29.verify dd is multiple select option:
     public boolean ismultipleoption(WebElement element) {
		Select se=new Select(element);
		boolean multiple = se.isMultiple();
		System.out.println(multiple);
    	  return false;
    	}
     //30.implisity wait;
     public void implicitWait() {
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

 	}
             //(OR)

 	public void implicitWait(int secs) {
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));

 	}
 	
 	//31.Explicity wait for visibility of
 	public void visiblityOf(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}
 	
 	//
 	
 	
 	
 	
 	
     //33.verify is display;
     public boolean isDisplayed(WebElement element) {
 		visiblityOf(element);
 		boolean displayed = element.isDisplayed();
 		return displayed;
 	}
     //34.verify is enable:
     public boolean isEnable(WebElement element) {
    	 boolean enabled = element.isEnabled();
		return enabled;
     }
     //35.verify is selected:
     public boolean isselected(WebElement element) {
    	 boolean selected = element.isSelected();
		return selected;
     }
     //36.dese
     
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     }




