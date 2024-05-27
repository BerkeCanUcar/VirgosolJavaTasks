package day1Tasks11;

public class toplamaCikarmaCarpmaBolme {

    public static void main(String[] args){

        int a = 15;
        int b = 2;

        int toplama = a + b;
        int cikarma = a - b;
        int carpma = a * b;
        float bolme = (float) a / b;
        int mod = a % b;

        System.out.println("15 ve 2 sayısının toplamı " + toplama);
        System.out.println("15'ten 2 sayısını çıkardığımızda " + cikarma);
        System.out.println("15 ve 2 sayısının çarpımı " + carpma);
        System.out.println("15 sayısını 2'ye böldüğümüzde " + bolme);
        System.out.println("15 sayısının 2'ye göre modunu aldığımızda " + mod);
    }
}
// 8- Java'da iki tamsayıyı toplamak, çıkarmak, çarpmak, bölmek ve bölümünden kalanını hesaplayan için bir program yazınız. Sayılar `15` ve `2` olsun: