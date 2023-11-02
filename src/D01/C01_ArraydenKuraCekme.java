package D01;

import java.util.Random;

public class C01_ArraydenKuraCekme {
    public static void main(String[] args) {
        //Bir sınıf listesinden sonraki dersi anlatacak öğrencileri rastgele belirleyiniz

        String[]ogrenciler={"Azim", "Ercan", "Humeyra","Ihsan","Ayca","Doruk","Burcu","Senayda"};
        Random rnd=new Random();//rastgele olması için...
        int dersAnlatacakKisi= rnd.nextInt(ogrenciler.length);//burada dizi içerisindeki ders anlatacak kişi indeksi belirlenir
        String sanslıKisi=ogrenciler[dersAnlatacakKisi];//bu indexteki isim sanslıKisi ye atanır
        System.out.println(sanslıKisi);//ve yazdırılır

    }
}
