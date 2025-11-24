public import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nama barang: ");
        String nama = in.nextLine();

        System.out.print("Harga barang: ");
        int harga = in.nextInt();

        System.out.print("Jumlah barang: ");
        int jumlah = in.nextInt();

        System.out.print("3 angka terakhir NIM: ");
        int nim3 = in.nextInt();

        System.out.print("1 angka terakhir NIM: ");
        int nim1 = in.nextInt();

        int minimal = nim3 * 100;
        int total = harga * jumlah;
        int diskonPersen = nim1;

        if (total < minimal) diskonPersen = 0;

        int diskonRp = total * diskonPersen / 100;
        int totalBayar = total - diskonRp;

        System.out.println("\n===== STRUK BELANJA =====");
        System.out.println("Nama Barang        : " + nama);
        System.out.println("Harga Satuan       : " + harga);
        System.out.println("Jumlah Beli        : " + jumlah);
        System.out.println("Total Harga        : " + total);
        System.out.println("Minimal Diskon     : " + minimal);
        System.out.println("Diskon (%)         : " + diskonPersen);
        System.out.println("Diskon (Rp)        : " + diskonRp);
        System.out.println("Total Bayar        : " + totalBayar);
        System.out.println("=========================");
    }
}
 {
    
}
