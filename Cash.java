public class Cash extends Pembayaran {

    // Constructor
    public Cash(
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
                "Metode         : Cash"
        );

        System.out.println(
                "Uang Dibayar   : Rp" + uangBayar
        );

        System.out.println(
                "Kembalian      : Rp" + kembalian
        );
    }
}
