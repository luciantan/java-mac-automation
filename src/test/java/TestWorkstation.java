import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestWorkstation {
    @Test
    public void testWorkstationSearch() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform","Mac");

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4622/wd/hub"),capabilities);
        driver.get("/Applications/workstation-mac-11.1.1.10701.app");

//        String documentAXpath = "/AXApplication[@AXTitle='MicroStrategy Workstation']";
//        driver.findElement(By.xpath(documentAXpath));

        Thread.sleep(2000);

        String searchBoxAXpath = "/AXApplication[@AXTitle='MicroStrategy Workstation']/AXWindow[@AXTitle='MicroStrategy Workstation - 环境' and @AXSubrole='AXStandardWindow']/AXToolbar[0]/AXGroup[4]/AXTextField[@AXSubrole='AXSearchField']";
        driver.findElement(By.xpath(searchBoxAXpath)).sendKeys("Airline");

        Thread.sleep(2000);



    }
}
