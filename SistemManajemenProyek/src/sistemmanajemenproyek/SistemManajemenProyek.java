/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemmanajemenproyek;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class SistemManajemenProyek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Anggota anggota1 = new Anggota(1, "Anggota 1", "Peran Anggota 1", new ArrayList<>());
        Anggota anggota2 = new Anggota(2, "Anggota 2", "Peran Anggota 2", new ArrayList<>());

        Tim tim1 = new Tim(1, new ArrayList<>(), 1, "Tim A", new Date(), 500000.0);
        tim1.tambahAnggota(anggota1);
        tim1.tambahAnggota(anggota2);

        Tugas tugas1 = new Tugas(1, "Analisis Requirement", new Date(), new Date(), "Belum Dimulai");
        Tugas tugas2 = new Tugas(2, "Implementasi Fitur", new Date(), new Date(), "Sudah Dimulai");

        Proyek proyek1 = new Proyek(132, "Proyek XYZ", new Date(), 500000.0);

        proyek1.alokasiTugas(anggota1, tugas1);
        proyek1.alokasiTugas(anggota2, tugas2);

        proyek1.cekKemajuan(tugas1.getIdTugas());
        proyek1.cekKemajuan(tugas2.getIdTugas());

        Jadwal jadwalProyek = new Jadwal(1, new HashMap<>(), 1, "Jadwal Proyek", new Date(), new Date(), "Belum Dimulai");
        jadwalProyek.updateJadwal(tugas1, new Date());
        jadwalProyek.updateJadwal(tugas2, new Date());

        jadwalProyek.tampilkanJadwal();

        tim1.tampilAnggota();
    }
    
}
