package stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletionFromMainPage() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoCreateContactPage();
            app.getContactHelper().createContact(new ContactData("Test1", "Test2", "st. Pushkina 104-20", "test@test.com"));
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deleteContactFromMainPage();
        app.getContactHelper().acceptAlert();
        app.getNavigationHelper().gotoHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }

    @Test
    public void testContactDeletionFromEditMenu() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoCreateContactPage();
            app.getContactHelper().createContact(new ContactData("Test1", "Test2", "st. Pushkina 104-20", "test@test.com"));
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification(0);
        app.getContactHelper().deleteContactFromEdit();
        app.getNavigationHelper().gotoHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }
}
