/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemmanajemenproyek;

import java.util.Date;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class Jadwal extends Tugas {
    private int idJadwal;
    private Map<Tugas, Date> jadwalProyek;

    public Jadwal(int idJadwal, Map<Tugas, Date> jadwalProyek, int idTugas, String deskripsi, Date tanggalMulai, Date tanggalSelesai, String status) {
        super(idTugas, deskripsi, tanggalMulai, tanggalSelesai, status);
        this.idJadwal = idJadwal;
        this.jadwalProyek = jadwalProyek;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Map<Tugas, Date> getJadwalProyek() {
        return jadwalProyek;
    }

    public void setJadwalProyek(Map<Tugas, Date> jadwalProyek) {
        this.jadwalProyek = jadwalProyek;
    }
    
    
    // Method dari attributes
    public void updateJadwal(Tugas tugas, Date tanggal){
        jadwalProyek.put(tugas, tanggal);
        System.out.println("Jadwal untuk Tugas " + tugas.getIdTugas() + "diperbarui menjadi : " + tanggal);
    }
    
    public void tampilkanJadwal(){
        System.out.println("Jadwal Proyek: ");
        
        for (Map.Entry<Tugas, Date> entry : jadwalProyek.entrySet()) {
            Tugas tugas = entry.getKey();
            Date tanggal = entry.getValue();
            System.out.println("Tugas ID: " + tugas.getIdTugas() + ", Tanggal: " + tanggal);
        }
    }
}
