package day2Tasks;

public class task9 {

    public static void main(String[] args){

            String kelime = "abc";

            char a = kelime.charAt(0);
            int ascII1 = (int) a;

            char b = kelime.charAt(1);
            int ascII2 = (int) b;

            char c = kelime.charAt(2);
            int ascII3 = (int) c;

            System.out.println("Karakter: " + a + ", ASCII Değeri: " + ascII1);
            System.out.println("Karakter: " + b + ", ASCII Değeri: " + ascII2);
            System.out.println("Karakter: " + c + ", ASCII Değeri: " + ascII3);
    }
}
/* 9.  'abc' metinindeki ASCII değerlerini ekrana yazdıran programı yazınız.

    Örnek Çıktı:
	Karakter: a, ASCII Değeri: 97
	Karakter: b, ASCII Değeri: 98
	Karakter: c, ASCII Değeri: 99 */