package helper.interfaces;

import page.main.NewMessagePage;

public interface INewMessagePageHelper {

    NewMessagePage sendValidMessage();
    NewMessagePage tryToSendMessage(String addresse, String subject, String content);
}
