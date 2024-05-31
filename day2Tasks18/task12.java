package day2Tasks;
import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ay numarası girin: ");
        int sayi1 = scanner.nextInt();
        System.out.println("Girdiniz numara " + sayi1);
        switch (sayi1) {
            case 1:
                System.out.println("KIŞ mevsimindesiniz");
                break;
            case 2:
                System.out.println("KIŞ mevsimindesiniz");
                break;
            case 3:
                System.out.println("İLKBAHAR mevsimindesiniz");
                break;
            case 4:
                System.out.println("İLKBAHAR mevsimindesiniz");
                break;
            case 5:
                System.out.println("İLKBAHAR mevsimindesiniz");
                break;
            case 6:
                System.out.println("YAZ mevsimindesiniz");
                break;
            case 7:
                System.out.println("YAZ mevsimindesiniz");
                break;
            case 8:
                System.out.println("YAZ mevsimindesiniz");
                break;
            case 9:
                System.out.println("SONBAHAR mevsimindesiniz");
                break;
            case 10:
                System.out.println("SONBAHAR mevsimindesiniz");
                break;
            case 11:
                System.out.println("SONBAHAR mevsimindesiniz");
                break;
            case 12:
                System.out.println("KIŞ mevsimindesiniz");
                break;
            default:
                System.out.println("1-12 arasında bir sayı girin");
        }
    }
}
/* 12. Kullanıcıdan bir ay numarası girmesini isteyen ve bu ayın yaz mevsiminde olup olmadığını belirleyen programı yazınız.
Not: Switch-case kullanarak yazınız.

	Örnek Girdi:
	Bir ay numarası giriniz (1-12): 7

	Örnek Çıktı:
	Yaz mevsimindesiniz. */
