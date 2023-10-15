
public class MakineMuhendisi implements IMuhendis, IMuhendisCinsellik {

    @Override
    public void millilik_durumu_sorgula() {
        if(sex){
            System.out.println("Sex yaptim");
        }else{
         System.out.println("Henuz sex yapmadim");
        }
    }

    boolean askerlik;
    boolean adli_sicil;
    boolean sex;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil, boolean sex) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
        this.sex = sex;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("Askerlik yaptim");
        } else {
            System.out.println("Askerlik yapmadim");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {

        return "ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil) {

            System.out.println("Adli sicilim var");
        } else {
            System.out.println("Adli sicil kaydim yok");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {

        System.out.println("Calistigim firmalar listesi: ");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
    
    public void referans(String[] array){
        
        System.out.println("Referanaslarim: ");
        for(int i = 0 ; i < array.length ; i++){
        System.out.println(array[i]);
        }
    
    }

}
