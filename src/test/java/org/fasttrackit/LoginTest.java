
package org.fasttrackit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private static WebDriver driver;

    @BeforeClass
    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void validLoginTest() {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();

        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("oanav94@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement helloText = driver.findElement(By.cssSelector(".welcome-msg. hello"));

        Assert.assertEquals("Hello,ana ana!", helloText.getText());

        driver.quit();


    }

    @Test
    public void negativeLogin() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();

        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("oanav94@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("dcsca");
        driver.findElement(By.cssSelector("#send2")).click();


        driver.quit();


    }


    //Lab 17 tema

    @Test
    public void searchIcon() {


        driver.get("https://fasttrackit.org/selenium-test/");

        WebElement saleButton = driver.findElement(By.cssSelector("li.level0.nav-5.parent"));
        saleButton.click();


        WebElement firstProduct = driver.findElement(By.cssSelector("#product-collection-image-423"));
        firstProduct.click();

        WebElement searchEntireStore = driver.findElement(By.className("search-button"));
        searchEntireStore.click();

        driver.quit();




    }


    @Test
    public void addItemsToCart() {


        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement saleButton = driver.findElement(By.cssSelector("li.level0.nav-5.parent"));
        saleButton.click();


        WebElement firstProduct = driver.findElement(By.cssSelector("#product-collection-image-423"));
        firstProduct.click();

        driver.findElement(By.cssSelector("#swatch18 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#option80")).click();

        WebElement addToCartButton = driver.findElement(By.cssSelector("div.add-to-cart-buttons > button"));
        addToCartButton.click();


        driver.get("https://fasttrackit.org/selenium-test/");
        saleButton = driver.findElement(By.cssSelector("li.level0.nav-5.parent"));
        saleButton.click();
        WebElement secondProduct = driver.findElement(By.cssSelector("#product-collection-image-403"));
        secondProduct.click();

        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();

        WebElement addToCartButton2 = driver.findElement(By.cssSelector("div.add-to-cart-buttons > button"));
        addToCartButton2.click();

        WebElement trashButton = driver.findElement(By.cssSelector("tr.first.odd > td.a-center.product-cart-remove.last > a"));
        trashButton.click();

        driver.quit();


    }

    @Test
    public void proceedToCheckout() {


        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement saleButton = driver.findElement(By.cssSelector("li.level0.nav-5.parent"));
        saleButton.click();

        WebElement secondProduct = driver.findElement(By.cssSelector("#product-collection-image-403"));
        secondProduct.click();

        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#option81")).click();

        WebElement addToCartButton = driver.findElement(By.cssSelector("div.add-to-cart-buttons > button"));
        addToCartButton.click();

        WebElement proceedToCheckoutButton = driver.findElement(By.cssSelector("li.method-checkout-cart-methods-onepage-bottom > button"));
        proceedToCheckoutButton.click();


        driver.quit();
    }




        @Test
       public void sortBy(){

            driver.get("https://fasttrackit.org/selenium-test/");

            WebElement saleButton = driver.findElement(By.cssSelector("li.level0.nav-5.parent"));
            saleButton.click();
            WebElement sortByButton = driver.findElement(By.cssSelector("div.sort-by > select"));





    }

    }