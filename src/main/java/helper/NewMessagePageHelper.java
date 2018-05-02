package helper;

import helper.interfaces.INewMessagePageHelper;
import page.main.NewMessagePage;

import static constants.ValidValues.NewMessagePageValue.*;

public class NewMessagePageHelper implements INewMessagePageHelper {

    NewMessagePage newMessagePage;

    public NewMessagePageHelper(NewMessagePage newMessagePage) {
        this.newMessagePage = newMessagePage;
    }

    public NewMessagePage sendValidMessage() {
        newMessagePage.insertMessageAddressee(MESSAGE_ADDRESSEE)
                .insertSubject(MESSAGE_SUBJECT)
                .insertMessageContent(MESSAGE_CONTENT)
                .clickSendMessageButton();

        return newMessagePage;
    }

    public NewMessagePage tryToSendMessage(String addressee, String subject, String content) {
        newMessagePage.insertMessageAddressee(addressee)
                .insertSubject(subject)
                .insertMessageContent(content)
                .clickSendMessageButton();

        return newMessagePage;
    }
}
