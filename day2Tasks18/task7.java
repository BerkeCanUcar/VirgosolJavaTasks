package day2Tasks;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + sayi1);
        if (sayi1 > 0){
            System.out.println("Sayı pozitiftir.");
        } else if (sayi1 == 0) {
            System.out.println("Sayı sıfırdır.");
        } else {
            System.out.println("Sayı negatirtir.");
        }scanner.close();
    }

}
/*   7. Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının pozitif, negatif veya sıfır olduğunu belirten programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz: 0

   Örnek Çıktı:
   Sayı sıfırdır */