package com.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class DataProbiderTest {
	WebDriver driver;

	@DataProvider(name = "dataInWebSite") 
	public String[][] getData() {
		return new String[][] { { "alammmohammed79@gmail.com" }, { "SAYEDawan2008@" } };
	}

	@Test (dataProvider = "dataInWebSite")
    public void myData(String value) {
    	System.out.println(value);
    	driver.findElement(By.xpath("")).sendKeys(value);
    }

}
