package DunyaSaatleri;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Moscow implements Runnable{
    @Override
    public void run() {

            Instant nowUtc = Instant.now();
            ZoneId m = ZoneId.of("Europe/Moscow");
            ZonedDateTime nowm = ZonedDateTime.ofInstant(nowUtc, m);
            System.out.println("Moscow" + " :"  +nowm);
        }

    }

