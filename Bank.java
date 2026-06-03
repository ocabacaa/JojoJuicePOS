public class Bank extends Pembayaran {

    // Constructor
    public Bank(
            String metodePembayaran,
            double uangBayar,
            double total
    ) {

        super(
                metodePembayaran,
                uangBayar,
                total
        );
    }

    // Override method
    @Override
    public void tampilPembayaran() {

        System.out.println(
                "Metode         : Transfer Bank"
        );

        System.out.println(
                "Uang Dibayar   : Rp" + uangBayar
        );

        System.out.println(
                "Kembalian      : Rp" + kembalian
        );
    }
}

