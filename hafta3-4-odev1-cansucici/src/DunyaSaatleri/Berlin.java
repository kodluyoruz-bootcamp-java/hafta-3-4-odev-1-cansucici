package DunyaSaatleri;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Berlin implements Runnable {
    @Override
    public void run() {
            Instant nowUtc = Instant.now();
            ZoneId berlin = ZoneId.of("Europe/Berlin");
            ZonedDateTime nowberlin = ZonedDateTime.ofInstant(nowUtc, berlin);
          //  System.out.println(getCityName() + " : " + nowberlin);
        System.out.println("Berlin time:" + nowberlin);

        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
             }

    //   System.exit(55);
    }
}
