# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Sistem Informasi Akademik Sederhana menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini dirancang untuk mengelola data universitas, fakultas, departemen, mahasiswa, dan dosen. Aplikasi ini menggunakan konsep pemrograman berorientasi objek (OOP) dalam implementasinya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `Fakultas`, `Departemen`, `Universitas`, `Dosen` adalah contoh dari class.

```bash
public class Mahasiswa {
    ...
}

public class Universitas {
    ...
}

public class Dosen {
    ...
}

public class Departemen extends Universitas {
    ...
}

public class Fakultas extends Universitas {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Universitas universitas = new Universitas("Universitas Islam Kalimantan", "Banjarmasin");` adalah contoh pembuatan object.

```bash
Universitas universitas = new Universitas("Universitas Islam Kalimantan", "Banjarmasin");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`dan 'NIM' adalah contoh atribut.

```bash
String nama;
INT NIM;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa`.

```bash
public Mahasiswa(String nama, int NIM, Departemen departemen) {
    this.nama = nama;
    this.NIM = NIM;
    this.departemen = departemen;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setDepartemen` adalah contoh method mutator.

```bash
public void setDepartemen(Departemen departemen) {
    this.departemen = departemen;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNim`, `getDepartemen` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getNIM() {
    return NIM;
}

public Departemen getDepartemen() {
    return departemen;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `alamat`, `NIM`, `NIDN` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String alamat;
private INT NIM;
private INT NIDN;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Departemen` dan `Fakultas` mewarisi `Universotas` dengan sintaks `extends`.

```bash
public class Departemen extends Universitas {
    ...
}

public class Fakultas extends Universitas {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `getNama()` di `Departemen`dan `Fakultas` merupakan contoh polymorphism.
```bash
@Override
public String getNama() {
    return nama;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch`.

```bash
switch (pilihan) {
case 1:
    System.out.println(fakultas.getDaftarDepartemen()[0].toString());
    break;
case 2:
    for (Mahasiswa mahasiswa : departemen.getDaftarMahasiswa()) {
        System.out.println(mahasiswa.getNama() + " - " + mahasiswa.getNIM());
    }
    break;
case 3:
    for (Dosen dosen : departemen.getDaftarDosen()) {
        System.out.println(dosen.getNama() + " - " + dosen.getNIDN());
    }
    break;
case 4:
    loop = false;
    break;
default:
    System.out.println("Menu tidak tersedia");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (Mahasiswa mahasiswa : departemen.getDaftarMahasiswa()) {
    // ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
int pilihan = scanner.nextInt();
System.out.println(universitas.getNama());
System.out.println(fakultas.getNama());
System.out.println("Menu:");
System.out.println("1. Tampilkan daftar departemen");
System.out.println("2. Tampilkan daftar mahasiswa");
System.out.println("3. Tampilkan daftar dosen");
System.out.println("4. Keluar");
System.out.print("Pilih menu: ");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `private final ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();` adalah contoh penggunaan array.

```bash
private final ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // ...
} catch (NullPointerException e) {
    // ...
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Sholkhan
NPM: 2210010568
