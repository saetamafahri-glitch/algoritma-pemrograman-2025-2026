import java.util.Scanner;

public class ATM {
    // Fungsi untuk memformat saldo
    public static String formatSaldo(int saldo) {
        return "Rp " + String.format("%,d", saldo).replace(",", ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop untuk meminta nama
        String nama = "";
        boolean konfirmasi = false;
        while (!konfirmasi) {
            System.out.print("Masukkan nama Anda: ");
            nama = scanner.nextLine().trim();
            System.out.print("Apakah nama Anda benar? (y/n): ");
            String jawab = scanner.nextLine().trim().toLowerCase();
            if (jawab.equals("y")) {
                konfirmasi = true;
            } else {
                System.out.println("Silakan masukkan nama kembali.");
            }
        }

        // Input NIM dan konversi ke saldo
        System.out.print("Masukkan NIM (tanpa huruf): ");
        int nim = Integer.parseInt(scanner.nextLine().trim());
        int saldo = nim;

        // Tampilkan nama dan saldo awal
        System.out.println("\nNama: " + nama);
        System.out.println("Saldo awal: " + formatSaldo(saldo));

        // Menu ATM
        while (true) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = Integer.parseInt(scanner.nextLine().trim());

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda: " + formatSaldo(saldo));
                    break;
                case 2:
                    System.out.print("Masukkan jumlah tarik tunai: ");
                    int jumlah = Integer.parseInt(scanner.nextLine().trim());
                    if (jumlah > saldo) {
                        System.out.println("Saldo tidak cukup.");
                    } else {
                        saldo -= jumlah;
                        System.out.println("Tarik tunai berhasil. Saldo Anda sekarang: " + formatSaldo(saldo));
                    }
                    break;
                case 3:
                    System.out.print("Masukkan jumlah setor tunai: ");
                    jumlah = Integer.parseInt(scanner.nextLine().trim());
                    saldo += jumlah;
                    System.out.println("Setor tunai berhasil. Saldo Anda sekarang: " + formatSaldo(saldo));
                    break;
                case 4:
                    System.out.print("Masukkan rekening tujuan: ");
                    String rekening = scanner.nextLine().trim();
                    System.out.print("Masukkan jumlah transfer: ");
                    jumlah = Integer.parseInt(scanner.nextLine().trim());
                    if (jumlah > saldo) {
                        System.out.println("Saldo tidak cukup.");
                    } else {
                        saldo -= jumlah;
                        System.out.println("Transfer ke " + rekening + " berhasil. Saldo Anda sekarang: " + formatSaldo(saldo));
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}