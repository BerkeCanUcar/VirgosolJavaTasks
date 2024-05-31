package day2Tasks;

import java.util.Scanner;

public class task5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Alınan notu giriniz: ");
        int not1 = scanner.nextInt();

        if (not1 > 100) {
            System.out.println("Lütfen sıfır ile yüz arasında bir not giriniz");
        } else if (not1 >= 90) {
            System.out.println("Not: A");
        } else if (not1 >= 80) {
            System.out.println("Not: B");
        } else if (not1 >= 70) {
            System.out.println("Not: C");
        } else if (not1 >= 60) {
            System.out.println("Not: D");
        } else if (not1 >= 0) {
            System.out.println("Not: F");
        } else {
            System.out.println("Lütfen sıfır ile yüz arasında bir not giriniz ");
        }
    }
}
/* 5. Bir üniversite, öğrencilerin aldığı derslere göre notlarını harf notuna çeviren bir Java programı yazmanızı istemektedir.
Program, her bir öğrencinin notunu okuyacak ve aşağıdaki kurallara göre harf notunu belirleyecektir:
	90-100: A
	80-89: B
	70-79: C
	60-69: D
	0-59: F

	Örnek Girdi:
	Bir puan giriniz: 85

	Örnek Çıktı:
	Not: B */