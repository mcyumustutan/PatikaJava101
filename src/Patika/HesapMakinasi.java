package Patika;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args){
        int n1, n2, select;

        Scanner imp = new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        n1 = imp.nextInt();

        System.out.print("İkinci Sayı: ");
        n2 = imp.nextInt();


        System.out.println("\nİşlem Seçiniz: ");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");

        select = imp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme: " + (n1 / n2));
                break;
            default:
                System.out.println("Hatalı İşlem Kodu!");
                break;
        }


    }
}
