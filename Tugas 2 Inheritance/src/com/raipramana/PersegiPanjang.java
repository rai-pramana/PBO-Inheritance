// package
package com.raipramana;

// pembuatan class PersegiPanjang sebagai keturunan dari class BangunDatar
public class PersegiPanjang extends BangunDatar {
    // atribut
    double panjang, lebar;

    // memodifikasi method luas() dari class BangunDatar
    @Override
    double luas() {
        return (panjang * lebar);
    }

    // memodifikasi method lihatLuas() dari class BangunDatar
    @Override
    void lihatLuas() {
        System.out.println("Luas persegi panjang : " + luas());
    }
}
