import java.util.ArrayList;
import java.util.List;

public class KHS {

    private Mahasiswa mahasiswa;
    private List<Matkul> mataKuliahs;

    public KHS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliahs = new ArrayList<>();
    }

    public void addMataKuliah(Matkul matkul) {
        this.mataKuliahs.add(matkul);
    }

    public void cetakKHS() {
        System.out.println("KHS");
        System.out.println("-----------------------------------");
        System.out.println("Mahasiswa: " + mahasiswa.getNim() + " - " + mahasiswa.getNama());
        System.out.println();
        System.out.println("| Kode MK | Nama MK | Nilai Angka | Nilai Huruf |");
        for (Matkul matkul : mataKuliahs) {
            System.out.printf("| %s | %s | %d | %s |\n", matkul.getKodeMK(), matkul.getNamaMK(), matkul.getNilaiAngka(),
                    matkul.getNilaiHuruf());
        }
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("235150401111010", "Amka Wildan F");

        KHS khs = new KHS(mahasiswa);

        khs.addMataKuliah(new Matkul("COM60014", "Pemrograman Dasar", 75));
        khs.addMataKuliah(new Matkul("COM60015", "Matematika Komputasi", 85));
        khs.addMataKuliah(new Matkul("CIS62007", "Jaringan Komunikasi Data", 95));

        khs.cetakKHS();
    }

}

class Matkul {

    private String kodeMK;
    private String namaMK;
    private int nilaiAngka;

    public Matkul(String kodeMK, String namaMK, int nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(int nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }

    public String getNilaiHuruf() {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 70) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C";
        } else if (nilaiAngka >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}

class Mahasiswa {

    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}