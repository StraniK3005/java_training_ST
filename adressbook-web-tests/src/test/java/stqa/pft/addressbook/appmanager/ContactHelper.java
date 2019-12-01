package stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getEmail());
    }

    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit'][1]"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update'][2]"));
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void deleteContactFromEdit() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContactFromMainPage() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void createContact(ContactData contact) {
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
}
