package day2Tasks;

import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("Girdiniz sayı: " + sayi1);

        if (sayi1 % 3 == 0) {
            if (sayi1 % 5 == 0) {
                System.out.println("Sayı hem 3 hem de 5 ile bölünebilir. ");
            } else {
                System.out.println("Sayı 3'e bölünebilir 5'e bölünemez. ");
            }
        } else if(sayi1 % 5 == 0){
            System.out.println("Sayı 3'e bölünemez 5'e bölünebilir. ");
        }
        else {
            System.out.println("Sayı ne 3'e ne de 5'e bölünebilir. ");
        }
    }
}
/* 8. Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının 3 ve 5 ile bölünebilir olup olmadığını belirten programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz: 15


   Örnek Çıktı:
   Sayı hem 3 hem de 5 ile bölünebilir */
