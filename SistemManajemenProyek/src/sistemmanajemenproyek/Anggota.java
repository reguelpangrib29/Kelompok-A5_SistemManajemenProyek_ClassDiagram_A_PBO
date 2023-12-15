/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemmanajemenproyek;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Anggota {
    private int idAnggota;
    private String nama;
    private String peran;
    
    private List<Tugas> daftarTugas;

    public Anggota(int idAnggota, String nama, String peran, List<Tugas> daftarTugas) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.peran = peran;
        this.daftarTugas = new ArrayList<>();
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public List<Tugas> getDaftarTugas() {
        return daftarTugas;
    }

    public void setDaftarTugas(List<Tugas> daftarTugas) {
        this.daftarTugas = daftarTugas;
    }

    
    // Method attributes
    public void tambahTugas(Tugas tugas){
        daftarTugas.add(tugas);
        System.out.println("Tugas " + tugas.getDeskripsi() + " ditambahkan untuk " + getNama());
    }
    
    public void perbaruiStatus(int idTugas, String status){
        for(Tugas tugas : daftarTugas){
            if (tugas.getIdTugas() == idTugas){
                tugas.setStatus(status);
                System.out.println("Status tugas dengan ID " + idTugas + "diperbarui menjadi: " + status);
                return;
            }
        }
        System.out.println("Tugas dengan ID " + idTugas + "tidak ditemukan.");
    }
}