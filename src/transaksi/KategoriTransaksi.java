package kategoritransaksi;

public class KategoriTransaksi {
    private int id; //definisi untuk atribut yang di perlukan 
    private String nama;
    private String tipeKategori;

    public KategoriTransaksi (int id, String nama, String tipeKategori) {
        this.id = id;
        this.nama =nama;
        this.tipeKategori =tipeKategori;
    }

    // get untuk atribut
    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String gettipeKategori() {
        return tipeKategori;
    }

    public void tampilanKategori() {
        System.out.println("ID Kategori Transaksi : "+id);
        System.out.println("Nama Kategori : "+nama);
        System.out.println("Tipe Kategori : "+tipeKategori);
    }
}