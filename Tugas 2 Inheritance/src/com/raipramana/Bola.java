// package
package com.raipramana;

// import objek lingkaran dari class Main
import static com.raipramana.Main.lingkaran;

// pembuatan class Bola sebagai keturunan dari class BangunRuang dan
// secara tidak langsung menjadi keturunan dari class BangunDatar
public class Bola extends BangunRuang {
    // memodifikasi method luas() dari class BangunDatar
    @Override
    double luas() {
        return (4 * lingkaran.luas());
    }

    // memodifikasi method volume() dari class BangunRuang
    @Override
    double volume() {
        return (1.333 * lingkaran.luas() * lingkaran.r);
    }

    // memodifikasi method lihatLuas() dari class BangunDatar
    @Override
    void lihatLuas() {
        System.out.println("Luas permukaan bola : " + luas());
    }

    // memodifikasi method lihatVolume() dari class BangunRuang
    @Override
    void lihatVolume() {
        System.out.println("Volume bola : " + volume());
    }
}
