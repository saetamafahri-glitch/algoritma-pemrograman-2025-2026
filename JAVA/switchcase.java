public import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, valid, nim;
        int saldo;

        do {
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Apakah nama sudah benar? (TRUE/FALSE): ");
            valid = sc.nextLine().toUpperCase();
        } while (!valid.equals("TRUE"));

        do {
            System.out.print("Masukkan NIM (angka saja): ");
            nim = sc.nextLine();
        } while (!nim.matches("\\d+"));

        saldo = Integer.parseInt(nim);

        System.out.println("\nNama: " + nama);
        System.out.println("Saldo Awal: Rp " + saldo);

        while (true) {
            System.out.println("""
===== MENU ATM =====
1. Cek Saldo
2. Tarik Tunai
3. Setor Tunai
4. Transfer
5. Keluar
""");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 -> System.out.println("Saldo kamu: Rp " + saldo);
                case 2 -> {
                    System.out.print("Jumlah tarik: ");
                    saldo -= sc.nextInt();
                    System.out.println("Saldo baru: Rp " + saldo);
                }
                case 3 -> {
                    System.out.print("Jumlah setor: ");
                    saldo += sc.nextInt();
                    System.out.println("Saldo baru: Rp " + saldo);
                }
                case 4 -> {
                    System.out.print("Jumlah transfer: ");
                    saldo -= sc.nextInt();
                    System.out.println("Saldo baru: Rp " + saldo);
                }
                case 5 -> {
                    System.out.println("Keluar...");
                    return;
                }
                default -> System.out.println("Menu nggak valid!");
            }
        }
    }
}
 {
    
}
