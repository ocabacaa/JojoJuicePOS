public class Kasir {

    private String namaKasir;
    private final String password;

    // Constructor
    public Kasir(String namaKasir, String password) {
        this.namaKasir = namaKasir;
        this.password = password;
    }

    // Getter
    public String getNamaKasir() {
        return namaKasir;
    }

    // Setter
    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    // Method validasi login
    public boolean login(String username, String password) {
        return this.namaKasir.equals(username)
                && this.password.equals(password);
    }

    // Method tampil kasir
    public void tampilKasir() {
        System.out.println("Nama Kasir : " + namaKasir);
    }
}