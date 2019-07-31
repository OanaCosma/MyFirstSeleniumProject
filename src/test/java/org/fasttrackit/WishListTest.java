package org.fasttrackit;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
     @Test

    public void WishListTest(){
         System.setProperty("webdriver.chrome.driver","driver/chromedriver");
         WebDriver driver = new ChromeDriver();
         driver.get("https://fasttrackit.org/selenium-test/");
         WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
         accountButton.click();

         WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
         loginLink.click();

         driver.findElement(By.cssSelector("#email")).sendKeys("oanav94@yahoo.com");
         driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
         driver.findElement(By.cssSelector("#send2")).click();
         WebElement saleButton = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a"));
         saleButton.click();

         WebElement viewDetails = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a"));
         viewDetails.click();
         WebElement addToWishListButton = driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a"));
         addToWishListButton.click();

         driver.quit();
     }
}
