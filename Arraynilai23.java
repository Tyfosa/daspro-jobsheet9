import java.util.Scanner;

public class Arraynilai23 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input23.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus! ");
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus! ");
            }
    }
    }
}