package DunyaSaatleri;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class London implements Runnable{
    @Override
    public void run() {

            Instant nowUtc = Instant.now();
            ZoneId l = ZoneId.of("Europe/London");
            ZonedDateTime nowl = ZonedDateTime.ofInstant(nowUtc, l);
            System.out.println( "London"+ " : " + nowl);
        }
    }

