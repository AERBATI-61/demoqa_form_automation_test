import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class BaseTest {

    protected WebDriver driver;


    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    }


    @BeforeEach
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


//    @AfterEach
//    public void afterMethod(){
//        driver.quit();
//    }

    /*
    @AfterAll
    public void tearDown(){
        driver.quit();
    }
    */
}
