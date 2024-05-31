package day2Tasks;

import java.util.Scanner;

 class task3 {

     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Birinci sayıyı giriniz");
         int sayi1 = scanner.nextInt();

         System.out.println("İkinci sayıyı giriniz");
         int sayi2 = scanner.nextInt();

         System.out.println("Girdiğiniz birinci sayı : " + sayi1 + "\n" + "Girdiğiniz ikinci sayı " + sayi2);
         System.out.println("Sayıların çarpımı: " + (sayi1 * sayi2));
     }
}
/*
3. Kullanıcıdan iki tam sayı girmesini isteyen ve bu sayıların çarpımını ekrana yazdıran programı yazınız.

Örnek Girdi:
İlk sayıyı giriniz: 4
İkinci sayıyı giriniz: 5

Örnek Çıktı:
Sayıların çarpımı: 20*/