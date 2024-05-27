package day1Tasks11;

public class operatorKontrol {
    public static void main(String[] args){

        int a = 5, b = 8 , c = 12;
        // operatör kullanmadan
        boolean x = (a + b + c) == 25;
        System.out.println("a, b ve c'nin toplamı 25'e eşit mi? " + x);

        boolean y = (a + b) > c;
        System.out.println("a ve b'nin toplamı c'den büyük mü? " + y);

        boolean z = (a * a) < b;
        System.out.println("a'nın karesi b'den küçük mü? " + z);

        boolean k = (a < b) && (b < c) || (a > b) && (b > c);
        System.out.println("b, a ve c arasında ortanca değer mi? " + k);

        boolean l = c < (a + b);
        System.out.println("c, a ve b'nin toplamından küçük mü? " + l);

        System.out.println("---------------------------------------------");
        // operatör kullanarak
        String yirmiBes = (a + b + c ==25) ? "true": "false";
        System.out.println("a, b ve c'nin toplamı 25'e eşit mi? " + yirmiBes);

        String toplamBuyuk = ((a + b) > c) ? "true" : "false";
        System.out.println("a ve b'nin toplamı c'den büyük mü? " + toplamBuyuk);

        String sayiKaresi = ((a * a) < b) ? "true" : "false";
        System.out.println("a'nın karesi b'den küçük mü? " + sayiKaresi);

        String medyan = (a < b) && (b < c) || (a > b) && (b > c) ? "true" : "false";
        System.out.println("b, a ve c arasında ortanca değer mi? " + medyan);

        String toplamKucuk = (c < (a + b)) ? "true" : "false";
        System.out.println("c, a ve b'nin toplamından küçük mü? " + toplamKucuk);
    }
}

/*11- Aşağıdaki Java programında, mantıksal ve ilişkisel operatörleri kullanarak belirli koşulları kontrol ediniz ve sonuçları ekrana yazdırınız.
Programda `if`, `else`, `for`, `while` gibi kontrol yapıları kullanmadan ifadelerin doğruluğunu ve mantıksal işlemleri gerçekleştiriniz.

Görevler:
1. Üç adet tam sayı belirleyiniz: `a = 5`, `b = 8`, `c = 12`.
2. Aşağıdaki ifadelerin doğruluğunu kontrol ediniz ve sonuçları ekrana yazdırınız:
    - `a`, `b` ve `c`'nin toplamı 25'e eşit mi?
    - `a` ve `b`'nin toplamı `c`'den büyük mü?
    - `a`'nın karesi `b`'den küçük mü?
    - `b`, `a` ve `c` arasında ortanca değer mi?
    - `c`, `a` ve `b`'nin toplamından küçük mü?

3. Mantıksal ve ilişkisel operatörleri kullanarak ifadelerin doğruluğunu kontrol ediniz ve sonuçları ekrana yazdırınız.

İstenen Çıktı:

a, b ve c'nin toplamı 25'e eşit mi? true
a ve b'nin toplamı c'den büyük mü? true
a'nın karesi b'den küçük mü? true
b, a ve c arasında ortanca değer mi? true
c, a ve b'nin toplamından küçük mü? false

Bu işlevi yerine getiren Java kodunu yazınız.*/

