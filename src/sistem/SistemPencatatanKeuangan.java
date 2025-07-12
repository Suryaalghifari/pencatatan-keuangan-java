package sistem;
import java.util.Date;
import java.util.ArrayList;


import interf.PencatatanKeuanganInterface;
import transaksi.Transaksi; 
import transaksi.KategoriTransaksi;

public class SistemPencatatanKeuangan implements PencatatanKeuanganInterface{
    private ArrayList<Transaksi> transaksiList;
    private ArrayList<KategoriTransaksi> kategoriTransaksiList;

    public SistemPencatatanKeuangan() {
        transaksiList = new ArrayList<>();
        kategoriTransaksiList = new ArrayList<>();
    }

    @Override
    public void tambahTransaksi (Transaksi transaksi){
        transaksiList.add(transaksi);
    }
    @Override
    public void tambahKategori (KategoriTransaksi kategori){
        kategoriTransaksiList.add(kategori);
    }

    @Override
    public void hitungTotalPemasukanPengeluaran(){
        double pemasukan =0;
        double pengeluaran =0;

        for (Transaksi t : transaksiList) {
            if (t.getJumlah() >0) {
                pemasukan += t.getJumlah();
            }else {
                pengeluaran +=t.getJumlah();
            }
        }

        System.out.println("Total Pemasukan: "+pemasukan);
        System.out.println("Total Pengeluaran: "+pengeluaran);
    }

    @Override
    public void tampilkanLaporan() {
        System.out.println("Daftar Transaksi: ");
        for(Transaksi t : transaksiList) {
            t.tampilkanTransaksi();
        }
        System.out.println("Daftar Kategori Transaksi: ");
        for (KategoriTransaksi k : kategoriTransaksiList) {
         k.tampilkanKategori();
        }


    }
        
}
