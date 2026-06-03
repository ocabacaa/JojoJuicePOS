public class Pelanggan {

    private String namaPelanggan;
 
    public Pelanggan(String namaPelanggan) {

        if (namaPelanggan == null ||
                namaPelanggan.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Nama pelanggan tidak boleh kosong!"
            );
        }

        this.namaPelanggan = namaPelanggan;
    }
 
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    @Override
    public String toString() {

        return namaPelanggan;
    } 
    // Method tampil pelanggan
    public void tampilPelanggan() {

        System.out.println(
                "Nama Pelanggan : "
                + namaPelanggan
        );
    }
}