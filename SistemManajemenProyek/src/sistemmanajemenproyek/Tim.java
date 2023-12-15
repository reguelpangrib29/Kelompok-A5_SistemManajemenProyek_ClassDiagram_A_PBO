/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemmanajemenproyek;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */

public class Tim extends Proyek{
    private int idTim;
    private List<Anggota> anggotaList;

    public Tim(int idTim, List<Anggota> anggotaList, int idProyek, String namaProyek, Date batasWaktu, double anggaran) {
        super(idProyek, namaProyek, batasWaktu, anggaran);
        this.idTim = idTim;
        this.anggotaList = anggotaList;
    }

    public int getIdTim() {
        return idTim;
    }

    public void setIdTim(int idTim) {
        this.idTim = idTim;
    }

    public List<Anggota> getAnggotaList() {
        return anggotaList;
    }

    public void setAnggotaList(List<Anggota> anggotaList) {
        this.anggotaList = anggotaList;
    }


    // Method dari attributes
    public void tambahAnggota(Anggota anggota){
        anggotaList.add(anggota);
    }
    
    public void tampilAnggota(){
        System.out.println("Anggota Tim " + idTim + ":");
        for (Anggota anggota : anggotaList){
            System.out.println(anggota.getNama());
        }
    }
    
    public void hapusAnggota(Anggota anggota){
        anggotaList.remove(anggota);
    }
}