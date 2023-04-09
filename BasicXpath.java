package MainPackage.SeleniumChromeDriver.locators.basiclocatortype.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

    public static void main(String[] args) { //USING BASIC XPATH
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://in.search.yahoo.com/?fr2=inr");
        WebElement we = wd.findElement(By.xpath("//input[@name='p' ]"));
        we.sendKeys("Search Java");
        we.click();


        wd.close();
    }
    }
