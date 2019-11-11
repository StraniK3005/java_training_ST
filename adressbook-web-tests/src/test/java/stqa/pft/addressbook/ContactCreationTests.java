package stqa.pft.addressbook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        gotoContactPage();
        fillContactForm(new ContactData("Test1", "Test2", "st. Pushkina 104-20", "test@test.com"));
        submitContactCreation();
        gotoHomePage();
    }


}
