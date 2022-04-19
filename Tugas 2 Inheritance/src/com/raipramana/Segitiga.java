// package
package com.raipramana;

// pembuatan class Segitiga sebagai keturunan dari class BangunDatar
public class Segitiga extends BangunDatar {
    // atribut
    double alas, tinggi;

    // memodifikasi method luas() dari class BangunDatar
    @Override
    double luas() {
        return (0.5 * alas * tinggi);
    }

    // memodifikasi method lihatLuas() dari class BangunDatar
    @Override
    void lihatLuas() {
        System.out.println("Luas segitiga : " + luas());
    }
}
