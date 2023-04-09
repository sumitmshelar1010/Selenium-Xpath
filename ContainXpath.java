package MainPackage.SeleniumChromeDriver.locators.basiclocatortype.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainXpath {

    public static void main(String[] args) { //USING CONTAINS XPATH
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://in.search.yahoo.com/?fr2=inr");
        WebElement we = wd.findElement(By.xpath("//input[contains(@name,'p')]"));
        we.sendKeys("Java language programing");
        we.click();


        wd.close();
}}
