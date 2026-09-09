# Sistem Pengajuan Desain Departemen COMINFO

## Deskripsi Singkat Program

COMINFO (Communication and Media Information) adalah salah satu departemen di himpunan mahasiswa Sistem Informasi, INFORSA. Di dalamnya ada divisi Visual Creative yang menangani semua urusan desain, mulai dari feeds, poster, sampai kebutuhan visual lain untuk seluruh departemen/biro di INFORSA. Selama ini pengajuan desain dilakukan lewat formulir manual yang isinya nama pemohon, departemen/biro, jenis desain, informasi tambahan, dan deadline pembuatan.

Untuk tugas mini project mata kuliah Pemrograman Berorientasi Objek (PBO), formulir pengajuan itu saya coba ubah jadi program Java sederhana yang menerapkan konsep CRUD. Jadi program ini fungsinya buat mencatat pengajuan desain yang masuk, menampilkan daftar pengajuan yang sudah ada, mengubah informasi tambahan kalau ada revisi, sampai menghapus pengajuan yang sudah tidak diperlukan lagi.

## Penjelasan Alur Program

Ketika program dijalankan lewat class Main, yang pertama muncul adalah menu utama dengan 5 pilihan:

1. Tambah Pengajuan
2. Tampilkan Pengajuan
3. Update Informasi Tambahan
4. Hapus Pengajuan
5. Keluar

Menu ini terus muncul berulang karena Main punya perulangan while yang baru berhenti kalau user pilih nomor 5. Tiap kali user mengetik pilihannya, Main mengecek angka itu lewat percabangan switch-case, lalu tinggal memanggil method yang sesuai dari class LayananPengajuan. Jadi Main sebenarnya cuma berperan sebagai tampilan menu, semua proses sesungguhnya dikerjakan di LayananPengajuan.

Kalau user pilih tambah pengajuan, LayananPengajuan akan minta input id, nama pemohon, departemen/biro, jenis desain, informasi tambahan, dan deadline. Nama dan departemen yang diinput dipakai untuk membuat object baru dari class Pemohon, lalu object itu digabung dengan data lainnya jadi satu object PengajuanDesain, dan langsung dimasukkan ke ArrayList yang menyimpan semua data pengajuan.

Waktu user pilih tampilkan pengajuan, semua object di ArrayList itu ditelusuri satu-satu pakai perulangan for, lalu detailnya ditampilkan ke layar, mulai dari id, nama pemohon dan departemennya (yang diambil dari object Pemohon di dalam PengajuanDesain), jenis desain, informasi tambahan, deadline, sampai status pengajuannya.

Sama halnya kalau user pilih update atau hapus pengajuan, LayananPengajuan akan minta id pengajuan yang mau diproses, lalu ArrayList-nya dicari satu-satu sampai ketemu data dengan id yang cocok. Untuk update, informasi tambahan pada data itu langsung diganti dengan input baru dari user. Untuk hapus, data dengan id yang cocok itu langsung dibuang dari ArrayList. Kalau id yang diinput user tidak ada yang cocok, program akan memberi tahu bahwa datanya tidak ditemukan.

Terakhir, kalau user pilih keluar, variabel boolean yang menjadi kondisi perulangan while di Main diubah jadi false, sehingga perulangannya berhenti dan program selesai.

## Penjelasan Letak Penerapan Nilai Tambah

Semua atribut di class Pemohon, PengajuanDesain, dan LayananPengajuan saya buat private, sehingga tidak bisa diakses langsung dari luar class-nya masing-masing. Untuk mengambil atau mengubah nilainya, harus lewat method getter dan setter yang saya buat public, misalnya getNamaLengkap() untuk mengambil nama pemohon atau setInformasiTambahan() untuk mengubah informasi tambahan pada PengajuanDesain. Dengan begitu, data di dalam object tidak bisa diubah sembarangan dari luar, hanya bisa lewat method yang sudah disediakan.

Untuk validasi input, saya terapkan pada bagian update dan hapus pengajuan. Sebelum data diproses, program mengecek dulu apakah id yang diinput user memang ada di dalam ArrayList. Kalau tidak ketemu, program akan menampilkan pesan bahwa id pengajuan tidak ditemukan, dan proses update atau hapusnya tidak dilanjutkan. Jadi user tidak bisa asal memasukkan id sembarangan yang bisa membuat program error atau mengubah data yang salah.
