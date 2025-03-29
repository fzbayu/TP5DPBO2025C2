# TP5DPBO2025C2

# JANJI
Saya Faiz Bayu Erlangga dengan NIM 2311231 mengerjakan Tugas Praktikum 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## DESAIN PROGRAM
1. Program menggunakan OOP dengan dua kelas utama:
- Menu: Kelas utama yang mengatur tampilan GUI dan logika aplikasi
- Mahasiswa: Kelas untuk menyimpan data individu mahasiswa, yaitu:
  - nim (string) = nomor induk mahasiswa, cont: 2311231
  - nama (string) = nama mahasiswa
  - jenis kelamin (string) = laki-laki atau perempuan
  - status (string) = aktif, cuti, atau lulus

  untuk method dalam kelas hanya setter dan getter saja

2. Tampilan GUI:
Menggunakan JFrame sebagai container utama
Komponen-komponen GUI:
- Field input: TextField untuk NIM dan nama
- ComboBox untuk jenis kelamin
- RadioButton untuk status mahasiswa (Aktif, Lulus, Cuti)
- Tabel untuk menampilkan data mahasiswa
- Tombol untuk operasi CRUD (add, update, delete)

3. Penyimpanan Data:
Dalam program ini, database digunakan untuk menyimpan data mahasiswa secara permanen. Dengan menggunakan database (MySQL), data tetap tersedia meskipun aplikasi ditutup, berbeda dengan penyimpanan dalam memori atau dalam list yang akan hilang saat program dihentikan. Java Database Connectivity (JDBC) digunakan dalam program ini. JDBC bertugas menyediakan koneksi ke database sehingga datanya dapat diakses dan dikelola menggunakan program Java. Ini hubungkan dalam database dalam MySQL yang bernama db_mahasiswa.

4. Fitur Utama:
- Create: Menambahkan data mahasiswa baru melalui form input.
- Read: Menampilkan data mahasiswa dalam tabel.
- Update: Mengedit data mahasiswa yang sudah ada.
- Delete: Menghapus data mahasiswa yang dipilih.

## PENJELASAN ALUR
Program dimulai dengan menampilkan form yang berisikan nim, nama, jenis kelamin, dan status. Terdapat beberapa button untuk dipilih yaitu add, update dan delete, dan juga beberapa data yang sudah ada dalam bentuk tabel, yang terdiri dari kolom nomor, nim, nama, jenis kelamin, dan status.

- Ketika user mengisi form tersebut kemudian mengklik add maka data akan ditambahkan dan dimunculkan pada tabel, jika user tidak melengkapi semua data pada form, maka akan muncul pesan "Semua kolom harus diisi!"
- Ketika user mengisi NIM yang sama pada database atau sudah terdaftar dalam database maka akan menampilkan pesan "NIM sudah ada!".
- Ketika user sudah mengisi form kemudian mengklik cancel maka data pada form akan hilang, atau mereset ke semua form pengisian (menjadi kosong)
- User dapat memilih jenis kelamin yaitu laki-laki dan perempuan, dalam bentuk dropdown.
- User dapat memilih status antara aktif, cuti atau lulus, untuk antisipasi data kosong maka default diisi dengan 'Aktif', dan form ini dalam bentuk radio button.
-  Jika salah satu row pada tabel diklik maka dalam form akan menampikan datanya, kemudian muncul button seperti update dan delete.
-  Jika user mengubah data pada form dan mengklik update, maka data akan terupdate dan ditampikan pada tabel, jika user tidak melengkapi semua data pada form, maka akan muncul pesan "Semua kolom harus diisi!".
-  Jika user mengkilk delete, maka data akan terhapus pada tabel.

## DOKUMENTASI
https://github.com/user-attachments/assets/80ed802e-9501-4f9e-92fd-71e730416d68



