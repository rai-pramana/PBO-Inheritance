/* Judul        : Program Latihan 2                                 */
/* Deskripsi    : Program untuk menghitung luas dan volume bangun   */
/* Developer    : I Kadek Rai Pramana (2105551094)                  */
/* Tanggal      : 19 April 2022                                     */
/* Versi        : 1.0                                               */

// package
package com.raipramana;

// import library
import java.util.Scanner;

// class
public class Main {
    // pembuatan scanner untuk meminta inputan user
    static Scanner scanner = new Scanner(System.in);

    // pembuatan objek global
    static Persegi persegi = new Persegi();
    static PersegiPanjang persegiPanjang = new PersegiPanjang();
    static Segitiga segitiga = new Segitiga();
    static Lingkaran lingkaran = new Lingkaran();
    static Kubus kubus = new Kubus();
    static Balok balok = new Balok();
    static Bola bola = new Bola();

    // prosedur lihatMenu() untuk menampilkan menu program
    static void lihatMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("PROGRAM PENGHITUNG LUAS DAN VOLUME BANGUN");
        System.out.println("-----------------------------------------");
        System.out.println("[1] Persegi");
        System.out.println("[2] Persegi Panjang");
        System.out.println("[3] Segitiga");
        System.out.println("[4] Lingkaran");
        System.out.println("[5] Kubus");
        System.out.println("[6] Balok");
        System.out.println("[7] Bola");
        System.out.println("[0] Keluar");
        System.out.println("-----------------------------------------");
        System.out.print("Pilih menu: ");

        // meminta inputan user
        String pilihMenu = scanner.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println();

        // cek inputan user apakah memenuhi pernyataan berikut
        if (pilihMenu.equals("1")) {
            // jika inputan user = 1, panggil prosedur hitungPersegi()
            hitungPersegi();

        } else if (pilihMenu.equals("2")) {
            // jika inputan user = 2, panggil prosedur hitungPersegiPanjang()
            hitungPersegiPanjang();

        } else if (pilihMenu.equals("3")) {
            // jika inputan user = 3, panggil prosedur hitungSegitiga()
            hitungSegitiga();

        } else if (pilihMenu.equals("4")) {
            // jika inputan user = 4, panggil prosedur hitungLingkaran()
            hitungLingkaran();

        } else if (pilihMenu.equals("5")) {
            // jika inputan user = 5, panggil prosedur hitungKubus()
            hitungKubus();

        } else if (pilihMenu.equals("6")) {
            // jika inputan user = 6, panggil prosedur hitungBalok()
            hitungBalok();

        } else if (pilihMenu.equals("7")) {
            // jika inputan user = 7, panggil prosedur hitungBola()
            hitungBola();

        } else if (pilihMenu.equals("0")) {
            // jika inputan user = 0, keluar dari program
            System.exit(0);

        } else {
            // jika inputan user tidak sesuai, cetak pernyataan berikut
            System.out.println("Pilihan salah!");
            jeda();
        }
    }

    // prosedur jeda() sebagai jeda program,
    // serta untuk meminta user menekan enter untuk melanjutkan program
    static void jeda() {
        System.out.println();
        System.out.print("Tekan [Enter] untuk kembali");
        // meminta inputan user
        scanner.nextLine();
        System.out.println();
    }

    // prosedur hitungPersegi() untuk menghitung luas persegi
    static void hitungPersegi() {
        System.out.println("Hitung Persegi");
        System.out.print("Masukkan sisi: ");
        // meminta inputan user untuk atribut sisi
        persegi.sisi = scanner.nextDouble();

        // memanggil method lihatLuas() untuk menampilkan luas
        persegi.lihatLuas();

        scanner.nextLine();

        // memanggil prosedur jeda() untuk jeda
        jeda();
    }

    // prosedur hitungPersegiPanjang() untuk menghitung luas persegi persegi panjang
    static void hitungPersegiPanjang() {
        System.out.println("Hitung Persegi Panjang");
        System.out.print("Masukkan panjang: ");
        // meminta inputan user untuk atribut panjang
        persegiPanjang.panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar: ");
        // meminta inputan user untuk atribut lebar
        persegiPanjang.lebar = scanner.nextDouble();

        // memanggil method lihatLuas() untuk menampilkan luas
        persegiPanjang.lihatLuas();

        scanner.nextLine();

        // memanggil prosedur jeda() untuk jeda
        jeda();
    }

    // prosedur hitungSegitiga() untuk menghitung luas segitiga
    static void hitungSegitiga() {
        System.out.println("Hitung Segitiga");
        System.out.print("Masukkan alas: ");
        // meminta inputan user untuk atribut alas
        segitiga.alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        // meminta inputan user untuk atribut tinggi
        segitiga.tinggi = scanner.nextDouble();

        // memanggil method lihatLuas() untuk menampilkan luas
        segitiga.lihatLuas();

        scanner.nextLine();

        // memanggil prosedur jeda() untuk jeda
        jeda();
    }

    // prosedur hitungLingkaran() untuk menghitung luas lingkaran
    static void hitungLingkaran() {
        System.out.println("Hitung Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        // meminta inputan user untuk atribut r (jari-jari)
        lingkaran.r = scanner.nextDouble();

        // memanggil method lihatLuas() untuk menampilkan luas
        lingkaran.lihatLuas();

        scanner.nextLine();

        // memanggil prosedur jeda() untuk jeda
        jeda();
    }

    // prosedur hitungKubus() untuk menghitung luas permukaan dan volume kubus
    static void hitungKubus() {
        System.out.println("Hitung Kubus");
        System.out.print("Masukkan sisi: ");
        // meminta inputan user untuk atribut sisi
        persegi.sisi = scanner.nextDouble();

        // memanggil method lihatLuas() untuk menampilkan luas permukaan
        kubus.lihatLuas();

        // memanggil method lihatVolume() untuk menampilkan volume
        kubus.lihatVolume();

        scanner.nextLine();

        // memanggil prosedur jeda() untuk jeda
        jeda();
    }

    // prosedur hitungBalok() untuk menghitung luas permukaan dan volume balok
    static void hitungBalok() {
        System.out.println("Hitung Balok");
        System.out.print("Masukkan panjang: ");
        // meminta inputan user untuk atribut panjang
        persegiPanjang.panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar: ");
        // meminta inputan user untuk atribut lebar
        persegiPanjang.lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        // meminta inputan user untuk atribut tinggi
        balok.tinggi = scanner.nextDouble();

        // memanggil method lihatLuas() untuk menampilkan luas permukaan
        balok.lihatLuas();

        // memanggil method lihatVolume() untuk menampilkan volume
        balok.lihatVolume();

        scanner.nextLine();

        // memanggil prosedur jeda() untuk jeda
        jeda();
    }

    // prosedur hitungBola() untuk menghitung luas permukaan dan volume bola
    static void hitungBola() {
        System.out.println("Hitung Bola");
        System.out.print("Masukkan jari-jari: ");
        // meminta inputan user untuk atribut r (jari-jari)
        lingkaran.r = scanner.nextDouble();

        // memanggil method lihatLuas() untuk menampilkan luas permukaan
        bola.lihatLuas();

        // memanggil method lihatVolume() untuk menampilkan volume
        bola.lihatVolume();

        scanner.nextLine();

        // memanggil prosedur jeda() untuk jeda
        jeda();
    }

    // fungsi main
    public static void main(String[] args) {
        // perulangan agar program tidak langsung berhenti
        for (;;) {
            // memanggil prosedur lihatMenu() untuk menampilkan menu program
            lihatMenu();
        }
    }
}
