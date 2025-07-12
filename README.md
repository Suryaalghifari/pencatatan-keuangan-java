# Sistem Pencatatan Keuangan Sederhana

Ini adalah latihan logika dan pemrograman Java untuk mencatat transaksi keuangan secara sederhana. Proyek ini cocok untuk mahasiswa pemula yang sedang belajar Java, OOP, dan penggunaan package.

---

## 📝 Cara Menjalankan Program

1. **Masuk ke Folder src**

   - Buka terminal atau command prompt, lalu pindah ke folder `src`:
     ```
     cd src
     ```

2. **Kompilasi Semua File Java**

   - Ketik perintah ini di terminal (masih di dalam folder `src`):
     ```
     Get-ChildItem -Recurse -Filter *.java | ForEach-Object { javac $_.FullName }
     ```
   - Atau compile satu per satu:
     ```
     javac interf\PencatatanKeuanganInterface.java
     javac transaksi\Transaksi.java
     javac transaksi\KategoriTransaksi.java
     javac sistem\SistemPencatatanKeuangan.java
     javac main\Main.java
     ```

3. **Jalankan Program**

   - Masih di folder `src`, jalankan:
     ```
     java main.Main
     ```

4. **Ikuti Menu di Layar**
   - Program akan menampilkan menu seperti berikut:
     ```
     ===== MENU PENCATATAN KEUANGAN =====
     1. Tambah Transaksi Baru
     2. Tambah Kategori Transaksi Baru
     3. Hitung Total Pemasukan dan Pengeluaran
     4. Laporan Keuangan
     0. Keluar
     Pilih menu (0-4):
     ```

---

## 💡 Tips

- **Pastikan compile dan jalankan dari dalam folder `src`**, bukan dari luar folder tersebut.
- Jika ada error seperti "package ... does not exist", periksa lagi posisi folder dan deklarasi `package` di atas setiap file.
- Nama file dan nama kelas di dalamnya harus SAMA persis (huruf besar/kecil juga harus sama).
- Untuk latihan awal, tanggal transaksi otomatis memakai tanggal hari ini. Jika ingin lebih detail bisa mengembangkan sendiri menggunakan parsing tanggal.

---

## 📚 Tujuan Proyek

- Melatih logika dasar OOP Java
- Mengenal penggunaan package dan struktur folder di Java
- Belajar membuat program interaktif berbasis console

---

**Selamat belajar dan mencoba! Jika ada error atau pertanyaan, silakan diskusikan bersama teman atau dosen.**
