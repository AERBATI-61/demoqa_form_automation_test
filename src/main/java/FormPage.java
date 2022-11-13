import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage extends BasePage{


    private GenderSection genderSection;


    private final By namelocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");




    public FormPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("/automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setName(String  name) {
        type(namelocator, name);
    }


    public void setLastName(String lastName) {
        type(lastNameLocator, lastName);
    }


    public void setEmail(String email) {
        type(emailLocator, email);
    }


    public String getName(){
        return find(namelocator).getAttribute("value");
    }

    public String getLastName(){
        return find(lastNameLocator).getAttribute("value");
    }

    public String getEmail(){
        return find(emailLocator).getAttribute("value");
    }

}
