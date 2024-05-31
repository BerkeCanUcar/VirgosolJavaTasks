package day2Tasks;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenar uzunluğunu giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci kenar uzunluğunu giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu giriniz");
        int sayi3 = scanner.nextInt();

        if (sayi1 == sayi2 && sayi1 == sayi3){
            System.out.println("Bu üçgen eşkenar üçgendir");
        } else if (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 == sayi3){
            System.out.println("Bu üçgen ikizkenar üçgendir");
        } else System.out.println("Bu üçgen çeşitkenar üçgendir");
    }
}
/* 4. Kullanıcıdan bir üçgenin kenar uzunluklarını girmesini isteyen ve bu üçgenin eşkenar olup olmadığını belirleyen programı yazınız.

   Örnek Girdi:
   Birinci kenar uzunluğunu giriniz: 5
   İkinci kenar uzunluğunu giriniz: 5
   Üçüncü kenar uzunluğunu giriniz: 5

   Örnek Çıktı:
   Bu üçgen eşkenar üçgendir */