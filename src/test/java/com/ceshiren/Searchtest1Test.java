package com.ceshiren;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class Searchtest1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void searchtest1() {

    driver.get("https://ceshiren.com/");
    driver.manage().window().setSize(new Dimension(1296, 705));

    //driver.findElement(By.id("search-term")).click(".d-icon-search");
    WebElement searchElement=driver.findElement(By.cssSelector(".d-icon-search"));
    searchElement.click();

    //driver.findElement(By.id("search-term")).sendKeys("selenium");
    WebElement searchElement1=driver.findElement(By.cssSelector("selenium"));
    searchElement1.click();

    //driver.findElement(By.id("search-term")).sendKeys(Keys.ENTER);
  }
}
