package helper;

import constants.ValidValues;
import helper.interfaces.IContactSettingPageHelper;
import page.main.setting.ContactSettingPage;

public class ContactSettingPageHelper implements IContactSettingPageHelper{

    ContactSettingPage contactSettingPage;

    public ContactSettingPageHelper(ContactSettingPage contactSettingPage) {
        this.contactSettingPage = contactSettingPage;
    }

    public ContactSettingPage createValidNewContactGroup() {
        contactSettingPage.clickCreateNewContactGroupButton()
                .insertNewContactGroupName(ValidValues.ContactSettingPageValue.NEW_CONTACT_GROUP_NAME)
                .clickCreateNewContactGroupButtonAfterInsertName();

        contactSettingPage.waitFiveSecond();

        return contactSettingPage;
    }

    public ContactSettingPage tryToCreateNewContactGroup(String groupName) {
        contactSettingPage.clickCreateNewContactGroupButton()
                .insertNewContactGroupName(groupName)
                .clickCreateNewContactGroupButtonAfterInsertName();

        return contactSettingPage;
    }

}

