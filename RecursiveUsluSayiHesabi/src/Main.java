import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        System.out.print("Taban Sayısını Giriniz : ");

        int taban = getNumber.nextInt();

        System.out.print("Üs Sayısını Giriniz : ");

        int us = getNumber.nextInt();

        int result = hesapla(taban,us);

        System.out.println(taban + "^" + us + " = " + result);


    }

     static int hesapla(int taban , int us){

        if(us == 0){
            return 1; // Bir sayının 0'ncı üssü her zaman 1'dir.
        }

        else{

            return taban * hesapla(taban,us - 1);  // method kendini çağırdığı her aşamada tabanı sabit tutup üssü bir azaltıyor.Üssümüz 0a kadar geldiğinde ise return 1 ile fonksiyondan çıkıyoruz.

        }

    }

}
