package day2Tasks;

import java.util.Scanner;
public class task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz:\n ");
        String cumle = scanner.nextLine();
        System.out.println("Girdiğiniz cümle: " + cumle);
        System.out.println(cumle.startsWith("Java"));

        if (cumle.startsWith("Java") == true) {
            System.out.println("Cümle 'Java' ile başlıyor.");
        } else {
            System.out.println("Cümle 'Java' ile başlamıyor");
        }
    }
}
/*
11. Girilen bir cümlenin belirli bir kelime ile başlayıp başlamadığını kontrol eden bir program yazın.

	Örnek Girdi:
	Bir cümle giriniz: Java programlama dili
	Kontrol edilecek kelime: Java

	Örnek Çıktı:
	Cümle 'Java' ile başlıyor. */