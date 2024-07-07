/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_universitas;

import java.util.ArrayList;

/**
 *
 * @author TRI KARDINA
 */
public class Departemen extends Universitas {
    private final String nama;
    private final Fakultas fakultas;
    private final ArrayList<Mahasiswa> daftarMahasiswa;
    private final ArrayList<Dosen> daftarDosen;

    public Departemen(String nama, Fakultas fakultas) {
        super("", "");
        this.nama = nama;
        this.fakultas = fakultas;
        this.daftarMahasiswa = new ArrayList<>();
        this.daftarDosen = new ArrayList<>();
    }

    @Override
    public String getNama() {
        return nama;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public ArrayList<Dosen> getDaftarDosen() {
        return daftarDosen;
    }

    @Override
    public String toString() {
        return "Departemen: " + nama;
    }
}
