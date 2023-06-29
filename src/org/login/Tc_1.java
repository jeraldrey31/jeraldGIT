package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.login.BaseClass;

public class Tc_1 extends BaseClass {
   WebDriver driver;
   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jeral\\eclipse-workspace\\SeleniumProg\\Driver\\chromedriver.exe");
	ChromeOptions ops=new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("jeraldrey31");
		driver.findElement(By.id("password")).sendKeys("3M8170");
		driver.findElement(By.id("login")).click();
		WebElement loc = driver.findElement(By.id("location"));
		Select select=new Select(loc);
		select.selectByVisibleText("New York");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select select2=new Select(hotel);
		select2.selectByVisibleText("Hotel Creek");
		WebElement room = driver.findElement(By.id("room_type"));
		Select select3=new Select(room);
		select3.selectByVisibleText("Double");
		WebElement noof = driver.findElement(By.id("room_nos"));
		Select select4=new Select(noof);
		select4.selectByVisibleText("2 - Two");
		WebElement datein = driver.findElement(By.id("datepick_in"));
		JavascriptExecutor q=(JavascriptExecutor)driver;
		
		q.executeScript("24/06/2023", datein);
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		JavascriptExecutor w=(JavascriptExecutor) driver;
		w.executeScript("26/06/2023", dateout);
		WebElement roome= driver.findElement(By.id("adult_room"));
		Select select5=new Select(roome);
		select5.selectByVisibleText("3 - Three");
		WebElement child = driver.findElement(By.id("child_room"));
		Select select6=new Select(child);
		select6.selectByVisibleText("2 - Two");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("jerald");
		driver.findElement(By.id("last_name")).sendKeys("rey");
		driver.findElement(By.id("address")).sendKeys("chennai");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select select7=new Select(cardtype);
		select7.selectByVisibleText("VISA");
		WebElement cardmonth = driver.findElement(By.id("cc_exp_month"));
		Select select8=new Select(cardmonth);
		select8.selectByVisibleText("March");
		WebElement cardyear = driver.findElement(By.id("cc_exp_year"));
		Select select9=new Select(cardyear);
		select9.selectByVisibleText("2015");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		System.out.println("mission complete!!!!!!!!!");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
