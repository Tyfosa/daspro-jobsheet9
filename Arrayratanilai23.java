import java.util.Scanner;

public class Arrayratanilai23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input23.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input23.nextInt();
        }

        int totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] >= 70) {
                totalLulus += nilaiMahasiswa[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                jumlahTidakLulus++;
            }
        }

        double rataRataLulus = (jumlahLulus > 0) ? (double) totalLulus / jumlahLulus : 0;
        double rataRataTidakLulus = (jumlahTidakLulus > 0) ? (double) totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
    }
}