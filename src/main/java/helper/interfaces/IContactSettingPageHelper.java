package helper.interfaces;

import page.main.setting.ContactSettingPage;

public interface IContactSettingPageHelper {

    ContactSettingPage createValidNewContactGroup();
    ContactSettingPage tryToCreateNewContactGroup(String groupName);
}
