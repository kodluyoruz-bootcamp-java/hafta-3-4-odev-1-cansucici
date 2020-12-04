package DunyaSaatleri;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class City implements Comparable<City>, Clock , Runnable {

    String cityName;
    String uniqueCode;
    int GMT;

    public City(String cityName, String uniqueCode, int GMT) {
        this.cityName = cityName;
        this.uniqueCode = uniqueCode;
        this.GMT = GMT;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public int getGMT() {
        return GMT;
    }

    public void setGMT(int GMT) {
        this.GMT = GMT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return GMT == city.GMT &&
                cityName.equals(city.cityName) &&
                uniqueCode.equals(city.uniqueCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, uniqueCode, GMT);
    }

    @Override
    public void showTime() {
        SimpleDateFormat instantTime = new SimpleDateFormat("d/M/y h:m:s");
        Date date = new Date();
        //   System.out.println(getCityName() + " : "+ instantTime.format(date));

      //  if (getUniqueCode() == "BER") {
       //     Instant nowUtc = Instant.now();
        //    ZoneId berlin = ZoneId.of("Europe/Berlin");
      //      ZonedDateTime nowberlin = ZonedDateTime.ofInstant(nowUtc, berlin);
      //      System.out.println(getCityName() + " : " + nowberlin);
     //   }

        if (getUniqueCode() == "MOW") {
            Instant nowUtc = Instant.now();
            ZoneId m = ZoneId.of("Europe/Moscow");
            ZonedDateTime nowm = ZonedDateTime.ofInstant(nowUtc, m);
            System.out.println(getCityName() + " : " + nowm);
        }

        if (getUniqueCode() == "NYC") {
            Instant nowUtc = Instant.now();
            ZoneId n = ZoneId.of("America/New_York");
            ZonedDateTime nown = ZonedDateTime.ofInstant(nowUtc, n);
            System.out.println(getCityName() + " : " + nown);
        }

        if (getUniqueCode() == "LON") {
            Instant nowUtc = Instant.now();
            ZoneId l = ZoneId.of("Europe/London");
            ZonedDateTime nowl = ZonedDateTime.ofInstant(nowUtc, l);
            System.out.println(getCityName() + " : " + nowl);
        }

        if (getUniqueCode() == "DEL") {
            Instant nowUtc = Instant.now();
            ZoneId del = ZoneId.of("India/Delhi");
            ZonedDateTime nowdel = ZonedDateTime.ofInstant(nowUtc, del);
            System.out.println(getCityName() + " : " + nowdel);
        }
    }

    @Override
    public int compareTo(City city) {
        return this.cityName.compareTo(city.getCityName());
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", uniqueCode='" + uniqueCode + '\'' +
                //", GMT=" + GMT +
                '}';
    }

    @Override
    public void run() {

    }
}
