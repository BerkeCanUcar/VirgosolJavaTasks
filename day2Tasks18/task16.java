package day2Tasks;

public class task16 {

    public static void main(String[] args) {

        String str = "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.";
        System.out.println("Son hali :" + str.replace(".","!").replace("kötü", "iyi"));

    }
}
/* 16. Ali, yazdığı romanın bazı bölümlerinde "kötü" kelimesini "iyi" ile ve '.' karakterini '!' karakteri ile değiştirmek istemektedir.
Aşağıda verilen metin üzerinde bu değişiklikleri yapacak bir Java programı yazınız:
Girdi metni: "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir."

   Örnek Girdi:
   Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.

   Örnek Çıktı:
   Bu iyi bir hikaye! Ancak, Ali'nin çabalarıyla daha iyi olabilir! */