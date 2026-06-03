public class Pesanan {

    private Menu menu;
    private int jumlah;
    private double subtotal;

    public Pesanan(Menu menu, int jumlah) {

        if (jumlah <= 0) {

            throw new IllegalArgumentException(
                    "Jumlah pesanan harus lebih dari 0"
            );
        }

        this.menu = menu;
        this.jumlah = jumlah;
        this.subtotal =
                menu.getHarga() * jumlah;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }
    // Method tampil pesanan
    public void tampilPesanan() {

        System.out.println(
                menu.getNamaMenu()
                + " x"
                + jumlah
        );

        System.out.println(
                "Subtotal : Rp"
                + subtotal
        );
    }
}