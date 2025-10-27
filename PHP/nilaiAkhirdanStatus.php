<?php
$tugas = readline("Masukan nilai tugas: ");
$uts = readline("masukan nilai UTS: ");
$uas = readline("masukan nilai UAS: ");

$nilaiAkhir = (0.3 * $tugas) + (0.3 * $uts) + (0.4 * $uas);

echo "Nilai AKhir = $nilaiAkhir\n";
if ($nilaiAkhir >= 60)
    echo "Status = Lulus\n";
else
    echo "Status = tidak lulus\n";
?>