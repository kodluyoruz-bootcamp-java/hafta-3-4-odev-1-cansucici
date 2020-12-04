package DunyaSaatleri;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Map<String, City> codeCityMap = new HashMap<String, City>();

        City moscow = new City("Moscow", "MOW", 1);
        City newyork = new City("Newyork", "NYC", 2);
        City london = new City("London", "LON", 3);
        City berlin = new City("Berlin", "BER", 2);
        City newDelhi = new City("New Delhi", "DEL", 1);

        // Map'imizin key'i şehir kodlarını tutarken, value kısmı ise Şehirlerimizi tutacaktır.
        codeCityMap.put(moscow.getUniqueCode(), moscow);
        codeCityMap.put(newyork.getUniqueCode(), newyork);
        codeCityMap.put(london.getUniqueCode(), london);
        codeCityMap.put(berlin.getUniqueCode(), berlin);
        codeCityMap.put(newDelhi.getUniqueCode(), newDelhi);

        //Map içerisindeki tüm key-value değer ikililerini ekrana yazdırır.
        TreeMap<String, City> sorted = new TreeMap<>();
        sorted.putAll(codeCityMap);

        List<City> employeeById = new ArrayList<>(codeCityMap.values());
        Collections.sort(employeeById);
        for (City ikkk : employeeById
        ) {
            System.out.println(ikkk);
        }

        System.out.println("Lütfen 3 harften oluşan şehir kodunu büyük harflerle giriniz. İlerlemek için Enter tuşuna basınız.");
     //   System.out.println("çıkış için 'OK' yazınız");

        Scanner scan=new Scanner(System.in);
        String uni=scan.next();
        String uni2=scan.next();
        String uni3=scan.next();
        String uni4=scan.next();
        String uni5=scan.next();

        List<String> list = new ArrayList<>();
        list.add(uni);
        list.add(uni2);
        list.add(uni3);
        list.add(uni4);
        list.add(uni5);
        try {
        if (list.size() >= 3 && list.size() <= 5) {
            for (String la : list
            ) {

                switch (la) {
                    case "MOW":
                  executorService.execute(new Thread(new Moscow()));
                     //   moscow.showTime();
                        break;
                    case "BER":
                        executorService.execute(new Thread(new Berlin()));
                      //  berlin.showTime();
                        break;
                    case "LON":
                        executorService.execute(new Thread(new London()));

                        //  london.showTime();
                        break;
                    case "DEL":
                        executorService.execute(new Thread(new NewDelhi()));

                        //  newDelhi.showTime();
                        break;
                    case "NYC":
                        executorService.execute(new Thread(new NewYork()));

                        //   newyork.showTime();
                        break;
                }
            }

        } else {
            System.out.println("en az 3 , en fazla 5 kod girebilirsiniz");
        }}
        catch (Exception e) {

            System.out.println("hatalı giriş yaptınız.");
        }

        System.out.println(list);


    /*    Set<Map.Entry<String, City>> pairs = codeCityMap.entrySet();

        for (Map.Entry<String, City> line : pairs) {
            String key = line.getKey();
            String value = line.getValue().cityName;
            System.out.println(line.getKey() + "->" + line.getValue().cityName);
           System.out.println(pairs); }
     */


    }
}
