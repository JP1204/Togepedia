import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class AbilitiesUITest {
    //Tests if Search works
    @Test
    public void t0() throws InterruptedException{
        boolean found = false;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/abilities");
        Thread.sleep(10000);
        WebElement we = wd.findElement(By.cssSelector("input.mr-sm-2:nth-child(1)"));
        we.sendKeys("Drizzle");
        we.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/button[1]")).click();
        WebElement result = wd.findElement(By.cssSelector(".card-header"));
        String text = result.getText();
        if(text.contains("Drizzle")){
            found = true;
        }
        assertTrue(found);
        wd.quit();
    }


    //Test the Reset button for instances
    @Test
    public void t1() throws InterruptedException {
        boolean found = false;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/abilities");
        Thread.sleep(10000);
        WebElement we = wd.findElement(By.cssSelector("input.mr-sm-2:nth-child(1)"));
        we.sendKeys("Drizzle");
        we.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/button[1]")).click();
        Thread.sleep(3000);
        we.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/button[1]")).click();
        Thread.sleep(3000);
        WebElement result = wd.findElement(By.cssSelector(".card-header"));
        String text = result.getText();
        if(text.contains("Stench")){
            found = true;
        }
        assertTrue(found);
        wd.quit();
    }

    //Test the Type 1 Selection for instances
    @Test
    public void t2() throws InterruptedException {
        boolean found = false;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/abilities");
        Thread.sleep(10000);
        Select select = new Select (wd.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/select[1]")));
        select.selectByVisibleText("V");

        WebElement searchButton = wd.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/button[2]"));
        searchButton.click();
        Thread.sleep(3000);
        WebElement result = wd.findElement(By.cssSelector(".card-header"));
        String text = result.getText();
        if(text.contains("Pickpocket")){
            found = true;
        }
        assertTrue(found);
        wd.quit();
    }

    //Test the sorting Selection for instances
    @Test
    public void t3() throws InterruptedException {
        boolean found = false;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/abilities");
        Thread.sleep(15000);
        Select select = new Select (wd.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/select")));
        select.selectByVisibleText("Ascending (a-z)");

        WebElement searchButton = wd.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/button[2]"));
        searchButton.click();
        Thread.sleep(3000);
        WebElement result = wd.findElement(By.cssSelector(".card-header"));
        String text = result.getText();
        if(text.contains("Adaptability")){
            found = true;
        }
        assertTrue(found);
        wd.quit();
    }

    //Test the includes for instances
    @Test
    public void t4() throws InterruptedException{
        boolean found = false;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/abilities");
        Thread.sleep(10000);
        WebElement we = wd.findElement(By.cssSelector("input.mr-sm-2:nth-child(2)"));
        we.sendKeys("ew");
        we.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/button[2]")).click();
        WebElement result = wd.findElement(By.cssSelector(".card-header"));
        String text = result.getText();
        if(text.contains("Forewarn")){
            found = true;
        }
        assertTrue(found);
        wd.quit();
    }
}
