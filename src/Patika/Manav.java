package Patika;

import java.util.Scanner;

public class Manav {

    public static void main(String[] args){
        double armutFiyat = 2.14;
        double armutKG = 0;

        double elmaFiyat = 3.67;
        double elmaKG = 0;

        double tutar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç KG Armut?");
        armutKG = scanner.nextDouble();
        tutar += armutFiyat * armutKG;

        System.out.println("Elma KG Armut?");
        elmaKG = scanner.nextDouble();
        tutar += elmaFiyat * elmaKG;

        System.out.println("Toplam Tutar: " + tutar);
    }

}
