package D01;

public class C02_ElemanKaydırma {
    public static void elemanKaydirma(int[] arr) {
    /*

        Verilen bir array'deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array'i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array'in son hali. : [7,4,5,6]
       */

    int sonElemanSakla = arr[arr.length - 1];//daha sonra kullanmak üzere son elemanı kaydederiz
        for (int i = arr.length - 1; i > 0; i--) {
        arr[i] = arr[i - 1];//buna göre arr for döngüsü her döndüğünde ilk elemanı sona doğru kaydırır
    }
    arr[0] = sonElemanSakla;//sakladığımız son eleman burada ilk eleman olarak atıyoruz

        for (int each : arr) {//bütün elemanları arr den çağırarak yazdırıyoruz
        System.out.print(each + " ");
    }
}

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};

        elemanKaydirma(input);

    }}
