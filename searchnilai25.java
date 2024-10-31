import java.util.Scanner;

public class searchnilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang;
        int key;
        int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        panjang = sc.nextInt();

        
        int[] arrNilai = new int[panjang];
        
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.println("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai " + key + " Ketemu, merupakan nilai mahasiswa ke-" + hasil);
                System.out.println();
                break; 
            } else {
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;
            }
        }


    }
}
