package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class SelectMenu {
    private String url = "https://demoqa.com/select-menu";
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
    public void elementAncestor(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//*[text()='Select Option']//ancestor::div[contains(@class, 'css')]//input"));
        webDriver.findElement(By.xpath("//*[text()='Select Title']//ancestor::div[contains(@class, 'css')]//input"));
        webDriver.findElement(By.xpath("//*[text()='Select...']//ancestor::div[contains(@class, 'css')]//input"));
        webDriver.findElement(By.xpath("//*[text()='Select Option']//ancestor::div[contains(@class, 'css')]//*[name()='svg']"));
        webDriver.findElement(By.xpath("//*[text()='Select Title']//ancestor::div[contains(@class, 'css')]//*[name()='svg']"));
        webDriver.findElement(By.xpath("//*[text()='Select...']//ancestor::div[contains(@class, 'css')]//*[name()='svg']"));
    }

    @Test
    public void elementsAncestor(){
        webDriver.get(url);
        webDriver.findElements(By.xpath("//*[contains(@class, 'md-6')]//input"));
        webDriver.findElements(By.xpath("//*[contains(@class, 'md-6')]//*[name()='svg']"));
        webDriver.findElements(By.xpath("//*[contains(@class, 'md-6')]//select"));
    }


}
