package uklday2;

public class DVD extends produk {
    private int durasiFilm;
    private int ratingUsia;
    private String studioFilm;

    public DVD() {
        super();
    }

        DVD(int nomor, String nama, int jumlah, double harga, int durasiFilm, int ratingUsia, String studioFilm) {
        super(nomor, nama, jumlah, harga);
        this.durasiFilm = durasiFilm;
        this.ratingUsia = ratingUsia;
        this.studioFilm = studioFilm;
    }

    public int getDurasiFilm() {
        return this.durasiFilm;
    }

    public int getRatingUsia() {
        return this.ratingUsia;
    }

    public String getStudioFilm() {
        return this.studioFilm;
    }

    public void setDurasiFilm(int durasiFilm) {
        this.durasiFilm = durasiFilm;
    }

    public void setRatingUsia(int ratingUsia) {
        this.ratingUsia = ratingUsia;
    }

    public void setStudioFilm(String studioFilm) {
        this.studioFilm = studioFilm;
    }

    public void deskripsiDvd() {
        System.out.println("=========================================================");
        System.out.println("Nomor : " + super.getNomor());
        System.out.println("Nama DVD : " + super.getNama());
        System.out.println("Durasi Film : " + getDurasiFilm());
        System.out.println("Rating Usia : " + getRatingUsia());
        System.out.println("Studio Film : " + getStudioFilm());
        System.out.println("Jumlah Stok : " + super.getJumlah());
        System.out.println("Harga : Rp. " + String.format("%.2f", getHarga()));
        System.out.println("=========================================================");
    }
}
