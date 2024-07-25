package uklday2;

public class tesproduct {
    public static void main(String[] args) {
        System.out.println(" ========== Tugas 1 ========== ");

        //kontruktor tanpa parameter
        produk produkPertama = new produk();
        produkPertama.setNomor(1);
        produkPertama.setNama("Kopi");
        produkPertama.setJumlah(10);
        produkPertama.setHarga(5000);
        produkPertama.DeskripsiProduk();
        System.out.println("");

        produk produkKedua = new produk();
        produkKedua.setNomor(2);
        produkKedua.setNama("Teh");
        produkKedua.setJumlah(20);
        produkKedua.setHarga(8000);
        produkKedua.DeskripsiProduk();
        System.out.println("");

        //kontrukstor dengan parameter
        produk produkKetiga = new produk(3, "susu", 15, 9000);
        produkKetiga.DeskripsiProduk();
        System.out.println("");

        produk produkKeempat = new produk(4, "jeruk", 5, 30000);
        produkKeempat.DeskripsiProduk();
        System.out.println("");

        produk produkKelima = new produk(5, "sunlight", 30, 15000);
        produkKelima.DeskripsiProduk();
        System.out.println("");

        produk produkKeenam = new produk(6, "mie goreng", 25, 18000);
        produkKeenam.DeskripsiProduk();
        System.out.println("");


        System.out.println(" ========== Tugas 2 ========== ");
        //kontruktor tanpa parameter
        DVD dvd1 = new DVD();
        dvd1.setNomor(1);
        dvd1.setNama("Spiderman");
        dvd1.setRatingUsia(50);
        dvd1.setStudioFilm("Marvel");
        dvd1.setJumlah(50);
        dvd1.setHarga(25000.00);

        dvd1.DeskripsiProduk();
        System.out.println("");

        DVD dvd2 = new DVD();
        dvd2.setNomor(2);
        dvd2.setNama("Batman");
        dvd2.setRatingUsia(40);
        dvd2.setStudioFilm("DC");
        dvd2.setJumlah(40);
        dvd2.setHarga(20000.00);

        dvd2.DeskripsiProduk();
        System.out.println("");

        //kontruktor dengan parameter
        DVD dvd3 = new DVD(3, "Superman", 30, 22000.00, 120, 13, "DC");
        dvd3.deskripsiDvd();
        System.out.println("");

        DVD dvd4 = new DVD(4, "Flash", 25, 18000.00, 100, 12, "DC");
        dvd4.deskripsiDvd();
        System.out.println("");

        DVD dvd5 = new DVD(5, "Wonder Woman", 20, 25000.00, 110, 11, "DC");
        dvd5.deskripsiDvd();
        System.out.println("");

        DVD dvd6 = new DVD(6, "Iron Man", 25, 18000.00, 100, 12, "DC");
        dvd6.deskripsiDvd();
        System.out.println("");

    }
}
