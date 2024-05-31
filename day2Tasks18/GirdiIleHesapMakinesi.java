package day2Tasks;

import java.util.Scanner;

public class GirdiIleHesapMakinesi {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        System.out.println("Birinci sayıyı giriniz");
        int myInt = scanner.nextInt();
        System.out.println("Girdiğiniz sayı" + myInt);

        System.out.println("İkinci sayıyı giriniz");
        int myInt2 = scanner.nextInt();
        System.out.println("Girdiğiniz ikinci sayı" + myInt2);

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz \t 1 Toplama, 2 Çıkarma, 3 Çarpma, 4 Bölme");
        int islem = scanner.nextInt();

        switch (islem){

            case 1 :
                System.out.println("Girdiğiniz sayıların toplamı: " + myInt2 + myInt);
                break;

            case 2 :
                System.out.println("Girdiğiniz sayıların farkı: " + (myInt - myInt2));
                break;

            case 3 :
                System.out.println("Girdiğiniz sayıların çarpımı: " + myInt2 * myInt);
                break;

            case 4 :
                System.out.println("Girdiğiniz sayıların çarpımı:6 " + (float) myInt / myInt2);
                break;

            default :
                System.out.println("Hatalı bir işlem girdiniz :( ");

        }
        scanner.close();
    }
}
/* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin....");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı girin....");
        int sayi2 = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlemi girin : * / - +");
        scanner.nextLine();

        String islem = scanner.nextLine();

        switch(islem) {
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println((float)sayi1 / sayi2);
                break;
            case "+":
                System.out.println(sayi1 + sayi2);
                break;
            case "-" :
                System.out.println(sayi1-sayi2);
                break;
            default:
                System.out.println("hatalı değer girdiniz");
        }
        scanner.close();

    } */