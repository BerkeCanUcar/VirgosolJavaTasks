package day2Tasks;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gezegen ismi giriniz:\n ");
        String gezegen = scanner.nextLine();
        System.out.println("Girdiğiniz gezenen: " + gezegen.toLowerCase());
        switch (gezegen.toLowerCase()){
            case "merkür":
                System.out.println("İÇ GEZEGEN");
                break;
            case "venüs":
                System.out.println("İÇ GEZEGEN");
                break;
            case "dünya":
                System.out.println("İÇ GEZEGEN");
                break;
            case "mars":
                System.out.println("İÇ GEZEGEN");
                break;
            case "jüpiter":
                System.out.println("DIŞ GEZEGEN");
                break;
            case "satürn":
                System.out.println("DIŞ GEZEGEN");
                break;
            case "uranüs":
                System.out.println("DIŞ GEZEGEN");
                break;
            case "neptün":
                System.out.println("DIŞ GEZEGEN");
                break;
    }
    }
}
/*
18. Bir Astronom, gezegenleri sınıflandırmak için bir program geliştirmek istiyor. Kullanıcıdan girilen gezegen adıyla gezegenin iç gezegen mi yoksa dış gezegen mi olduğunu belirlemesi gerekiyor. Astronomun bu programı yazmasına yardımcı olun.
	Not1: İÇ GEZEGENLER --> Merkür, Venüs, Dünya ve Mars.
		  DIŞ GEZEGENLER --> Jüpiter, Satürn, Uranüs ve Neptün
	Not2: Switch-case kullanarak yazınız.

    Örnek Girdi:
    Bir gezegen adı giriniz: Dünya

    Örnek Çıktı:
    İç gezegen
 */