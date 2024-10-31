import java.util.Scanner;

public class tugas325 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama makanan atau minuman yang ingin dicari: ");
        String namaMakanan = scanner.nextLine();

        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(namaMakanan)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan/minuman '" + namaMakanan + "' tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan/minuman '" + namaMakanan + "' tidak ada di menu.");
        }
    }
}