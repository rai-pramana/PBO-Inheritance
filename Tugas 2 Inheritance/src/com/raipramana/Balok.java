// package
package com.raipramana;

// import objek persegiPanjang dari class Main
import static com.raipramana.Main.persegiPanjang;

// pembuatan class Balok sebagai keturunan dari class BangunRuang dan
// secara tidak langsung menjadi keturunan dari class BangunDatar
public class Balok extends BangunRuang {
    // atribut
    double tinggi;

    // memodifikasi method luas() dari class BangunDatar
    @Override
    double luas() {
        // lp = 2(p * l + p * t + l * t)
        return (2 * (persegiPanjang.luas() + persegiPanjang.panjang * tinggi + persegiPanjang.lebar * tinggi));
    }

    // memodifikasi method volume() dari class BangunRuang
    @Override
    double volume() {
        // v = t * p * l
        return (tinggi * persegiPanjang.luas());
    }

    // memodifikasi method lihatLuas() dari class BangunDatar
    @Override
    void lihatLuas() {
        System.out.println("Luas permukaan balok : " + luas());
    }

    // memodifikasi method lihatVolume() dari class BangunRuang
    @Override
    void lihatVolume() {
        System.out.println("Volume balok : " + volume());
    }
}
