# Fungsi untuk memformat saldo
def format_saldo(saldo):
    return f"Rp {saldo:,}".replace(",", ".")

# Loop untuk meminta nama
nama = ""
konfirmasi = False
while not konfirmasi:
    nama = input("Masukkan nama Anda: ").strip()
    jawab = input("Apakah nama Anda benar? (y/n): ").strip().lower()
    if jawab == 'y':
        konfirmasi = True
    else:
        print("Silakan masukkan nama kembali.")

# Input NIM dan konversi ke saldo
nim = input("Masukkan NIM (tanpa huruf): ").strip()
saldo = int(nim)

# Tampilkan nama dan saldo awal
print(f"\nNama: {nama}")
print(f"Saldo awal: {format_saldo(saldo)}")

# Menu ATM (menggunakan if-elif sebagai equivalent switch-case)
while True:
    print("\n===== MENU ATM =====")
    print("1. Cek Saldo")
    print("2. Tarik Tunai")
    print("3. Setor Tunai")
    print("4. Transfer")
    print("5. Keluar")
    pilihan = input("Pilih menu: ").strip()

    if pilihan == '1':
        print(f"Saldo Anda: {format_saldo(saldo)}")
    elif pilihan == '2':
        jumlah = int(input("Masukkan jumlah tarik tunai: "))
        if jumlah > saldo:
            print("Saldo tidak cukup.")
        else:
            saldo -= jumlah
            print(f"Tarik tunai berhasil. Saldo Anda sekarang: {format_saldo(saldo)}")
    elif pilihan == '3':
        jumlah = int(input("Masukkan jumlah setor tunai: "))
        saldo += jumlah
        print(f"Setor tunai berhasil. Saldo Anda sekarang: {format_saldo(saldo)}")
    elif pilihan == '4':
        rekening = input("Masukkan rekening tujuan: ").strip()
        jumlah = int(input("Masukkan jumlah transfer: "))
        if jumlah > saldo:
            print("Saldo tidak cukup.")
        else:
            saldo -= jumlah
            print(f"Transfer ke {rekening} berhasil. Saldo Anda sekarang: {format_saldo(saldo)}")
    elif pilihan == '5':
        print("Terima kasih telah menggunakan ATM.")
        break
    else:
        print("Pilihan tidak valid.")