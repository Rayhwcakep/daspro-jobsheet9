import java.util.Scanner;

public class tugas125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        double total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }
        double rataRata = total / jumlahMahasiswa;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("\nNilai Mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

    }
}

