package day21maps;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {








//Map oluşturma

        HashMap<String,Integer>countryPopulation=new HashMap<>();
        
        countryPopulation.put("Germany",85000000);//Her satıra entry deniyor
        countryPopulation.put("Italy",40000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkey",85000000);
        System.out.println("countryPopulation = " + countryPopulation);//Dağınık sıraladı.Hash ler süper hızlı çalışır ama rastgele sıralar
        
        Integer usaPOP=countryPopulation.get("USA");

        System.out.println("usaPOP = " + usaPOP);

        Set<String> keys=countryPopulation.keySet();//Bütün keyleri yazdırıyor
        System.out.println("keys = " + keys);

        Collection<Integer> valeUs=countryPopulation.values();

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?
        int sum=0;

        for (Integer w:valeUs) {
            sum+=w;
        }
        System.out.println(sum+valeUs.size());

       Set<Map.Entry<String,Integer> >  enries=countryPopulation.entrySet();//Mapda loop kullanamıyon.O yüzden elmas içi değişik

        System.out.println(enries);//[USA=400000000, Turkey=85000000, Italy=40000000, Germany=85000000]


        //entrySet() methodu mapteki entry leri kalip halinde alip Set in icine koyarak verir
        //loop lar map ler ile kullanilamaz, bunun icin entryset methodunu kullanarak mapin key value olan entry lerini bir setin icine koyariz
      //  Set<  Map.Entry<String,Integer>   > entries = countryPopulation.entrySet();
      //  System.out.println(entries);//[Turkiye=83000000, Netherland=18000000, USA=400000000, Italy=40000000, Germany=83000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.



       int toplam=0;


        for (Map.Entry<String,Integer> w:enries) {

            toplam+=w.getKey().length()+ w.getValue();




        }

        System.out.println(toplam);








    }

}
