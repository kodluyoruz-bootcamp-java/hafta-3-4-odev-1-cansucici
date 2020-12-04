package DunyaSaatleri;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewYork implements Runnable{
    @Override
    public void run() {
            Instant nowUtc = Instant.now();
            ZoneId n = ZoneId.of("America/New_York");
            ZonedDateTime nown = ZonedDateTime.ofInstant(nowUtc, n);
            System.out.println("NewYork" + " : " + nown);
        }
    }
