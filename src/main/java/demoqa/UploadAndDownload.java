package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class UploadAndDownload {
    private String url = "https://demoqa.com/upload-download";
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
        webDriver.findElement(By.xpath("//*[text()='Download']"));
        webDriver.findElement(By.xpath("//*[text()='Select a file']"));
    }

    @Test
    public void elementContains(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[contains(text(), 'Download')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Select a file')]"));
    }

    @Test
    public void elementNormalizeSpace(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[normalize-space(text())='Download']"));
        webDriver.findElement(By.xpath("//*[normalize-space(text())='Select a file']"));
    }

    @Test
    public void elementAncestor(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[text()='Download']//ancestor::div[contains(@class, 'md-6')]//a"));
        webDriver.findElement(By.xpath("//*[text()='Select a file']//ancestor::div[contains(@class, 'md-6')]//input"));
    }

    @Test
    public void elementDescendant(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//descendant::a"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//descendant::input"));
    }

    @Test
    public void elementFollowing(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::a"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::input"));
    }

    @Test
    public void elementFollowingText(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::a[text()='Download']"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::*[text()='Select a file']"));
    }

    @Test
    public void elementFollowingContains(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::a[contains(text(), 'Download')]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::*[contains(text(), 'Select a file')]"));
    }

    @Test
    public void elementFollowingNormalizeSpace(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::a[normalize-space(text())='Download']"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following::*[normalize-space(text())='Select a file']"));
    }

    @Test
    public void elementFollowingSibling(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following-sibling::div//a[text()='Download']"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//following-sibling::input"));
    }

    @Test
    public void elementPreceding(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//preceding::a"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'md-6')]//preceding::input"));
    }

    @Test
    public void elementParents(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[text()='Download']//parent::a"));
        webDriver.findElement(By.xpath("//*[text()='Select a file']//parent::div"));
    }
}
