package uvsq21807481;

import java.time.LocalDateTime;

public class MessageLog implements Afficheur {

    public void message(String s) {
        System.out.println(LocalDateTime.now() + s);
    }
}
