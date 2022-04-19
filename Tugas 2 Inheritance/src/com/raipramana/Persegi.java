// package
package com.raipramana;

// pembuatan class Persegi sebagai keturunan dari class BangunDatar
public class Persegi extends BangunDatar {
    double sisi;

    // memodifikasi method luas() dari class BangunDatar
    @Override
    double luas() {
        return (sisi * sisi);
    }

    // memodifikasi method lihatLuas() dari class BangunDatar
    @Override
    void lihatLuas() {
        System.out.println("Luas persegi : " + luas());
    }
}
