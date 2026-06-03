public abstract class Pembayaran {

    protected String metodePembayaran;
    protected double uangBayar;
    protected double kembalian;

    public Pembayaran(
            String metodePembayaran,
            double uangBayar,
            double total
    ) {

        if (uangBayar < total) {

            throw new IllegalArgumentException(
                    "Uang tidak mencukupi!"
            );
        }

        this.metodePembayaran = metodePembayaran;
        this.uangBayar = uangBayar;
        this.kembalian = uangBayar - total;
    }

    public abstract void tampilPembayaran();
}