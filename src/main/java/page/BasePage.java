package page;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public void waitOneSecond() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
