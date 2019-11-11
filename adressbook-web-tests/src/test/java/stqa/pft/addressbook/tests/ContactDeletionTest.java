package stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletionFromMainPage() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactFromMainPage();
        app.getContactHelper().acceptAlert();
        app.getNavigationHelper().gotoHomePage();
    }

    @Test
    public void testContactDeletionFromEditMenu() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContactFromEdit();
        app.getNavigationHelper().gotoHomePage();
    }
}
