import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() throws Exception {
        Library classUnderTest = new Library();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        System.out.println("Test Gradle");
        Assert.assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
        
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("facebook");
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.id("gbqfbb")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
