// package
package com.raipramana;

// pembuatan class Lingkaran sebagai keturunan dari class BangunDatar
public class Lingkaran extends BangunDatar {
    // atribut
    double r;

    // memodifikasi method luas() dari class BangunDatar
    @Override
    double luas() {
        return (Math.PI * r * r); // Math.PI untuk memberikan nilai phi yaitu 22/7
    }

    // memodifikasi method lihatLuas() dari class BangunDatar
    @Override
    void lihatLuas() {
        System.out.println("Luas lingkaran : " + luas());
    }
}
