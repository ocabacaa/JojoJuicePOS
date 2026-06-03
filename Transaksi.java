public class Transaksi {

    private static int jumlahTransaksi = 1;

    private String idTransaksi;

    private Pelanggan pelanggan;
    private Pesanan[] daftarPesanan;
    private int jumlahPesanan;
    private Pembayaran pembayaran;
    private double total;

    // Constructor
    public Transaksi(
            Pelanggan pelanggan,
            Pesanan[] daftarPesanan,
            int jumlahPesanan,
            Pembayaran pembayaran,
            double total
    ) {

        this.pelanggan = pelanggan;
        this.daftarPesanan = daftarPesanan;
        this.jumlahPesanan = jumlahPesanan;
        this.pembayaran = pembayaran;
        this.total = total;
        this.idTransaksi =
                String.format(
                        "TRX%03d",
                        jumlahTransaksi
                );

        jumlahTransaksi++;
    }

    // Method tampil riwayat
    public void tampilRiwayat() {

        System.out.println(
                "ID Transaksi : "
                + idTransaksi
        );

        System.out.println(
                "Pelanggan    : "
                + pelanggan.getNamaPelanggan()
        );

        System.out.println(
                "\nMenu Dibeli :"
        );

        // tampil menu
        for (int i = 0; i < jumlahPesanan; i++) {

            System.out.println(
                    "- "
                    + daftarPesanan[i].getMenu().getNamaMenu()
                    + " x"
                    + daftarPesanan[i].getJumlah()
                    + " = Rp"
                    + daftarPesanan[i].getSubtotal()
            );
        }

        System.out.println(
                "\nTotal        : Rp"
                + total
        );

        System.out.println(
                "================================="
        );
    }
    // Method tampil transaksi
    public void tampilTransaksi(String namaKasir) {

        System.out.println(
                "\n================================="
        );

        System.out.println(
                "         STRUK JOJO JUICE"
        );

        System.out.println(
                "================================="
        );

        System.out.println(
                "ID Transaksi   : "
                + idTransaksi
        );
        System.out.println(
                "Kasir          : "
                + namaKasir
        );

        pelanggan.tampilPelanggan();

        System.out.println(
                "---------------------------------"
        );

        // tampil semua pesanan
        for (int i = 0; i < jumlahPesanan; i++) {

            System.out.println(
                    daftarPesanan[i].getMenu().getNamaMenu()
                    + " x"
                    + daftarPesanan[i].getJumlah()
            );

            System.out.println(
                    "Subtotal : Rp"
                    + daftarPesanan[i].getSubtotal()
            );

            System.out.println(
                    "---------------------------------"
            );
        }

        System.out.println(
                "TOTAL          : Rp"
                + total
        );

        System.out.println(
                "Status         : Berhasil"
        );

        pembayaran.tampilPembayaran();

        System.out.println(
                "================================="
        );

        System.out.println(
                " Terima Kasih Telah Berbelanja "
        );

        System.out.println(
                "          di Jojo Juice"
        );

        System.out.println(
                "================================="
        );
    }
}