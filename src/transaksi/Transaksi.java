package transaksi;


public class Transaksi {
    private int id;  // definsikan terlebih dahulu untuk masing - masing atribut
    private Date tanggal;
    private double jumlah;
    private String keterangan; 

    public Transaksi (int id, Date Tanggal, double jumlah, String keterangan) {
        this.id = id;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this. keterangan = keterangan;

    }
    // Get Untuk atribut
    public int getId() {
        return id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public double getJumlah() {
        return jumlah;
    }
    public String getKeterangan() {
        return keterangan;
    }

    public void tampilanTransaksi() {
          System.out.println("ID Transaksi : "+id);
          System.out.println("Tanggal Transaksi : "+tanggal);
          System.out.println("Jumlah Transaksi : "+jumlah);
          System.out.println("Keterangan Transaksi : "+keterangan);
    }

}