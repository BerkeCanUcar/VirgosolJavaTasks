package day2Tasks;
import java.util.Scanner;

public class task13 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cümleyi giriniz:\n ");
        String cumle = scanner.nextLine();
        System.out.println("Cümle: " + cumle);
        System.out.println("Aranacak kelimeyi girin: ");
        String harf = scanner.nextLine();
        System.out.println("Aranacak karakter: " + harf);
        System.out.println("Sayı :" + cumle.indexOf(harf));

        System.out.println("Karakter " + "\'" + harf + "\' "+ cumle.indexOf(harf) + " pozisyonda bulunuyor");
    }
}
/* 13. Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin pozisyonunu bulan bir program yazınız.

	Örnek Girdi:
	Bir metin giriniz: Merhaba Dünya
	Aranacak karakter: a

	Örnek Çıktı:
	Karakter 'a' 4. pozisyonda bulunuyor. */
