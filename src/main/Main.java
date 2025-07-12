package main;
import java.util.Scanner;
import java.util.Date;

// Import class
import transaksi.Transaksi;
import transaksi.KategoriTransaksi;
import sistem.SistemPencatatanKeuangan;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemPencatatanKeuangan sistemPencatatanKeuangan = new SistemPencatatanKeuangan();

        int pilihan;
        do {
            System.out.println("===== MENU PENCATATAN KEUANGAN =====");
            System.out.println("1. Tambah Transaksi Baru");
            System.out.println("2. Tambah Kategori Transaksi Baru");
            System.out.println("3. Hitung Total Pemasukan dan Pengeluaran");
            System.out.println("4. Laporan Keuangan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    // Tambah Transaksi Baru
                    System.out.print("Masukkan ID Transaksi: ");
                    int idTransaksi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Tanggal Transaksi (yyyy-mm-dd): ");
                    String tanggalStr = scanner.nextLine();
                    System.out.print("Masukkan Jumlah: ");
                    double jumlah = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan Keterangan: ");
                    String keterangan = scanner.nextLine();

                    
                    Date tanggal = new Date(); 

                    Transaksi transaksiBaru = new Transaksi(idTransaksi, tanggal, jumlah, keterangan);
                    sistemPencatatanKeuangan.tambahTransaksi(transaksiBaru);
                    System.out.println("Transaksi berhasil ditambahkan!");
                    break;

                case 2:
                    // Tambah Kategori Transaksi Baru
                    System.out.print("Masukkan ID Kategori: ");
                    int idKategori = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Kategori: ");
                    String namaKategori = scanner.nextLine();
                    System.out.print("Masukkan Tipe Kategori (Pemasukan/Pengeluaran): ");
                    String tipeKategori = scanner.nextLine();

                    KategoriTransaksi kategoriBaru = new KategoriTransaksi(idKategori, namaKategori, tipeKategori);
                    sistemPencatatanKeuangan.tambahKategori(kategoriBaru);
                    System.out.println("Kategori transaksi berhasil ditambahkan!");
                    break;

                case 3:
                    // Hitung total pemasukan dan pengeluaran
                    sistemPencatatanKeuangan.hitungTotalPemasukanPengeluaran();
                    break;

                case 4:
                    // Laporan Keuangan
                    sistemPencatatanKeuangan.tampilkanLaporan();
                    break;

                case 0:
                    System.out.println("Program selesai. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
