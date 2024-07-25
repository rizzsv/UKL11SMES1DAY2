package uklday2;
public class produk {
    private int nomor;
    private String nama;
    private int jumlah;
    private double harga;

    public produk() {
    }

    public produk(int nomor, String nama, int jumlah, double harga) {
        this.nomor = nomor;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {this.nomor = nomor;}

    public String getNama() {return this.nama;}

    public void setNama(String nama) {this.nama = nama;}

    public int getJumlah() {return this.jumlah;}

    public void setJumlah(int jumlah) {this.jumlah = jumlah;}

    public double getHarga() {return this.harga;}

    public void setHarga(double harga) {this.harga = harga;}

    public void DeskripsiProduk() {
        System.out.println("Nama Produk: " + getNama());
        System.out.println("Nomor Produk: " + getNomor());
        System.out.println("Jumlah Produk: " + getJumlah());
        System.out.println("Harga Produk: " + getHarga());
    }
}
