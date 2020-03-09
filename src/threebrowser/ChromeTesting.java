package threebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTesting {//class
    public static void main(String[] args) {//main method
        String baseUrl = "https://www.harrow.gov.uk/";//url of website
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");//providing browser path
        WebDriver driver = new ChromeDriver();//object creation of driver reference type
        driver.manage().window().maximize();//window opening and maximize method
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//website stay open for 10 seconds
        driver.get(baseUrl);//get method calling browser
        String title = driver.getTitle();//get title method to locate title and walkthought
        System.out.println("Main page " + title);//printing statement
        // driver.quit();//closing browser method










    }
}
