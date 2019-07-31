package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    @Test

    public void NewRegister(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement register = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a"));
        register.click();


        driver.findElement(By.id("firstname")).sendKeys("dana");
        driver.findElement(By.id("lastname")).sendKeys("d");
        driver.findElement(By.name("email")).sendKeys("danielavrinceanu69@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirmation")).sendKeys("123456");
        driver.findElement(By.name("is_subscribed")).click();



        driver.quit();


    }
}
