# 🧃 Jojo Juice POS

## Review Singkat Project

Jojo Juice POS merupakan aplikasi Point of Sale (POS) berbasis Java yang dikembangkan untuk membantu proses transaksi penjualan minuman pada Jojo Juice. Program ini menyediakan fitur login kasir, pengelolaan pesanan, review pesanan, pembayaran, pencetakan struk, serta penyimpanan riwayat transaksi.

Project ini dibuat sebagai implementasi konsep Object-Oriented Programming (OOP) dengan menerapkan Encapsulation, Inheritance, Polymorphism, dan Abstraction.

---

## Nama Anggota

| Nama               | NIM     |
| ------------------ | ------- |
| Clara Oxana Azalia | D1041231051 |
| Requestha Amorine Montass     | D1041231091 |

---

## Fitur Utama

* Login Kasir
* Input Data Pelanggan
* Pemesanan Multi Menu
* Review Pesanan
* Tambah Pesanan
* Edit Jumlah Pesanan
* Hapus Pesanan
* Pembatalan Transaksi
* Pembayaran Bank
* Pembayaran E-Wallet
* Pembayaran Cash
* Cetak Struk
* Riwayat Transaksi
* Logout

---

## Revisi dan Pengembangan Program

Selama proses pengembangan, program telah mengalami beberapa revisi dan penyempurnaan untuk meningkatkan fungsionalitas, stabilitas, dan pengalaman pengguna. Revisi yang dilakukan antara lain:

* Perbaikan sistem login dengan validasi input dan batas percobaan login.
* Penambahan validasi pada seluruh input pengguna untuk mencegah kesalahan input.
* Penambahan fitur konfirmasi data pelanggan dan pesanan.
* Penambahan fitur pemesanan lebih dari satu menu dalam satu transaksi.
* Penambahan menu review pesanan sebelum proses pembayaran.
* Penambahan fitur tambah, edit, dan hapus pesanan pada tahap review.
* Perbaikan alur pembayaran dan validasi nominal pembayaran.
* Penambahan fitur kembali ke menu review pesanan sebelum transaksi diselesaikan.
* Perbaikan bug dan error yang ditemukan selama proses pengembangan dan pengujian program.
* Penyempurnaan tampilan output transaksi dan struk pembayaran.
* Penambahan penyimpanan serta penampilan riwayat transaksi.
* Penyempurnaan struktur program berdasarkan prinsip Object-Oriented Programming (OOP).

---

## Konsep OOP yang Digunakan

### Encapsulation

Penggunaan atribut dan method pada class untuk membungkus data.

### Inheritance

Class Bank, EWallet, dan Cash mewarisi class Pembayaran.

### Polymorphism

Objek Pembayaran dapat mereferensikan objek Bank, EWallet, maupun Cash.

### Abstraction

Class Pembayaran digunakan sebagai abstraksi proses pembayaran.

---

## Struktur Class

* Kasir
* Pelanggan
* Menu
* Pesanan
* Pembayaran
* Bank
* EWallet
* Cash
* Transaksi

---

## Instruksi Penggunaan

### 1. Compile Program

```bash
javac *.java
```

### 2. Jalankan Program

```bash
java Main
```

### 3. Login

Gunakan salah satu akun berikut:

| Username  | Password |
| --------- | -------- |
| Clara     | 12345    |
| Requestha | 67890    |

### 4. Melakukan Transaksi

1. Pilih menu **Input Transaksi**
2. Masukkan nama pelanggan
3. Pilih menu minuman
4. Tentukan jumlah pesanan
5. Lakukan review pesanan
6. Pilih metode pembayaran
7. Lakukan pembayaran
8. Struk transaksi akan ditampilkan

### 5. Melihat Riwayat Transaksi

Pilih menu:

```text
2. Riwayat Transaksi
```

untuk melihat seluruh transaksi yang telah tersimpan.

---

## Repository GitHub

Link repository:

https://github.com/ocabacaa/JojoJuicePOS

---

## Catatan

Project ini dibuat untuk memenuhi UAS mata kuliah Pemrograman Berorientasi Objek (PBO) menggunakan bahasa pemrograman Java.
