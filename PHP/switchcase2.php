<?php
// Fungsi untuk memformat saldo
function formatSaldo($saldo) {
    return "Rp " . number_format($saldo, 0, ',', '.');
}

// Input nama
echo "Masukkan nama Anda: ";
$nama = trim(fgets(STDIN));

// Input NIM
echo "Masukkan NIM (tanpa huruf): ";
$nim = trim(fgets(STDIN));
if (!is_numeric($nim) || (int)$nim <= 0) {
    echo "NIM harus angka positif. Program berhenti.\n";
    exit();
}
$saldo = (int)$nim;

// Tampilkan nama dan saldo
echo "\nNama: $nama\n";
echo "Saldo awal: " . formatSaldo($saldo) . "\n";

// Menu ATM
while (true) {
    echo "\n===== MENU ATM =====\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    echo "Pilih menu: ";
    $pilihan = trim(fgets(STDIN));

    switch ($pilihan) {
        case '1':
            echo "Saldo Anda: " . formatSaldo($saldo) . "\n";
            break;
        case '2':
            echo "Masukkan jumlah tarik tunai: ";
            $jumlah = (int)trim(fgets(STDIN));
            if ($jumlah <= 0) {
                echo "Jumlah harus positif.\n";
            } elseif ($jumlah > $saldo) {
                echo "Saldo tidak cukup.\n";
            } else {
                $saldo -= $jumlah;
                echo "Tarik tunai berhasil. Saldo Anda sekarang: " . formatSaldo($saldo) . "\n";
            }
            break;
        case '3':
            echo "Masukkan jumlah setor tunai: ";
            $jumlah = (int)trim(fgets(STDIN));
            if ($jumlah <= 0) {
                echo "Jumlah harus positif.\n";
            } else {
                $saldo += $jumlah;
                echo "Setor tunai berhasil. Saldo Anda sekarang: " . formatSaldo($saldo) . "\n";
            }
            break;
        case '4':
            echo "Masukkan rekening tujuan: ";
            $rekening = trim(fgets(STDIN));
            if (empty($rekening)) {
                echo "Rekening tujuan tidak boleh kosong.\n";
                break;
            }
            echo "Masukkan jumlah transfer: ";
            $jumlah = (int)trim(fgets(STDIN));
            if ($jumlah <= 0) {
                echo "Jumlah harus positif.\n";
            } elseif ($jumlah > $saldo) {
                echo "Saldo tidak cukup.\n";
            } else {
                $saldo -= $jumlah;
                echo "Transfer ke $rekening berhasil. Saldo Anda sekarang: " . formatSaldo($saldo) . "\n";
            }
            break;
        case '5':
            echo "Terima kasih telah menggunakan ATM.\n";
            exit();
        default:
            echo "Pilihan tidak valid.\n";
    }
}
?>
