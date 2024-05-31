package day2Tasks;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + sayi);

        if (sayi > 0){
            System.out.println("Girdiğiniz sayı pozitif bir sayıdır ve girdiğiniz sayı: " + sayi);
        } else if (sayi == 0){
            System.out.println("Girdiğiniz sayı ne pozitif ne de negatiftir 0'dır");
        } else if (sayi < 0){
            System.out.println("Girdiğiniz sayı negatif bir sayıdır ve girdiğiniz sayı: " + sayi);
        }
    }
}
/* 1. Kullanıcıdan bir tam sayı girmesini isteyen ve eğer sayı negatif ise "Sayı negatiftir" mesajını yazdıran programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz:

   Örnek Çıktı:
   Sayı negatiftir */