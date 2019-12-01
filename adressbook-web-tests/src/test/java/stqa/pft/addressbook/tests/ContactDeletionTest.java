package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletionFromMainPage() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoContactPage();
            app.getContactHelper().createContact(new ContactData("Test1", "Test2", "st. Pushkina 104-20", "test@test.com"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactFromMainPage();
        app.getContactHelper().acceptAlert();
        app.getNavigationHelper().gotoHomePage();
    }

    @Test
    public void testContactDeletionFromEditMenu() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoContactPage();
            app.getContactHelper().createContact(new ContactData("Test1", "Test2", "st. Pushkina 104-20", "test@test.com"));
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContactFromEdit();
        app.getNavigationHelper().gotoHomePage();
    }
}
