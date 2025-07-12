package interf;

import transaksi.Transaksi; // Ini untuk memanggil class Transaksi 
import transaksi.KategoriTransaksi;

public interface PencatatanKeuanganInterface {
    void tambahTransaksi (Transaksi transaksi);
    void tambahKategori (KategoriTransaksi kategori);
    void hitungTotalPemasukanPengeluaran();
    void tampilkanLaporan(); 
    
}   