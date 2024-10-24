package prac8;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class Drag_drop_test {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\SahilGupta\\tycs\\STQA\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(options);
        String appurl = "file:///D:/SahilGupta/tycs/STQA/combobox.html";
        driver.get(appurl);
        Select oSelect = new Select(driver.findElement(By.id("continents")));
        List<WebElement> oSize = oSelect.getOptions();
        int iListSize = oSize.size();
        System.out.println("Items in Dropdown list are:");
        
        for (int i = 0; i < iListSize; i++) {
            String sValue = oSelect.getOptions().get(i).getText();
            System.out.println(sValue);
        }
        
        System.out.println("Total items in Dropdown list: " + iListSize);
        oSelect.selectByVisibleText("Europe");
    }
}
