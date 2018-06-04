package page;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public void waitFiveSecond() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
