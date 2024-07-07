/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_universitas;

/**
 *
 * @author TRI KARDINA
 */
public class Fakultas extends Universitas {
    private String nama;
    private Departemen[] daftarDepartemen;

    public Fakultas(String nama) {
        super("", "");
        this.nama = nama;
        this.daftarDepartemen = new Departemen[10];
    }

    public String getNama() {
        return nama;
    }

    public void tambahDepartemen(Departemen departemen) {
        for (int i = 0; i < daftarDepartemen.length; i++) {
            if (daftarDepartemen[i] == null) {
                daftarDepartemen[i] = departemen;
                break;
            }
        }
    }

    public Departemen[] getDaftarDepartemen() {
        return daftarDepartemen;
    }

    @Override
    public String toString() {
        return "Fakultas: " + nama;
    }
}
