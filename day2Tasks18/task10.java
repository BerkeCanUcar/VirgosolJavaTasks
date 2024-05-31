package day2Tasks;
import java.util.Scanner;
public class task10 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci cümleyi giriniz:\n ");
        String cumle1 = scanner.nextLine();
        System.out.println("Girdiğiniz birinci cümle: " + cumle1);
        System.out.println("Birinci cümlenin uzunluğu " + cumle1.length()); //Cümle uzunluğu hesaplar

        System.out.println("İkinci cümleyi giriniz:\n ");
        String cumle2 = scanner.nextLine();
        System.out.println("Girdiğiniz ikinci cümle: " + cumle2);
        System.out.println("İkinci cümlenin uzunluğu " + cumle2.length()); // Cümle uzunluğu hesaplar

        if(cumle1.length() > cumle2.length()){
            System.out.println("Uzun olan cümle: " + cumle1);
        } else if (cumle2.length() > cumle1.length()){
            System.out.println("Uzun olan cümle: " +cumle2);
        } else {
            System.out.println("İki cümlenin uzunluğu eşittir.");
        }
    }
}
/* 10. Girilen iki cümleden uzun olanı bulan bir program yazın.

	Örnek Girdi:
	Birinci cümleyi giriniz: Merhaba Dünya
	İkinci cümleyi giriniz: Java programlama dili

	Örnek Çıktı:
	Uzun olan cümle: Java programlama dili
 */
