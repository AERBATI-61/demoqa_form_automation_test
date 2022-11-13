import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInformationOfPersonel extends BaseTest {

    @Test
    public void setName() {
        FormPage formPage = new FormPage(driver);
        formPage.setName("Arafat");
        Assertions.assertEquals("Arafat", formPage.getName(), "Name value is not correct.");
    }


    @Test
    public void setLastName() {
        FormPage formPage = new FormPage(driver);
        formPage.setLastName("Emin");
        Assertions.assertEquals("Emin", formPage.getLastName(), "LastName value is not correct.");
    }



    @Test
    public void setEmail() {
        FormPage formPage = new FormPage(driver);
        formPage.setEmail("ArafatEmin34@gmail.com");
        Assertions.assertEquals("ArafatEmin34@gmail.com", formPage.getEmail(), "Email value is not correct.");
    }
}
