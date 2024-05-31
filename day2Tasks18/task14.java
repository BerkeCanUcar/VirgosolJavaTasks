package day2Tasks;
import java.util.Scanner;

public class task14 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kelimeyi giriniz:\n ");
        String kelime1 = scanner.nextLine();
        System.out.println("Girdiğiniz birinci kelime: " + kelime1);

        System.out.println("İkinci kelimeyi giriniz:\n ");
        String kelime2 = scanner.nextLine();
        System.out.println("Girdiğiniz ikinci kelime: " + kelime2);

        if (kelime1.equals(kelime2)) {
            System.out.println("Kelimeler eşit. ");
        } else {
            System.out.println("Kelimeler farklı. ");
        } scanner.close();
    }
}
/*
14. Kullanıcıdan iki kelime girmesini isteyen ve bu kelimelerin eşit olup olmadığını kontrol eden programı yazınız.

	Örnek Girdi:
	Birinci kelimeyi giriniz: Merhaba
	İkinci kelimeyi giriniz: Merhaba

	Örnek Çıktı:
	Kelimeler eşit.    */
