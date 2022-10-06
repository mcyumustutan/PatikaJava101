package Patika;

import java.util.Scanner;

/**
 *  Dik üçgenin uzun ve kısa kenar uzunluğunu alarak:
 *  Hipotenüsünü, Çevresini, alanını hesaplayınız
 */
public class DikUcgen {
    public static void main(String[] args){
        double kisaKenar, uzunKenar, hipotenus, alan, cevre;

        Scanner imp = new Scanner(System.in);
        System.out.print("Kısa Kenarı:");
        kisaKenar = imp.nextDouble();
        System.out.print("uzun Kenarı:");
        uzunKenar = imp.nextDouble();

        hipotenus = Math.sqrt(
                Math.pow(kisaKenar,2) + Math.pow(uzunKenar,2)
        );

        cevre = kisaKenar + uzunKenar + hipotenus;
        alan = (kisaKenar * uzunKenar) / 2;

        System.out.printf("Hipotenus: %s\n", hipotenus);
        System.out.printf("Üçgenin Çevresi: %s\n", cevre);
        System.out.printf("Üçgenin Alanı: %s\n", alan);

    }
}
