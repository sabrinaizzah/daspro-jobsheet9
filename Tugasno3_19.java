import java.util.Scanner;
public class Tugasno3_19 {
    public static void main(String[] args) {
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kafe!");
        System.out.print("Masukkan nama makanan atau minuman yang ingin Anda cari: ");
        String searchItem = scanner.nextLine();

        boolean found = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(searchItem)) { 
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Makanan/Minuman \"" + searchItem + "\" tersedia di menu.");
        } else {
            System.out.println("Maaf, \"" + searchItem + "\" tidak ditemukan di menu kami.");
        }

        scanner.close();
    }
}
    
