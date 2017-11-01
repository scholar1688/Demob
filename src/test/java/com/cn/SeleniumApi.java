package com.cn;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumApi {
	@Ignore
	@Test
	public void testIE()
	{
		System.setProperty("webdriver.ie.driver", "D:\\Eclipse\\workspace\\junit4\\resource\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("www.baidu.com");
	}
	
	@Test
	public void testFox()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.baidu.com/");    //ֱ������www.baidu.com,���Բ�ͨ��
		//driver.get("http://localhost:8080/jenkins/"); 
	}
}
