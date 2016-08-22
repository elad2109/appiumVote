import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

/**
 * Created by eladb on 8/22/16.
 */
public class Runner {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");


        while (true) {

            WebDriver driver = new ChromeDriver();
            Random rn = new Random();
            int nextWait = rn.nextInt(20 - 5 + 1) + 5;

            driver.get("http://south-america.mako.co.il/share/1014");
            WebElement voter = driver.findElement(By.cssSelector("#lightbox > div > div.lb-details > div.lb-social > div.like.lb-like"));
            voter.click();

            driver.close();
            try {
                Thread.currentThread().sleep(nextWait * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}