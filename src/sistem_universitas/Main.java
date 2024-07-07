/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistem_universitas;

/**
 *
 * @author TRI KARDINA
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try {
        Universitas universitas = new Universitas("Universitas Islam Kalimantan", "Banjarmasin");
        Fakultas fakultas = new Fakultas("Fakultas Teknologi Informasi");
        Departemen departemen = new Departemen("Departemen Teknik Informatika", fakultas);

        fakultas.tambahDepartemen(departemen);

        Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad Sholkhan", 12341, departemen);
        Mahasiswa mahasiswa2 =new Mahasiswa("Akarsana Januar", 12342, departemen);
        Mahasiswa mahasiswa3 =new Mahasiswa("Viman Mangunsong", 12343, departemen);
        Mahasiswa mahasiswa4 =new Mahasiswa("Ibrani Januar", 12344, departemen);
        Mahasiswa mahasiswa5 =new Mahasiswa("Lala Laksmiwati", 12345, departemen);
        Mahasiswa mahasiswa6 = new Mahasiswa("Gamani Simbolon", 12346, departemen);
        Mahasiswa mahasiswa7 =new Mahasiswa("Sakura Melani", 12347, departemen);
        Mahasiswa mahasiswa8 =new Mahasiswa("Irma Hassanah", 12348, departemen);
        Mahasiswa mahasiswa9 =new Mahasiswa("Rini Andriani", 12349, departemen);
        Mahasiswa mahasiswa10 =new Mahasiswa("Ika Yulianti", 123410, departemen);

        departemen.tambahMahasiswa(mahasiswa1);
        departemen.tambahMahasiswa(mahasiswa2);
        departemen.tambahMahasiswa(mahasiswa3);
        departemen.tambahMahasiswa(mahasiswa4);
        departemen.tambahMahasiswa(mahasiswa5);
        departemen.tambahMahasiswa(mahasiswa6);
        departemen.tambahMahasiswa(mahasiswa7);
        departemen.tambahMahasiswa(mahasiswa8);
        departemen.tambahMahasiswa(mahasiswa9);
        departemen.tambahMahasiswa(mahasiswa10);

        Dosen dosen1 = new Dosen("Dr. Wawan Prasasta, S.Pd", 11111, departemen);
        Dosen dosen2 = new Dosen("Dr. Ian Saptono, S.Pd", 11121, departemen);
        Dosen dosen3 = new Dosen("Dr. Gandewa Waluyo, S.Pd", 11131, departemen);
        Dosen dosen4 = new Dosen("Dr. Harja Prasetyo, S.Pd", 11141, departemen);
        Dosen dosen5 = new Dosen("Dr. Bagya Gunarto, S.Pd", 11151, departemen);
        Dosen dosen6 = new Dosen("Dr. Maida Suartini, S.Pd", 11161, departemen);
        Dosen dosen7 = new Dosen("Dr. Kayla Astuti, S.Pd", 11171, departemen);
        Dosen dosen8 = new Dosen("Dr. Winda Wastuti, S.Pd", 11181, departemen);
        Dosen dosen9 = new Dosen("Dr. Laras Hariyah, S.Pd", 11191, departemen);
        Dosen dosen10 = new Dosen("Dr. Karen Nuraini, S.Pd", 11110, departemen);

        departemen.tambahDosen(dosen1);
        departemen.tambahDosen(dosen2);
        departemen.tambahDosen(dosen3);
        departemen.tambahDosen(dosen4);
        departemen.tambahDosen(dosen5);
        departemen.tambahDosen(dosen6);
        departemen.tambahDosen(dosen7);
        departemen.tambahDosen(dosen8);
        departemen.tambahDosen(dosen9);
        departemen.tambahDosen(dosen10);

        boolean loop = true;
        while (loop) {
            System.out.println(universitas.getNama());
            System.out.println(fakultas.getNama());
            System.out.println("Menu:");
            System.out.println("1. Tampilkan daftar departemen");
            System.out.println("2. Tampilkan daftar mahasiswa");
            System.out.println("3. Tampilkan daftar dosen");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

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
        }
    }catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
