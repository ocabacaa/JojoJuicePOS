import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

                // ARRAY OBJECT KASIR
                Kasir[] daftarKasir = {
                        new Kasir("Clara", "12345"),
                        new Kasir("Requestha", "67890")
                };

                // ARRAY OBJECT MENU
                Menu[] daftarMenu = {
                        new Menu("Mango Juice", 18000),
                        new Menu("Avocado Smoothie", 25000),
                        new Menu("Chocolate Milk", 22000),
                        new Menu("Coffee Latte", 20000),
                        new Menu("Strawberry Juice", 19000)
                };

                // ARRAY OBJECT PESANAN
                Pesanan[] daftarPesanan = new Pesanan[10];
                int jumlahPesanan = 0;

                // ARRAY OBJECT TRANSAKSI
                Transaksi[] daftarTransaksi =
                        new Transaksi[100];

                int jumlahTransaksi = 0;
                
                // LOGIN
                System.out.println("=================================");
                System.out.println("      PEMBAYARAN JOJO JUICE");
                System.out.println("=================================");

                boolean loginBerhasil = false;
                String username = "";
                int percobaanLogin = 0; 

                while (!loginBerhasil && percobaanLogin < 3) {

                System.out.print("Nama Kasir : ");
                username = input.nextLine();

                System.out.print("Password   : ");
                String password = input.nextLine();

                if (username.trim().isEmpty()
                        || password.trim().isEmpty()) {

                        System.out.println(
                                "Username dan password tidak boleh kosong!"
                        );

                        continue;
                }

                for (int i = 0; i < daftarKasir.length; i++) {

                        if (daftarKasir[i].login(username, password)) {

                        loginBerhasil = true;
                        break;
                        }
                }

                if (!loginBerhasil) {

                        percobaanLogin++;

                        System.out.println(
                                "\nLogin gagal! Silakan coba lagi."
                        );

                        System.out.println(
                                "Sisa percobaan: "
                                + (3 - percobaanLogin)
                        );
                }
                
        }
                if (!loginBerhasil) {

                        System.out.println(
                                "\nLogin gagal 3 kali."
                        );

                        System.out.println(
                                "Program ditutup."
                        );

                        return;
                }

                System.out.println("\nLogin Berhasil!");

                int pilihan;

                do {

                        // MENU UTAMA
                        System.out.println("\n=================================");
                        System.out.println("           MENU UTAMA");
                        System.out.println("=================================");
                        System.out.println("1. Input Transaksi");
                        System.out.println("2. Riwayat Transaksi");
                        System.out.println("3. Logout");

                        do {

                        System.out.print("Pilih : ");

                        while (!input.hasNextInt()) {

                                System.out.println(
                                        "Input harus berupa angka!"
                                );

                                input.next();
                                System.out.print("Pilih : ");
                        }

                        pilihan = input.nextInt();
                        input.nextLine();

                        if (pilihan < 1 || pilihan > 3) {

                                System.out.println(
                                        "Pilihan hanya 1 - 3!"
                                );
                        }

                        } while (pilihan < 1 || pilihan > 3);

                        switch (pilihan) {

                                // INPUT TRANSAKSI
                                case 1:
                                        
                                try { 
                                      jumlahPesanan = 0;
                                
                                // INPUT PELANGGAN
                                System.out.println("\n=== INPUT PELANGGAN ===");

                                String namaPelanggan;
                                char konfirmasiNama;

                                        do {

                                                do {

                                                        System.out.print(
                                                                "Nama Pelanggan : "
                                                        );

                                                        namaPelanggan =
                                                                input.nextLine().trim();

                                                        if (namaPelanggan.isEmpty()) {

                                                        System.out.println(
                                                                "Nama tidak boleh kosong!"
                                                        );
                                                        }

                                                } while (namaPelanggan.isEmpty());

                                                do {

                                                        System.out.println(
                                                                "\nNama Pelanggan : "
                                                                + namaPelanggan
                                                        );

                                                        System.out.print(
                                                                "Apakah nama sudah benar? (y/n) : "
                                                        );

                                                        String konfirmasi =
                                                                input.nextLine()
                                                                        .trim()
                                                                        .toLowerCase();

                                                        if (konfirmasi.length() == 1 &&
                                                                (konfirmasi.equals("y")
                                                                        || konfirmasi.equals("n"))) {

                                                        konfirmasiNama =
                                                                konfirmasi.charAt(0);

                                                        } else {

                                                        konfirmasiNama = 'x';

                                                        System.out.println(
                                                                "Masukkan hanya y atau n!"
                                                        );
                                                        }

                                                } while (konfirmasiNama != 'y'
                                                        && konfirmasiNama != 'n');

                                        } while (konfirmasiNama == 'n');

                                        Pelanggan pelanggan1 =
                                                new Pelanggan(
                                                        namaPelanggan
                                                );

                                // TAMPIL MENU
                                System.out.println("\n=== DAFTAR MENU ===");

                                for (int i = 0; i < daftarMenu.length; i++) {

                                daftarMenu[i].tampilMenu(i + 1);
                                }

                                // MULTI MENU
                                char tambahMenu = 'y';

                                boolean transaksiDibatalkan = false;

                                do {
                                        int pilihMenu;
                                        do {

                                                System.out.print("\nPilih Menu (1-5, 0 untuk batal) : ");
                                                while (!input.hasNextInt()) {

                                                        System.out.println(
                                                                "Input harus angka!"
                                                        );

                                                        input.next();
                                                }

                                                pilihMenu = input.nextInt();

                                                if (pilihMenu == 0) {

                                                        System.out.println(
                                                                "\nTransaksi dibatalkan."
                                                        );

                                                        transaksiDibatalkan = true;
                                                        break;
                                                }

                                                if (pilihMenu < 1 || pilihMenu > 5) {

                                                System.out.println(
                                                       "Menu tidak tersedia!"
                                                );
                                        }

                                } while (pilihMenu < 1
                                        || pilihMenu > 5);
                        
                                if (transaksiDibatalkan) {
                                        break;
                                }

                                // INPUT JUMLAH
                                int jumlah;

                                do {

                                        System.out.print(
                                                "Jumlah Pesanan : "
                                        );

                                        while (!input.hasNextInt()) {

                                                System.out.println(
                                                        "Input harus angka!"
                                                );

                                                input.next();
                                        }

                                        jumlah = input.nextInt();

                                        if (jumlah <= 0) {

                                                System.out.println(
                                                        "Jumlah harus lebih dari 0!"
                                                );
                                        }

                                } while (jumlah <= 0);

                                input.nextLine();

                                // AMBIL MENU
                                Menu menuDipilih =
                                        daftarMenu[pilihMenu - 1];

                                char konfirmasiPesanan;

                                do {

                                        System.out.println(
                                                "\n=== KONFIRMASI PESANAN ==="
                                        );

                                        System.out.println(
                                                "Menu     : "
                                                + menuDipilih.getNamaMenu()
                                        );

                                        System.out.println(
                                                "Jumlah   : "
                                                + jumlah
                                        );

                                        System.out.println(
                                                "Subtotal : Rp"
                                                + (menuDipilih.getHarga() * jumlah)
                                        );

                                        System.out.print(
                                                "\nApakah pesanan sudah benar? (y/n) : "
                                        );

                                        String konfirmasi =
                                                input.nextLine()
                                                        .trim()
                                                        .toLowerCase();

                                        if (konfirmasi.length() == 1 &&
                                                (konfirmasi.equals("y")
                                                        || konfirmasi.equals("n"))) {

                                                konfirmasiPesanan =
                                                        konfirmasi.charAt(0);

                                        } else {

                                                konfirmasiPesanan = 'x';

                                                System.out.println(
                                                        "Masukkan hanya y atau n!"
                                                );
                                        }

                                } while (konfirmasiPesanan != 'y'
                                        && konfirmasiPesanan != 'n');

                                if (konfirmasiPesanan == 'n') {

                                        System.out.println(
                                                "\nSilakan input pesanan kembali."
                                        );

                                        continue;
                                }

                                if (jumlahPesanan >= daftarPesanan.length) {

                                        System.out.println(
                                                "Jumlah pesanan maksimal 10 item!"
                                        );

                                        break;
                                }

                                daftarPesanan[jumlahPesanan] =
                                        new Pesanan(
                                                menuDipilih,
                                                jumlah
                                        );
                                jumlahPesanan++;

                                String inputMenu;

                                do {

                                        System.out.print(
                                                "\nTambah menu lagi? (y/n) : "
                                        );

                                        inputMenu = input.next().trim().toLowerCase();

                                        if (inputMenu.length() != 1 ||
                                                (!inputMenu.equals("y")
                                                        && !inputMenu.equals("n"))) {

                                                System.out.println(
                                                        "Masukkan hanya y atau n!"
                                                );

                                                continue;
                                        }

                                        tambahMenu = inputMenu.charAt(0);
                                        input.nextLine();

                                } while (inputMenu.length() != 1 ||
                                        (!inputMenu.equals("y")
                                                && !inputMenu.equals("n")));

                                } while (tambahMenu == 'y');

                                if (jumlahPesanan == 0) {

                                        System.out.println(
                                                "Tidak ada pesanan yang diproses."
                                        );

                                        break;
                                }
                                // HITUNG TOTAL
                                double total = 0;

                                for (int i = 0; i < jumlahPesanan; i++) {

                                total += daftarPesanan[i].getSubtotal();
                                }
                                
                                boolean lanjutPembayaran = false;
                                

                                while (!lanjutPembayaran) {
                                        total = 0;

                                        for (int i = 0; i < jumlahPesanan; i++) {

                                        total += daftarPesanan[i].getSubtotal();
                                        }

                                        System.out.println(
                                                "\n=== DETAIL PESANAN ==="
                                        );

                                        for (int i = 0; i < jumlahPesanan; i++) {

                                        System.out.println(
                                                (i + 1)
                                                + ". "
                                                + daftarPesanan[i]
                                                        .getMenu()
                                                        .getNamaMenu()
                                                + " x"
                                                + daftarPesanan[i]
                                                        .getJumlah()
                                                + " = Rp"
                                                + daftarPesanan[i]
                                                        .getSubtotal()
                                        );
                                        }

                                        System.out.println(
                                                "\nTOTAL BELANJA : Rp"
                                                + total
                                        );
                                        System.out.println(
                                                "\n=== REVIEW PESANAN ==="
                                        );

                                        System.out.println(
                                                "1. Tambah Pesanan"
                                        );

                                        System.out.println(
                                                "2. Hapus Pesanan"
                                        );

                                        System.out.println(
                                                "3. Edit Jumlah Pesanan"
                                        );

                                        System.out.println(
                                                "4. Lanjut ke Pembayaran"
                                        );

                                        System.out.println(
                                                "5. Batalkan Transaksi"
                                        );

                                        System.out.print(
                                                "Pilih : "
                                        );

                                        int pilihanReview;

                                        while (!input.hasNextInt()) {

                                                System.out.println(
                                                        "Input harus angka!"
                                                );

                                                input.next();
                                        }

                                        pilihanReview = input.nextInt();
                                        input.nextLine();

                                        switch (pilihanReview) {

                                        case 1:

                                        if (jumlahPesanan >= daftarPesanan.length) {

                                                System.out.println(
                                                        "\nJumlah pesanan maksimal 10 item!"
                                                );

                                                break;
                                        }

                                        System.out.println(
                                                "\n=== TAMBAH PESANAN ==="
                                        );

                                        for (int i = 0; i < daftarMenu.length; i++) {

                                                daftarMenu[i].tampilMenu(i + 1);
                                        }

                                        int menuBaru;

                                        do {

                                                System.out.print(
                                                        "Pilih Menu (1-5) : "
                                                );

                                                while (!input.hasNextInt()) {

                                                System.out.println(
                                                        "Input harus angka!"
                                                );

                                                input.next();
                                                }

                                                menuBaru = input.nextInt();

                                                if (menuBaru < 1 || menuBaru > 5) {

                                                System.out.println(
                                                        "Menu tidak tersedia!"
                                                );
                                                }

                                        } while (menuBaru < 1 || menuBaru > 5);

                                        int jumlahBaru;

                                        do {

                                                System.out.print(
                                                        "Jumlah Pesanan : "
                                                );

                                                while (!input.hasNextInt()) {

                                                System.out.println(
                                                        "Input harus angka!"
                                                );

                                                input.next();
                                                }

                                                jumlahBaru = input.nextInt();

                                                if (jumlahBaru <= 0) {

                                                System.out.println(
                                                        "Jumlah harus lebih dari 0!"
                                                );
                                                }

                                        } while (jumlahBaru <= 0);

                                        input.nextLine();

                                        daftarPesanan[jumlahPesanan] =
                                                new Pesanan(
                                                        daftarMenu[menuBaru - 1],
                                                        jumlahBaru
                                                );

                                        jumlahPesanan++;

                                        System.out.println(
                                                "Pesanan berhasil ditambahkan."
                                        );

                                        break;

                                                case 2:

                                                        if (jumlahPesanan == 0) {

                                                                System.out.println(
                                                                        "\nTidak ada pesanan untuk dihapus."
                                                                );

                                                                break;
                                                        }

                                                        System.out.println(
                                                                "\n=== HAPUS PESANAN ==="
                                                        );

                                                        for (int i = 0; i < jumlahPesanan; i++) {

                                                                System.out.println(
                                                                        (i + 1)
                                                                        + ". "
                                                                        + daftarPesanan[i]
                                                                                .getMenu()
                                                                                .getNamaMenu()
                                                                        + " x"
                                                                        + daftarPesanan[i]
                                                                                .getJumlah()
                                                                );
                                                        }

                                                        System.out.print(
                                                                "Pilih nomor pesanan yang akan dihapus : "
                                                        );

                                                        int hapus = input.nextInt();
                                                        input.nextLine();

                                                        if (hapus >= 1
                                                                && hapus <= jumlahPesanan) {

                                                                for (int i = hapus - 1;
                                                                        i < jumlahPesanan - 1;
                                                                        i++) {

                                                                        daftarPesanan[i] =
                                                                                daftarPesanan[i + 1];
                                                                }

                                                                daftarPesanan[jumlahPesanan - 1] = null;

                                                                jumlahPesanan--;

                                                                System.out.println(
                                                                        "Pesanan berhasil dihapus."
                                                                );

                                                        } else {

                                                                System.out.println(
                                                                        "Nomor pesanan tidak valid!"
                                                                );
                                                        }

                                                        break;

                                                case 3:

                                                        if (jumlahPesanan == 0) {

                                                                System.out.println(
                                                                        "\nTidak ada pesanan untuk diedit."
                                                                );

                                                                break;
                                                        }

                                                        System.out.println(
                                                                "\n=== EDIT JUMLAH PESANAN ==="
                                                        );

                                                        for (int i = 0; i < jumlahPesanan; i++) {

                                                                System.out.println(
                                                                        (i + 1)
                                                                        + ". "
                                                                        + daftarPesanan[i]
                                                                                .getMenu()
                                                                                .getNamaMenu()
                                                                        + " x"
                                                                        + daftarPesanan[i]
                                                                                .getJumlah()
                                                                );
                                                        }

                                                        System.out.print(
                                                                "Pilih nomor pesanan : "
                                                        );

                                                        int edit = input.nextInt();

                                                        System.out.print(
                                                                "Jumlah baru : "
                                                        );

                                                        int jumlahEdit = input.nextInt();
                                                        input.nextLine();

                                                        if (edit >= 1
                                                                && edit <= jumlahPesanan
                                                                && jumlahEdit > 0) {

                                                                Menu menuLama =
                                                                        daftarPesanan[edit - 1]
                                                                                .getMenu();

                                                                daftarPesanan[edit - 1] =
                                                                        new Pesanan(
                                                                                menuLama,
                                                                                jumlahEdit
                                                                        );

                                                                System.out.println(
                                                                        "Pesanan berhasil diperbarui."
                                                                );
                                                        }

                                                        else {

                                                                System.out.println(
                                                                        "Input tidak valid!"
                                                                );
                                                        }

                                                        break;

                                                case 4:
                                                        // METODE PEMBAYARAN
                                                        boolean ulangPembayaran = true;

                                                        while (ulangPembayaran) {

                                                        int pilihPembayaran;

                                                        String metodePembayaran = "";

                                                        do {

                                                        System.out.println(
                                                                "\n=== METODE PEMBAYARAN ==="
                                                        );

                                                        System.out.println("1. Bank");
                                                        System.out.println("2. E-Wallet");
                                                        System.out.println("3. Cash");
                                                        System.out.println("0. Kembali");

                                                        System.out.print(
                                                                "Pilih Metode : "
                                                        );

                                                        while (!input.hasNextInt()) {

                                                        System.out.println(
                                                                "Input harus angka!"
                                                        );

                                                        input.next();
                                                        }

                                                        pilihPembayaran =
                                                                input.nextInt();

                                                        switch (pilihPembayaran) {

                                                                case 0:
                                                        
                                                                        break;
                                                                case 1:
                                                                        metodePembayaran = "Bank";
                                                                        break;

                                                                case 2:
                                                                        metodePembayaran = "E-Wallet";
                                                                        break;

                                                                case 3:
                                                                        metodePembayaran = "Cash";
                                                                        break;

                                                                default:
                                                                        System.out.println(
                                                                                "Metode tidak tersedia!"
                                                                        );
                                                        }

                                                        } while (pilihPembayaran < 0
                                                                || pilihPembayaran > 3);  
                                                                
                                                     
                                                        if (pilihPembayaran == 0) {
                                                             break;
                                                        }

                                                        // INPUT UANG
                                                        double uangBayar;
                                                
                                                        do {

                                                                System.out.print(
                                                                        "Uang Dibayar : Rp"
                                                                );

                                                                while (!input.hasNextDouble()) {

                                                                        System.out.println(
                                                                                "Masukkan nominal yang valid!"
                                                                        );

                                                                        input.next();
                                                                }

                                                                uangBayar = input.nextDouble();

                                                                if (uangBayar < total) {

                                                                        System.out.println(
                                                                                "Uang tidak cukup!"
                                                                        );
                                                                }

                                                        } while (uangBayar < total);
                                                        input.nextLine();
                        
                                                        boolean konfirmasiPembayaran = false;

                                                        do {

                                                                System.out.println(
                                                                        "\n=== KONFIRMASI PEMBAYARAN ==="
                                                                );

                                                                System.out.println(
                                                                        "Metode  : " + metodePembayaran
                                                                );

                                                                System.out.println(
                                                                        "Total   : Rp" + total
                                                                );

                                                                System.out.println(
                                                                        "Bayar   : Rp" + uangBayar
                                                                );

                                                                System.out.println(
                                                                        "Kembali : Rp"
                                                                        + (uangBayar - total)
                                                                );

                                                                System.out.print(
                                                                        "\nLanjutkan pembayaran? (y/n) : "
                                                                );

                                                                String konfirmasi =
                                                                        input.nextLine()
                                                                                .trim()
                                                                                .toLowerCase();

                                                                if (konfirmasi.equals("y")) {

                                                                        konfirmasiPembayaran = true;

                                                                } else if (konfirmasi.equals("n")) {

                                                                        break;

                                                                } else {

                                                                        System.out.println(
                                                                                "Masukkan hanya y atau n!"
                                                                        );
                                                                }

                                                        } while (!konfirmasiPembayaran);

                                                        if (!konfirmasiPembayaran) {
                                                                System.out.println(
                                                                        "\nSilakan pilih metode pembayaran kembali."
                                                                );

                                                                continue;
                                                        }

                                                        ulangPembayaran = false;

                                                        Pembayaran pembayaran1;

                                                        if (pilihPembayaran == 1) {

                                                        pembayaran1 =
                                                                new Bank(
                                                                        metodePembayaran,
                                                                        uangBayar,
                                                                        total
                                                                );

                                                        } else if (pilihPembayaran == 2) {

                                                        pembayaran1 =
                                                                new EWallet(
                                                                        metodePembayaran,
                                                                        uangBayar,
                                                                        total
                                                                );

                                                        } else {

                                                        pembayaran1 =
                                                                new Cash(
                                                                        metodePembayaran,
                                                                        uangBayar,
                                                                        total
                                                                );
                                                        }
                                        
                                                        // COPY PESANAN
                                                        Pesanan[] copyPesanan =
                                                                new Pesanan[jumlahPesanan];

                                                        for (int i = 0; i < jumlahPesanan; i++) {

                                                        copyPesanan[i] =
                                                                daftarPesanan[i];
                                                        }

                                                        // OBJECT TRANSAKSI
                                                        Transaksi transaksi1 =
                                                                new Transaksi(
                                                                        pelanggan1,
                                                                        copyPesanan,
                                                                        jumlahPesanan,
                                                                        pembayaran1,
                                                                        total
                                                                );

                                                        // OUTPUT STRUK
                                                        transaksi1.tampilTransaksi(username);                           

                                                        if (jumlahTransaksi >= daftarTransaksi.length) {

                                                                System.out.println(
                                                                        "Penyimpanan transaksi penuh!"
                                                                );

                                                                break;
                                                        }
                                                        // SIMPAN KE RIWAYAT
                                                        daftarTransaksi[jumlahTransaksi] = transaksi1;

                                                        jumlahTransaksi++;
                                                        lanjutPembayaran = true;
                                                                break;
                                                }


                                                        break;

                                                case 5:

                                                        jumlahPesanan = 0;

                                                        System.out.println(
                                                                "\nTransaksi dibatalkan."
                                                        );

                                                        break;

                                                default:

                                                        System.out.println(
                                                                "\nPilihan tidak tersedia!"
                                                        );
                                        }
                                        if (pilihanReview == 5) {
                                                break;
                                        }
                                }

                                if (jumlahPesanan == 0) {
                                        break;
                                }
            
                        } catch (IllegalArgumentException e) {

                                System.out.println(
                                        "\nTerjadi kesalahan:"
                                );

                                System.out.println(
                                        e.getMessage()
                                );

                                } catch (Exception e) {

                                System.out.println(
                                        "\nError tidak terduga:"
                                );

                                System.out.println(
                                        e.getMessage()
                                );
                                }

                                break;

                                // RIWAYAT TRANSAKSI
                                case 2:

                                System.out.println(
                                        "\n=== RIWAYAT TRANSAKSI ==="
                                );

                                if (jumlahTransaksi == 0) {

                                        System.out.println(
                                                "Belum ada transaksi!"
                                        );

                                } else {

                                        for (int i = 0;
                                        i < jumlahTransaksi;
                                        i++) {

                                        System.out.println(
                                                "\nTransaksi Ke-"
                                                + (i + 1)
                                        );

                                        daftarTransaksi[i]
                                                .tampilRiwayat();
                                        }
                                }

                                break;

                        // LOGOUT
                        case 3:

                                char konfirmasiLogout;

                                do {

                                        System.out.print(
                                                "\nYakin ingin logout? (y/n) : "
                                        );

                                        String logout =
                                                input.nextLine()
                                                        .trim()
                                                        .toLowerCase();

                                        if (logout.length() == 1
                                                && (logout.equals("y")
                                                || logout.equals("n"))) {

                                        konfirmasiLogout =
                                                logout.charAt(0);

                                        } else {

                                        konfirmasiLogout = 'x';

                                        System.out.println(
                                                "Masukkan hanya y atau n!"
                                        );
                                        }

                                } while (konfirmasiLogout != 'y'
                                        && konfirmasiLogout != 'n');

                                if (konfirmasiLogout == 'y') {

                                        System.out.println(
                                                "\nLogout Berhasil"
                                        );

                                } else {

                                        pilihan = 0;
                                }

                                break;

                        // DEFAULT
                        default:

                                System.out.println(
                                        "\nPilihan Tidak Tersedia"
                                );
                        }

                } while (pilihan != 3);
        }
    }
}
