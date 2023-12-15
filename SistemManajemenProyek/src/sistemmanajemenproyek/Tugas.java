/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemmanajemenproyek;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Tugas {
    private int idTugas;
    private String deskripsi;
    private Date tanggalMulai;
    private Date tanggalSelesai;
    private String status;

    public Tugas(int idTugas, String deskripsi, Date tanggalMulai, Date tanggalSelesai, String status) {
        this.idTugas = idTugas;
        this.deskripsi = deskripsi;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.status = status;
    }

    public int getIdTugas() {
        return idTugas;
    }

    public void setIdTugas(int idTugas) {
        this.idTugas = idTugas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    // Method attributes
    public void memulaiTugas(){
        if (!status.equals("Selesai")){
            status = "Dalam Proses";
            System.out.println("Tugas " + idTugas + " telah dimulai.");
        } else {
            System.out.println("Tugas " + idTugas + " sudah selesai, tidak dapat dimulai kembali.");
        }
    }
    
    public void selesaikanTugas(){
        if (!status.equals("Dalam Proses")){
            status = "Selesai";
            System.out.println("Tugas " + idTugas + " telah dimulai.");
        } else if (status.equals("Belum Dimulai")){
            System.out.println("Tugas " + idTugas + " belum dimulai, tidak dapat terselesaikan.");
        } else {
            System.out.println("Tugas " + idTugas + " sudah selesai, tidak mengalami keterlambatan.");
        }
    }
}
