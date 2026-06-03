public class Menu {

    private String namaMenu;
    private double harga;

    public Menu(String namaMenu, double harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    @Override
    public String toString() {

        return namaMenu +
                " - Rp" +
                harga;
    }
    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        }
    }

    public void tampilMenu(int nomor) {
        System.out.println(
                nomor + ". "
                        + namaMenu
                        + " - Rp"
                        + harga
        );
    }
}