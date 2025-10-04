# PBO-Inheritance - Program Penghitung Luas dan Volume Bangun

## 📖 Deskripsi

Program ini adalah implementasi konsep **Inheritance (Pewarisan)** dalam Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java. Program dapat menghitung luas bangun datar dan luas permukaan serta volume bangun ruang dengan menggunakan hierarki class yang terstruktur.

## 👨‍💻 Developer

-   **Nama**: I Kadek Rai Pramana
-   **NIM**: 2105551094
-   **Mata Kuliah**: Pemrograman Berorientasi Objek (D)
-   **Dosen Pengampu**: Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT
-   **Tanggal**: 19 April 2022
-   **Versi**: 1.0

## 🏗️ Struktur Project

```
PBO-Inheritance/
├── README.md
└── Tugas 2 Inheritance/
    ├── Tugas 2.iml
    └── src/
        └── com/
            └── raipramana/
                ├── BangunDatar.java       # Class induk untuk semua bangun
                ├── BangunRuang.java       # Class turunan dari BangunDatar
                ├── Persegi.java           # Class bangun datar persegi
                ├── PersegiPanjang.java    # Class bangun datar persegi panjang
                ├── Segitiga.java          # Class bangun datar segitiga
                ├── Lingkaran.java         # Class bangun datar lingkaran
                ├── Kubus.java             # Class bangun ruang kubus
                ├── Balok.java             # Class bangun ruang balok
                ├── Bola.java              # Class bangun ruang bola
                └── Main.java              # Class utama dengan menu program
```

## 🔗 Hierarki Inheritance

### Class Diagram

```
BangunDatar (Parent Class)
├── Persegi
├── PersegiPanjang
├── Segitiga
├── Lingkaran
└── BangunRuang (Child Class)
    ├── Kubus (extends BangunRuang, uses Persegi)
    ├── Balok (extends BangunRuang, uses PersegiPanjang)
    └── Bola (extends BangunRuang, uses Lingkaran)
```

### Penjelasan Hierarki:

1. **BangunDatar**: Class induk yang memiliki method `luas()` dan `lihatLuas()`
2. **BangunRuang**: Class turunan dari BangunDatar, menambahkan method `volume()` dan `lihatVolume()`
3. **Bangun Datar**: Persegi, PersegiPanjang, Segitiga, Lingkaran - semua inherit dari BangunDatar
4. **Bangun Ruang**: Kubus, Balok, Bola - semua inherit dari BangunRuang

## 🎯 Fitur Program

### Menu Utama:

1. **Persegi** - Menghitung luas persegi
2. **Persegi Panjang** - Menghitung luas persegi panjang
3. **Segitiga** - Menghitung luas segitiga
4. **Lingkaran** - Menghitung luas lingkaran
5. **Kubus** - Menghitung luas permukaan dan volume kubus
6. **Balok** - Menghitung luas permukaan dan volume balok
7. **Bola** - Menghitung luas permukaan dan volume bola
8. **Keluar** - Mengakhiri program

### Rumus yang Digunakan:

#### Bangun Datar:

-   **Persegi**: Luas = sisi × sisi
-   **Persegi Panjang**: Luas = panjang × lebar
-   **Segitiga**: Luas = ½ × alas × tinggi
-   **Lingkaran**: Luas = π × r²

#### Bangun Ruang:

-   **Kubus**:
    -   Luas Permukaan = 6 × (sisi × sisi)
    -   Volume = sisi³
-   **Balok**:
    -   Luas Permukaan = 2 × (p×l + p×t + l×t)
    -   Volume = panjang × lebar × tinggi
-   **Bola**:
    -   Luas Permukaan = 4 × π × r²
    -   Volume = 4/3 × π × r³

## 🚀 Cara Menjalankan Program

### Prerequisites:

-   Java Development Kit (JDK) 8 atau lebih tinggi
-   IDE Java (IntelliJ IDEA, Eclipse, NetBeans, atau VS Code)

### Langkah-langkah:

1. Clone repository ini:

    ```bash
    git clone https://github.com/rai-pramana/PBO-Inheritance.git
    ```

2. Buka project di IDE Java yang Anda gunakan

3. Navigate ke folder `Tugas 2 Inheritance/src/com/raipramana/`

4. Compile dan jalankan file `Main.java`:

    ```bash
    javac Main.java
    java Main
    ```

5. Pilih menu sesuai bangun yang ingin dihitung

6. Masukkan nilai-nilai yang diminta

7. Program akan menampilkan hasil perhitungan

## 💡 Konsep OOP yang Diimplementasikan

### 1. **Inheritance (Pewarisan)**

-   BangunRuang mewarisi dari BangunDatar
-   Semua bangun datar mewarisi dari BangunDatar
-   Semua bangun ruang mewarisi dari BangunRuang

### 2. **Method Overriding**

-   Setiap class turunan meng-override method `luas()` dan `lihatLuas()`
-   Class bangun ruang juga meng-override method `volume()` dan `lihatVolume()`

### 3. **Encapsulation**

-   Setiap class memiliki atribut dan method yang terorganisir
-   Penggunaan package untuk mengorganisir class

### 4. **Polymorphism**

-   Method yang sama (`luas()`, `lihatLuas()`) memiliki implementasi berbeda di setiap class

## 📋 Contoh Output Program

```
-----------------------------------------
PROGRAM PENGHITUNG LUAS DAN VOLUME BANGUN
-----------------------------------------
[1] Persegi
[2] Persegi Panjang
[3] Segitiga
[4] Lingkaran
[5] Kubus
[6] Balok
[7] Bola
[0] Keluar
-----------------------------------------
Pilih menu: 1
-----------------------------------------

Hitung Persegi
Masukkan sisi: 5
Luas persegi : 25.0

Tekan [Enter] untuk kembali
```

## 🤝 Kontribusi

Project ini dibuat untuk tujuan pembelajaran konsep Inheritance dalam PBO. Jika Anda ingin berkontribusi:

1. Fork repository ini
2. Buat branch feature baru (`git checkout -b feature/AmazingFeature`)
3. Commit perubahan Anda (`git commit -m 'Add some AmazingFeature'`)
4. Push ke branch (`git push origin feature/AmazingFeature`)
5. Buat Pull Request

## 📝 Lisensi

Project ini dibuat untuk keperluan akademik dan pembelajaran.

Project Link: [https://github.com/rai-pramana/PBO-Inheritance](https://github.com/rai-pramana/PBO-Inheritance)
