// package
package com.raipramana;

// import objek persegi dari class Main
import static com.raipramana.Main.persegi;

// pembuatan class Kubus sebagai keturunan dari class BangunRuang dan
// secara tidak langsung menjadi keturunan dari class BangunDatar
public class Kubus extends BangunRuang {
    // memodifikasi method luas() dari class BangunDatar
    @Override
    double luas() {
        return (6 * persegi.luas());
    }

    // memodifikasi method volume() dari class BangunRuang
    @Override
    double volume() {
        return (persegi.sisi * persegi.luas());
    }

    // memodifikasi method lihatLuas() dari class BangunDatar
    @Override
    void lihatLuas() {
        System.out.println("Luas permukaan kubus : " + luas());
    }

    // memodifikasi method lihatVolume() dari class BangunRuang
    @Override
    void lihatVolume() {
        System.out.println("Volume kubus : " + volume());
    }
}
