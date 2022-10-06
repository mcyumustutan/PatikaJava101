package Patika;

import java.util.Scanner;

/**
 * Dairenin Alanını ve Çevresini Hesaplayan Program
 */
public class Circle {
    public static void main(String[] args){
        double r;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Daire Yarıçapını Giriniz:");
        r = scanner.nextDouble();

        double area = pi * Math.pow(r,2);
        double env = 2 * pi * r;

        System.out.println("Daire Alanı:" + area);
        System.out.println("Daire Çevresi:" + env);

    }
}
