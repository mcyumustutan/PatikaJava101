package Patika;

import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args){
        float tutar, kdvTutari, kdvOrani, genelToplam;

        Scanner imp = new Scanner(System.in);
        System.out.print("Tutar Giriniz:");
        tutar = imp.nextFloat();

        kdvOrani = tutar < 1000 ? .18f : .08f;

        kdvTutari = tutar * kdvOrani;

        genelToplam = tutar + kdvTutari;

        System.out.printf("Girilen Tutar %s\nKDV Oranı: %s\nKDV Tutarı: %s\nGenel Toplam: %s", tutar, kdvOrani, kdvTutari, genelToplam);

    }
}
