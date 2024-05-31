package day2Tasks;

import java.util.Scanner;

public class task15 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir yıl giriniz: ");
        int sayi1 = scanner.nextInt();

        if (sayi1 % 4 == 0){
            System.out.println(sayi1 + " bir artık yıldır.");
        } else {
            System.out.println(sayi1 + " bir artık yıl değildir.");
        }
    }
}
/*
15. Girilen bir yılın artık yıl olup olmadığını belirleyen bir Java programı yazınız. Programınızın çıktısı, yılın artık yıl olup olmadığını doğru bir şekilde göstermelidir.

   Örnek Girdi:
   Bir yıl giriniz: 2020

   Örnek Çıktı:
   2020 bir artık yıldır. */