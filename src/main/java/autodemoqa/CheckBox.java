package autodemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class CheckBox {
    private String url = "https://demoqa.com/checkbox";
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
    public void testCheckBoxElement(){
        webDriver.get(url);

        // element
        String homeXpath = "//*[text()='Home']//ancestor::span[@class='rct-text']//label";
        String desktopXpath ="//*[text()='Desktop']//ancestor::span[@class='rct-text']//label";
        String notesXpath = "//*[text()='Notes']//ancestor::span[@class='rct-text']//label";
        String commandsXpath ="//*[text()='Commands']//ancestor::span[@class='rct-text']//label";
        String documentsXpath = "//*[text()='Documents']//ancestor::span[@class='rct-text']//label";
        String workspaceXpath ="//*[text()='WorkSpace']//ancestor::span[@class='rct-text']//label";
        String reactXpath = "//*[text()='React']//ancestor::span[@class='rct-text']//label";
        String angularXpath ="//*[text()='Angular']//ancestor::span[@class='rct-text']//label";
        String veuXpath = "//*[text()='Veu']//ancestor::span[@class='rct-text']//label";
        String officeXpath ="//*[text()='Office']//ancestor::span[@class='rct-text']//label";
        String publicXpath = "//*[text()='Public']//ancestor::span[@class='rct-text']//label";
        String privateXpath ="//*[text()='Private']//ancestor::span[@class='rct-text']//label";
        String classifiedXpath = "//*[text()='Classified']//ancestor::span[@class='rct-text']//label";
        String generalXpath ="//*[text()='General']//ancestor::span[@class='rct-text']//label";
        String downloadsXpath = "//*[text()='Downloads']//ancestor::span[@class='rct-text']//label";
        String wordFileXpath ="//*[text()='Word File.doc']//ancestor::span[@class='rct-text']//label";
        String excelFileXpath = "//*[text()='Excel File.doc']//ancestor::span[@class='rct-text']//label";
        String btnExpandAll = "//button[@title='Expand all']";
        String btnCollapseAll ="//button[@title='Collapse all']";

        String iconHomeXpath = "//*[text()='Home']//ancestor::span[@class='rct-text']/button/*[name()='svg']";
        String iconDesktopXpath = "//*[text()='Desktop']//ancestor::span[@class='rct-text']/button/*[name()='svg']";
        String iconDocumentsXpath = "//*[text()='Documents']//ancestor::span[@class='rct-text']/button/*[name()='svg']";
        String iconWorkSpaceXpath = "//*[text()='WorkSpace']//ancestor::span[@class='rct-text']/button/*[name()='svg']";
        String iconOfficeXpath = "//*[text()='Office']//ancestor::span[@class='rct-text']/button/*[name()='svg']";
        String iconDownloadsXpath = "//*[text()='Downloads']//ancestor::span[@class='rct-text']/button/*[name()='svg']";

        // xpath element
        WebElement home = webDriver.findElement(By.xpath(homeXpath));
        WebElement desktop = webDriver.findElement(By.xpath(desktopXpath));
        WebElement notes = webDriver.findElement(By.xpath(notesXpath));
        WebElement commands = webDriver.findElement(By.xpath(commandsXpath));
        WebElement documents = webDriver.findElement(By.xpath(documentsXpath));
        WebElement workspace = webDriver.findElement(By.xpath(workspaceXpath));
        WebElement react = webDriver.findElement(By.xpath(reactXpath));
        WebElement angular = webDriver.findElement(By.xpath(angularXpath));
        WebElement veu = webDriver.findElement(By.xpath(veuXpath));
        WebElement office = webDriver.findElement(By.xpath(officeXpath));
        WebElement publicEle = webDriver.findElement(By.xpath(publicXpath));
        WebElement privateEle = webDriver.findElement(By.xpath(privateXpath));
        WebElement classified = webDriver.findElement(By.xpath(classifiedXpath));
        WebElement general = webDriver.findElement(By.xpath(generalXpath));
        WebElement download = webDriver.findElement(By.xpath(downloadsXpath));
        WebElement wordFile = webDriver.findElement(By.xpath(wordFileXpath));
        WebElement excelFile = webDriver.findElement(By.xpath(excelFileXpath));
        WebElement expandAll = webDriver.findElement(By.xpath(btnExpandAll));
        WebElement collapseAll = webDriver.findElement(By.xpath(btnCollapseAll));
        WebElement iconHome = webDriver.findElement(By.xpath(iconHomeXpath));
        WebElement iconDesktop = webDriver.findElement(By.xpath(iconDesktopXpath));
        WebElement iconDocuments = webDriver.findElement(By.xpath(iconDocumentsXpath));
        WebElement iconWorkSpace = webDriver.findElement(By.xpath(iconWorkSpaceXpath));
        WebElement iconOffice = webDriver.findElement(By.xpath(iconOfficeXpath));
        WebElement iconDownloads = webDriver.findElement(By.xpath(iconDownloadsXpath));


        // action click icon expandAll
        expandAll.click();
        // check display all element
        home.isDisplayed();
        desktop.isDisplayed();
        notes.isDisplayed();
        commands.isDisplayed();
        documents.isDisplayed();
        workspace.isDisplayed();
        react.isDisplayed();
        angular.isDisplayed();
        veu.isDisplayed();
        office.isDisplayed();
        publicEle.isDisplayed();
        privateEle.isDisplayed();
        classified.isDisplayed();
        general.isDisplayed();
        download.isDisplayed();
        wordFile.isDisplayed();
        excelFile.isDisplayed();

        // action click icon collageAll
        collapseAll.click();
        // check not display all element

    }
}
