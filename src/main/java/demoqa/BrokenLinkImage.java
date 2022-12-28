package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class BrokenLinkImage {
    private String url = "https://demoqa.com/broken";
    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass(){
        String chromePath = "src/main/resources/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass(){
        if(Objects.nonNull(webDriver)) webDriver.quit();
    }

    @Test
    public void elementText(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[text()='Valid image']"));
        webDriver.findElement(By.xpath("//*[text()='Broken image']"));
        webDriver.findElement(By.xpath("//*[text()='Valid Link']"));
        webDriver.findElement(By.xpath("//*[text()='Broken Link']"));
    }

    @Test
    public void elementContains(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[contains(text(), 'Valid image')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Broken image')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Valid Link')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Broken Link')]"));
    }

    @Test
    public void elementNormalizeSpace(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[normalize-space(text())='Valid image']"));
        webDriver.findElement(By.xpath("//*[normalize-space(text())='Broken image']"));
        webDriver.findElement(By.xpath("//*[normalize-space(text())='Valid Link']"));
        webDriver.findElement(By.xpath("//*[normalize-space(text())='Broken Link']"));
    }

    // thang mac sao khong lay duoc chinh xac
    @Test
    public void elementAncestor(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[text()='Valid image']//ancestor::div[contains(@class, 'md-6')]//img[1]"));
        webDriver.findElement(By.xpath("//*[text()='Valid image']//ancestor::div[contains(@class, 'md-6')]//img[2]"));
        webDriver.findElement(By.xpath("//*[text()='Valid Link']//ancestor::div[contains(@class, 'md-6')]//a[1]"));
        webDriver.findElement(By.xpath("//*[text()='Valid Link']//ancestor::div[contains(@class, 'md-6')]//a[2]"));
    }

    @Test
    public void elementDescendant(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//descendant::img[1]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//descendant::img[2]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//descendant::a[1]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//descendant::a[2]"));
    }

    @Test
    public void elementFollowing(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-3')]//following::img[1]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-3')]//following::img[2]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-3')]//following::a[1]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-3')]//following::a[2]"));
    }

}
