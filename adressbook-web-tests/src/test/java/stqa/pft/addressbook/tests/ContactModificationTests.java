package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
       app.getContactHelper().initContactModification();
       app.getContactHelper().fillContactForm(new ContactData("Fedor", "Ivanov", "Nesavisimosti 95-102", "test@test.com"));
       app.getContactHelper().submitContactModification();
       app.getContactHelper().returnToHomePage();
    }
}
