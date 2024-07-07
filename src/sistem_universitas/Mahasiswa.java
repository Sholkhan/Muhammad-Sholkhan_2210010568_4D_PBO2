/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_universitas;

/**
 *
 * @author TRI KARDINA
 */
public class Mahasiswa {
    private String nama;
    private int NIM;
    private Departemen departemen;

    public Mahasiswa(String nama, int NIM, Departemen departemen) {
        this.nama = nama;
        this.NIM = NIM;
        this.departemen = departemen;
    }

    public String getNama() {
        return nama;
    }

    public int getNIM() {
        return NIM;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
}
