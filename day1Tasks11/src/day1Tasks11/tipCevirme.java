package day1Tasks11;

public class tipCevirme {

    public static void main(String[] args){

        float urun = 123.456f;
        int urun2 = 22;
        int urunAli = (int) urun;
        byte urunVeli = (byte) urun2; // opsiyonel
        float toplamPara = urunAli + urun2;

        System.out.println("Ürünün ilk fiyatı: " + urun);
        System.out.println("Ali'nin istediği: " + urunAli);
        System.out.println("Veli'nin istediği: " + urunVeli);
        System.out.println("Ali ve Veli'nin toplam harcadığı para: " + toplamPara);
    }
}

/* 9- Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
Ali, bir ürünün fiyatını 123.456 TL olarak görüyor. Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız. */

