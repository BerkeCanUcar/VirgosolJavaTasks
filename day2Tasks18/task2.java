package day2Tasks;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz: ");

        String kelime = scanner.next(); // bir kelime girileceği için next() kullandık. Birden fazla olsaydı nextLine() kullanılırdı.

        System.out.println("Girdiğiniz kelime: " + kelime);
        System.out.println("Girdiğiniz kelimenin uzunluğu: " + kelime.length());

    }
}
/*
2. Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

Örnek Girdi:
Bir kelime giriniz: merhaba

Örnek Çıktı:
Kelimenin uzunluğu: 7*/
