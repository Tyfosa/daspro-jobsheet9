import java.util.Scanner;

public class searchnilai23 {
    public static void main(String[] args) {
        Scanner scanner23 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = scanner23.nextInt();

        int[] arrNilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner23.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner23.nextInt();

        int hasil = -1;
        for (int i = 0; i < jumlah; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }

    }
}
