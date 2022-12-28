package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class TextBox {
    private String url = "https://demoqa.com/text-box";
    private WebDriver webDriver;

    @BeforeClass
    private void beforeClass(){
        String chromePath = "src/main/resources/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    private void afterClass(){
        if(Objects.nonNull(webDriver)) webDriver.quit();
    }

    @Test
    public void elementTextContains(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[contains(text(), 'Full Name')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Email')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Current Address')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Permanent Address')]"));
        webDriver.findElement(By.xpath("//*[contains(text(), 'Submit')]"));
    }

    @Test
    public void elementTextText(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[text()='Full Name']"));
        webDriver.findElement(By.xpath("//*[text()='Email']"));
        webDriver.findElement(By.xpath("//*[text()='Current Address']"));
        webDriver.findElement(By.xpath("//*[text()='Permanent Address']"));
        webDriver.findElement(By.xpath("//*[text()='Submit']"));
    }

    @Test
    public void elementStartsWith(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[starts-with(text(), 'Full')]"));
        webDriver.findElement(By.xpath("//*[starts-with(text(), 'Email')]"));
        webDriver.findElement(By.xpath("//*[starts-with(text(), 'Current')]"));
        webDriver.findElement(By.xpath("//*[starts-with(text(), 'Permanent')]"));
        webDriver.findElement(By.xpath("//*[starts-with(text(), 'Submit')]"));
    }

    @Test
    public void elementAncestor(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[text()='Full Name']//ancestor::div[contains(@class, 'mt-2')]//input"));
        webDriver.findElement(By.xpath("//*[text()='Email']//ancestor::div[contains(@class, 'mt-2')]//input"));
        webDriver.findElement(By.xpath("//*[text()='Current Address']//ancestor::div[contains(@class, 'mt-2')]//textarea"));
        webDriver.findElement(By.xpath("//*[text()='Permanent Address']//ancestor::div[contains(@class, 'mt-2')]//textarea"));
        webDriver.findElement(By.xpath("//*[text()='Submit']//ancestor::div[contains(@class, 'mt-2')]//button"));
    }
    @Test
    public void elementDescendant(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//div[contains(@class, 'mt-2')]//descendant::input[contains(@placeholder, 'Full Name')]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'mt-2')]//descendant::input[contains(@placeholder, 'name@')]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'mt-2')]//descendant::textarea[contains(@placeholder, 'Current')]"));
        webDriver.findElement(By.xpath("//div[contains(@class, 'mt-2')]//descendant::textarea[contains(@id, 'permanent')]"));
        webDriver.findElement(By.xpath("//*[text()='Submit']"));
    }

    public void elementFollowing(){

    }
}
