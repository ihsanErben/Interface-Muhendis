
public class Main {

    public static void main(String[] args) {
        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);

        muhendis1.adli_sicil_sorgula();
        muhendis1.askerlik_durumu_sorgula();
        System.out.println( muhendis1.mezuniyet_ortalamasi(3.48));
       

        String[] liste = {"trendyol", "turkcell", "Hepsiburada"};
        muhendis1.is_tecrubesi(liste);

        System.out.println();
        System.out.println();
        System.out.println();

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,true,false);
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        String[] liste2 = {"Jetsan","Roketsan","TUSAS"};
        muhendis2.is_tecrubesi(liste2);
         System.out.println(muhendis2.mezuniyet_ortalamasi(2.80));              
        String[] liste3 = {"serdar Karaman","Zeynep Ucar","Ayse Erben"};
        muhendis2.referans(liste3);
        muhendis2.millilik_durumu_sorgula();
    }
}
