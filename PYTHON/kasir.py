nama = input("Nama barang: ")
harga = int(input("Harga barang: "))
jumlah = int(input("Jumlah barang: "))
nim3 = int(input("3 angka terakhir NIM: "))
nim1 = int(input("1 angka terakhir NIM: "))

minimal = nim3 * 100
total = harga * jumlah
diskon_persen = nim1

if total < minimal:
    diskon_persen = 0

diskon_rp = total * (diskon_persen / 100)
total_bayar = total - diskon_rp

print("\n===== STRUK BELANJA =====")
print("Nama Barang        :", nama)
print("Harga Satuan       :", harga)
print("Jumlah Beli        :", jumlah)
print("Total Harga        :", total)
print("Minimal Diskon     :", minimal)
print("Diskon (%)         :", diskon_persen)
print("Diskon (Rp)        :", int(diskon_rp))
print("Total Bayar        :", int(total_bayar))
print("=========================")
