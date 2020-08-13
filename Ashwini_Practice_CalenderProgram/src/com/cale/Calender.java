package com.cale;gvggvvg

import java.util.List;kmn
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium cjc jar files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='form-control required']")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.id("travel_to")).sendKeys("Akola");
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		Thread.sleep(2000);
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("July 2020"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> days=driver.findElements(By.cssSelector("[class='day']"));
		int count=days.size();
		System.out.println("no od days:"+count);
		
		for(int i=0; i<count; i++)
		{
			String days1=driver.findElements(By.cssSelector("[class='day']")).get(i).getText();
			if(days1.equalsIgnoreCase("14"))
			{
				driver.findElements(By.cssSelector("[class='day']")).get(i).click();
			}
		}
		WebElement t=driver.findElement(By.cssSelector("dibv[class='col-xs-6']"));
		WebElement week=t.findElement(By.cssSelector("[id='datebetween']"));
		Select sel=new Select(week);
		sel.selectByIndex(3);
		
		//Thread.sleep(2000);
		WebElement service=driver.findElement(By.cssSelector("[name='travel_airline']"));
		Select sel1=new Select(service);
		sel1.selectByIndex(3);
		sop("12"),,
	}

}
