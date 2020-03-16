package ru.Avito;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloAvito {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "//driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://avito.ru");
        driver.quit();
    }
}