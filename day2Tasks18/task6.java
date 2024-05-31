package day2Tasks;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz:\n ");
        String kelime = scanner.nextLine();
        System.out.println("Girdiğiniz cümle: " + kelime);
        System.out.println("Girdiğiniz cümlenin uzunluğu: " + kelime.length());
        if (kelime.length() < 50) {
            System.out.println("Kısa bir cümle");
        } else{
            System.out.println("Uzun bir cümle");
        } scanner.close();
    }
}
/* 6. Kullanıcıdan bir cümle girmesini isteyen ve eğer cümlenin uzunluğu 50'den küçükse "Kısa bir cümle" mesajını yazdıran programı yazınız.

   Örnek Girdi:
   Bir cümle giriniz: Merhaba, nasılsınız?

   Örnek Çıktı:
   Kısa bir cümle*/