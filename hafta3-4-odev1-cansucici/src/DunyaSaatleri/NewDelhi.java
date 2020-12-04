package DunyaSaatleri;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewDelhi implements Runnable {
    @Override
    public void run() {

            Instant nowUtc = Instant.now();
            ZoneId del = ZoneId.of("Asia/Kolkata");
            ZonedDateTime nowdel = ZonedDateTime.ofInstant(nowUtc, del);
            System.out.println("Delhi" + " :"  + nowdel);
}}
