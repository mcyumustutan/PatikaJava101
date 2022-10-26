package Patika;

import java.util.Scanner;

/**
 *     Taksimetre KM başına 2.20 TL tutmaktadır.
 *     Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 *     Taksimetre açılış ücreti 10 TL'dir.
 */

public class TaxiMeter {
    public static void main(String[] args){
        double traveledKM;
        double pricePerKm = 2.2;
        double minPrice = 20;
        double taxiMeterStartPrice = 10;
        double traveledPrice;

        Scanner imp = new Scanner(System.in);

        System.out.print("Gidilen KM giriniz:");
        traveledKM = imp.nextDouble();

        traveledPrice = taxiMeterStartPrice + ( traveledKM * pricePerKm);

        System.out.printf("Taksimetre Tutarı: %s\n", Math.max(traveledPrice, minPrice));

    }
}
