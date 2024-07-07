/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_universitas;

/**
 *
 * @author TRI KARDINA
 */
public class Dosen {
    private String nama;
    private int NIDN;
    private Departemen departemen;

    public Dosen(String nama, int NIDN, Departemen departemen) {
        this.nama = nama;
        this.NIDN = NIDN;
        this.departemen = departemen;
    }

    public String getNama() {
        return nama;
    }

    public int getNIDN() {
        return NIDN;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
}
