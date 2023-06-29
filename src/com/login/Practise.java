package com.login;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jeral\\eclipse-workspace\\SeleniumProg\\Driver\\chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(ops);
			driver.get("https://example.com");
		
	
//    WebDriver driver = new ChromeDriver();
//
//    // Navigate to the webpage with the dropdown
//    driver.get("https://example.com");

    // Identify the dropdown element using appropriate locator strategy
    WebElement dropdown = driver.findElement(By.id("dropdownId"));

    // Retrieve all the options within the dropdown
    List<WebElement> options = dropdown.findElements(By.tagName("option"));

    // Create a set to store the unique values from the dropdown
    Set<String> uniqueValues = new HashSet<>();

    // Iterate over each option in the dropdown
    boolean hasDuplicates = false;
    for (WebElement option : options) {
        // Get the text of each option
        String text = option.getText();

        // Check if the text already exists in the set of unique values
        if (uniqueValues.contains(text)) {
            hasDuplicates = true;
            break;
        }

        // Add the text to the set of unique values
        uniqueValues.add(text);
    }

    // Perform necessary actions based on the result
    if (hasDuplicates) {
        System.out.println("Dropdown contains duplicates");
    } else {
        System.out.println("Dropdown does not contain duplicates");
    }

    // Quit the driver
    driver.quit();
}
}
