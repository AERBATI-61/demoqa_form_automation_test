import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGenderSelection extends BaseTest{
    @Test
    public void male_radio_button(){
        FormPage formPage = new FormPage(driver);
        formPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(formPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                "Male Radio Button is Not checked!");
    }

    @Test
    public void female_radio_button(){
        FormPage formPage = new FormPage(driver);
        formPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(formPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "FEMALE Radio Button is Not checked!");
    }

    @Test
    public void other_radio_button(){
        FormPage formPage = new FormPage(driver);
        formPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(formPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "OTHER Radio Button is Not checked!");
    }

}
