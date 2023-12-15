/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemmanajemenproyek;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Proyek {
    private int idProyek;
    private String namaProyek;
    private Date batasWaktu;
    private double anggaran;
    
    private List<Tim> timList;
    private List<Tugas> daftarTugas;

    public Proyek(int idProyek, String namaProyek, Date batasWaktu, double anggaran) {
        this.idProyek = idProyek;
        this.namaProyek = namaProyek;
        this.batasWaktu = batasWaktu;
        this.anggaran = anggaran;
        this.timList = new ArrayList<>();
        this.daftarTugas = new ArrayList<>();
    }

    public int getIdProyek() {
        return idProyek;
    }

    public void setIdProyek(int idProyek) {
        this.idProyek = idProyek;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public Date getBatasWaktu() {
        return batasWaktu;
    }

    public void setBatasWaktu(Date batasWaktu) {
        this.batasWaktu = batasWaktu;
    }

    public double getAnggaran() {
        return anggaran;
    }

    public void setAnggaran(double anggaran) {
        this.anggaran = anggaran;
    }
    
    
    // Method dari attribute
    public void buatProyek(String namaProyek, Date batasWaktu, double anggaran){
        this.setNamaProyek(namaProyek);
        this.setBatasWaktu(batasWaktu);
        this.setAnggaran(anggaran);
        
        System.out.println("Proyek " + namaProyek + " telah dibuat baru.");
        System.out.println("Dengan notifikasi batas waktu: " + batasWaktu);
        System.out.println("Anggaran: " + anggaran);
    }
    
    public void tambahAnggota(Tim anggota){
        timList.add(anggota);
    }
    
    public void alokasiTugas(Anggota anggota, Tugas tugas){
        anggota.tambahTugas(tugas);
        daftarTugas.add(tugas);
        System.out.println("Tugas " + tugas.getDeskripsi()+ " telah dialokasikan kepada " + anggota.getNama());
    }
    
    public void cekKemajuan(int idTugas){
        for (Tugas tugas : daftarTugas){
            if (tugas.getIdTugas() == idTugas){
                System.out.println("Kemajuan Tugas " + tugas.getIdTugas() + ": " + tugas.getStatus());
                return;
            }
        }
        System.out.println("Kemajuan Tugas dengan ID " + idTugas + " tidak ditemukan. " );
    }
}