<?php
$nama = readline("Nama barang: ");
$harga = intval(readline("Harga barang: "));
$jumlah = intval(readline("Jumlah barang: "));
$nim3 = intval(readline("3 angka terakhir NIM: "));
$nim1 = intval(readline("1 angka terakhir NIM: "));

$minimal = $nim3 * 100;
$total = $harga * $jumlah;
$diskonPersen = $nim1;

if ($total < $minimal) {
    $diskonPersen = 0;
}

$diskonRp = $total * ($diskonPersen / 100);
$totalBayar = $total - $diskonRp;

echo "\n===== STRUK BELANJA =====\n";
echo "Nama Barang        : $nama\n";
echo "Harga Satuan       : $harga\n";
echo "Jumlah Beli        : $jumlah\n";
echo "Total Harga        : $total\n";
echo "Minimal Diskon     : $minimal\n";
echo "Diskon (%)         : $diskonPersen\n";
echo "Diskon (Rp)        : $diskonRp\n";
echo "Total Bayar        : $totalBayar\n";
echo "=========================\n";
?>
