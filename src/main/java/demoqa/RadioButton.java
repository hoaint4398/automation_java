package demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.util.Objects;

public class RadioButton {
    private String url = "https://demoqa.com/radio-button";
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
    public void elementXpathID(){
        webDriver.get(url);
    }
}
