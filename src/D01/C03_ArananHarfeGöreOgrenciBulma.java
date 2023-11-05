package D01;

public class C03_ArananHarfeGöreOgrenciBulma {
    // Ogretmen soru soracağı kişileri sınıf listesinden isimlerin ilk harfine göre seçmektedir.
    // Ogretmenin verdiği harfin sınıf listesinde olup olmadığını
    // yazdıran bir metot oluşturun.
    public static void main(String[] args) {
        String[] isimler = {"Sahra", "Ahmet", "Yeliz", "Burak", "Zeynel", "Mine", "Berfin"};

        isminIlkHarfi(isimler,"a");
    }
    public static void isminIlkHarfi(String[] isimler, String ilkharf){
        boolean isimVarMı=false;
        for (int i = 0; i <isimler.length; i++) {
            String isim=isimler[i].toUpperCase();
            ilkharf=ilkharf.toUpperCase();
            if (isim.startsWith(ilkharf)){
                System.out.println("Sınıfta aranan harfe göre bulunan öğrenci : "+isim);
                isimVarMı=true;



            }

        }
        if (!isimVarMı){
            System.out.println("Sınıfta aranan harfe göre öğrenci bulunamamıştır");
        }
    }

    }

