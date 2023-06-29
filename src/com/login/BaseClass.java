package com.login;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
public static WebDriver driver;
	
	public void browserLaunch(String url) {

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions ops =new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
//		driver=new ChromeDriver(ops);
//		driver.get(url);
		
		
	}//1
	public  void maxiwindow() {
    driver.manage().window().maximize();
	}
	

	
	//2
	public WebElement findelementId(String Id) {
    WebElement elementId = driver.findElement(By.id(Id));
    return elementId;
	
	}
	//3
	public WebElement findelementName(String name) {
  WebElement elementname = driver.findElement(By.name(name));
   return elementname;
   
	}
	//4
	
	public void btnClick(WebElement ele) {
		ele.click();

	}
	
		
	//5
	public void sendValues(WebElement element,String data) {
    element.sendKeys(data);
	}
	//6
	public WebElement findelementxpath(String xpath) {
   WebElement elementxpath = driver.findElement(By.xpath(xpath));
		return elementxpath;
		
	}
	//7
	public void moveback(WebElement element,String url) {
    driver.navigate().back();
    
	}
	//8
	public void moveforword() {
    driver.navigate().forward();
	}
	//9
	public void refresh() {
  driver.navigate().refresh();
	}
	//10
	public String currentUrl(WebElement element) {
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
     return currentUrl;
	}
	//11
	public String getTitle(WebElement element,String name) {
    String title = driver.getTitle();
    System.out.println(title);
    return title;
	}
	//12
	public void moveToElement(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		
	}
	//13
	public WebElement findelementClass(String classname) {
    WebElement elementclass = driver.findElement(By.className(classname));
    return elementclass;
    
	}
	//14
	public void dragAndDrop(WebElement source,WebElement element) {
	Actions actions=new Actions(driver);
	actions.dragAndDrop(source, element).perform();
	}
	//15
    public void doubleClick(WebElement element) {
    Actions actions=new Actions(driver);
    actions.doubleClick(element).perform();
    
	}
	//16
    public void contextClick(WebElement element) {
  Actions actions=new Actions(driver);
  actions.contextClick(element).perform();
	}
	//17
    public void clickOkAlert() {
    driver.switchTo().alert().accept();
}
  //18
    public void ClickCancelAlert() {
     driver.switchTo().alert().dismiss();
	}
   
    //19
   public Alert withReturnNo(WebElement element) {
   Alert alert = driver.switchTo().alert();
   alert.dismiss();
   return alert;
}
   //20
  public static void jssendkeys(String string,String text) {
   JavascriptExecutor q= (JavascriptExecutor) driver;
   q.executeScript("arguments[0].setAttribute('value'\"' \" + text +\"'", "String");
}
//21
  public void elementClickJs(WebElement element) {
    JavascriptExecutor q=(JavascriptExecutor) driver;
    q.executeScript("arguments[0].click(_)", element);
    
}
  //22 
   public void elementScrollDownJs(WebElement element) {
   JavascriptExecutor q=(JavascriptExecutor) driver;
   q.executeScript("arguments[0].scroleintoviwe(true)", element);
}
   //23
   public void elementScrollup(WebElement element) {
    JavascriptExecutor q=(JavascriptExecutor) driver;
    q.executeScript("arguments[0].scroleintoviwe(false)", element);
    
}
   //24
   public void elementClick(WebElement element) {
   element.click();
}
   //25
   public void clearTextBoxElement(WebElement element) {
	   element.clear();
}
   //26
   public void closeWindow( ) {
    driver.close();
}
   //27
   public void quitWindow() {
   driver.quit();
}
   
   //28
   public void selectByText(WebElement element,String text) {
	   Select select=new Select(element);
	   select.selectByVisibleText(text);
}
   //29
   public void selectOptByAttributeName(WebElement element,String attributevalue) {
	   Select select=new Select(element);
			   select.selectByValue(attributevalue);
}
   //30
   public void selectOptByIndex(WebElement element,int index) {
     Select select=new Select(element);
     select.selectByIndex(index);
}
   //31
   public void deSelectAll(WebElement element) {
    Select select=new Select(element);
    select.deselectAll();
}
   //32
   public void deSelectByText(WebElement element,String text) {
   Select select=new Select(element);
   select.deselectByVisibleText(text);
}
   //33
   public void deSelectByAttribute(WebElement element,String attributeValue) {
Select select=new Select(element);
select.deselectByValue(attributeValue);
}
   //34
   public void deselectByIndex(WebElement element,int index) {
	   Select select=new Select(element);
	   select.deselectByIndex(index);
}
   //35
   
   public WebElement getFirstSelecOpt(WebElement element) {
    Select select=new Select(element);
    WebElement firstSelectedOption = select.getFirstSelectedOption();
    return firstSelectedOption;
}
   //36
   public List<WebElement> getAllSelectOpt(WebElement element) {
      Select select=new Select(element);
      List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
      return allSelectedOptions;
}
   //36
   public boolean verifimultiText(WebElement element) {
    Select select=new Select(element);
    boolean multiple = select.isMultiple();
    return multiple;
}
   
   //37
   public void launchChromebrowser(String driverpath) {
    System.setProperty("webdriver.chrome,driver", driverpath);
    driver=new ChromeDriver();
}
   //38
   public String parentWindowId() {
    String windowHandle = driver.getWindowHandle();
    return windowHandle;
}
   //39
   public Set<String> allWindowid() {
    Set<String> windowHandles = driver.getWindowHandles();
    return windowHandles;
    
}
   //40
   public void switchToChildWindow(String windowId) {
    driver.switchTo().window(windowId);
    
}
   //41
   public void switcToFrameIndex(int index) {
   driver.switchTo().frame(index);
}
   //42
   public void switcToFrameName(String name) {
   driver.switchTo().frame(name);
}
   //43
   public void switcTpoParentFrame() {
driver.switchTo().parentFrame();
}
   //44
   public void implicityWait(Duration duration) {
 driver.manage().timeouts().implicitlyWait(duration );
 
}
   
   //45
   public WebElement explicityWaitVisiblityOfElementLo(Duration timeout, String attributeValue) {
 WebDriverWait wait=new WebDriverWait(driver, timeout);
		 WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(attributeValue)));
		 return until;
}
   //46
   public void pageLoadTimeout(Duration during) {
  driver.manage().timeouts().pageLoadTimeout(during);
}
   //47
   public boolean verifiIsEnabled(WebElement element) {
     boolean enabled = element.isEnabled();
     return enabled;
   }
   //48
   public boolean verifiIsDisplayed(WebElement element) {
   boolean displayed = element.isDisplayed();
   return displayed;
}
   //49
   public boolean verifiIsSelected(WebElement element) {
  boolean selected = element.isSelected();
  return selected;
}
   
   //50
   public void staticWait(long unit) throws InterruptedException {
    Thread.sleep(unit);
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
