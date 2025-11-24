#include <stdio.h>
#include <string.h>

int main() {
    char nama[50];
    int harga, jumlah, nim3, nim1;
    int minimal, total, diskonRp, totalBayar, diskonPersen;

    printf("Nama barang: ");
    fgets(nama, sizeof(nama), stdin);
    // Remove trailing newline if present
    nama[strcspn(nama, "\n")] = 0;

    printf("Harga barang: ");
    if (scanf("%d", &harga) != 1) {
        printf("Input harga tidak valid.\n");
        return 1;
    }

    printf("Jumlah barang: ");
    if (scanf("%d", &jumlah) != 1) {
        printf("Input jumlah tidak valid.\n");
        return 1;
    }

    printf("3 angka terakhir NIM: ");
    if (scanf("%d", &nim3) != 1) {
        printf("Input NIM3 tidak valid.\n");
        return 1;
    }

    printf("1 angka terakhir NIM: ");
    if (scanf("%d", &nim1) != 1) {
        printf("Input NIM1 tidak valid.\n");
        return 1;
    }

    minimal = nim3 * 100;
    total = harga * jumlah;
    diskonPersen = nim1;

    if (total < minimal) diskonPersen = 0;

    diskonRp = total * diskonPersen / 100;
    totalBayar = total - diskonRp;

    printf("\n===== STRUK BELANJA =====\n");
    printf("Nama Barang        : %s\n", nama);
    printf("Harga Satuan       : %d\n", harga);
    printf("Jumlah Beli        : %d\n", jumlah);
    printf("Total Harga        : %d\n", total);
    printf("Minimal Diskon     : %d\n", minimal);
    printf("Diskon (%%)         : %d\n", diskonPersen);
    printf("Diskon (Rp)        : %d\n", diskonRp);
    printf("Total Bayar        : %d\n", totalBayar);
    printf("=========================\n");

    return 0;
}