import java.util.Scanner;
public class uklsulit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

    System.out.println("Masukkan jumlah siswa");
    int jumlahSiswa = scanner.nextInt();

    double [] nilaiUjian = new double[jumlahSiswa];
    double totalNilai = 0;

    for (int i = 0; i <jumlahSiswa; i++){
        System.out.println("Masukkan nilai siswa ke-" + (i +1) + ":");
        nilaiUjian[i] = scanner.nextDouble();
        totalNilai += nilaiUjian[i];  
    }
    
    double rataRata = totalNilai / jumlahSiswa;

    
    System.out.println("Rekapitulasi nilai ujian produktif RPL");
    System.out.println("Jumlah siswa " + jumlahSiswa);
    System.out.println("Nilai total " + totalNilai);
    System.out.println("Rata rata nilai ujian " + rataRata);
    }
    
}
