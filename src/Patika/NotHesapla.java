package Patika;

import java.util.Scanner;

public class NotHesapla {

    public static void main(String[] args){
        int mat, turkce;

        Scanner imp = new Scanner(System.in);
        System.out.print("Mat Notunu Gir:");
        mat = imp.nextInt();

        System.out.print("Turkce Notu Gir:");
        turkce = imp.nextInt();

        float notToplam = mat + turkce;
        float notOrtalama = notToplam / 2;
        System.out.println(String.format("Sınıf Not Ortalamanız: %s",notOrtalama));
        System.out.print(String.format("Sınıf Geçme Durumunuz: %s",notOrtalama>=60 ? "Geçti":"Kaldı"));
    }
}
