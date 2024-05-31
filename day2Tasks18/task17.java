package day2Tasks;
import java.util.Scanner;
public class task17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + sayi);
        System.out.println("Karesi: " + sayi * sayi);
        System.out.println("Küpü: " + sayi * sayi * sayi);
    }
}
/* 17. Bir tam sayının karesini ve küpünü hesaplayan bir Java programı yazınız. Program, girdiyi almalı ve çıktı olarak karesini ve küpünü göstermelidir.

   Örnek Girdi:
   Bir tam sayı giriniz: 3

   Örnek Çıktı:
   Karesi: 9
   Küpü: 27 */