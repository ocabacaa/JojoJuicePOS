public class EWallet extends Pembayaran {

    // Constructor
    public EWallet(
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
                "Metode         : E-Wallet"
        );

        System.out.println(
                "Uang Dibayar   : Rp"
                + uangBayar
        );

        System.out.println(
                "Kembalian      : Rp"
                + kembalian
        );
    }
}