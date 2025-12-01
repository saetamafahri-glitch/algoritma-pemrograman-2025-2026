#include <iostream>
#include <string>

using namespace std;

// Fungsi sederhana untuk format saldo
string formatSaldo(int saldo) {
    string num = to_string(saldo);
    string result = "Rp ";
    int len = num.length();
    for (int i = 0; i < len; ++i) {
        if (i > 0 && (len - i) % 3 == 0) {
            result += ".";
        }
        result += num[i];
    }
    return result;
}

int main() {
    // Input nama
    string nama;
    cout << "Masukkan nama Anda: ";
    getline(cin, nama);

    // Input NIM
    int saldo;
    cout << "Masukkan NIM (angka positif): ";
    cin >> saldo;
    if (saldo <= 0) {
        cout << "NIM harus angka positif. Program berhenti." << endl;
        return 1;
    }
    cin.ignore();  // Bersihkan input

    // Tampilkan nama dan saldo
    cout << "\nNama: " << nama << endl;
    cout << "Saldo awal: " << formatSaldo(saldo) << endl;

    // Menu ATM
    while (true) {
        cout << "\n===== MENU ATM =====" << endl;
        cout << "1. Cek Saldo" << endl;
        cout << "2. Tarik Tunai" << endl;
        cout << "3. Setor Tunai" << endl;
        cout << "4. Transfer" << endl;
        cout << "5. Keluar" << endl;
        cout << "Pilih menu: ";
        int pilihan;
        cin >> pilihan;
        cin.ignore();

        if (pilihan == 1) {
            cout << "Saldo Anda: " << formatSaldo(saldo) << endl;
        } else if (pilihan == 2) {
            cout << "Masukkan jumlah tarik tunai: ";
            int jumlah;
            cin >> jumlah;
            cin.ignore();
            if (jumlah <= 0) {
                cout << "Jumlah harus positif." << endl;
            } else if (jumlah > saldo) {
                cout << "Saldo tidak cukup." << endl;
            } else {
                saldo -= jumlah;
                cout << "Tarik tunai berhasil. Saldo Anda sekarang: " << formatSaldo(saldo) << endl;
            }
        } else if (pilihan == 3) {
            cout << "Masukkan jumlah setor tunai: ";
            int jumlah;
            cin >> jumlah;
            cin.ignore();
            if (jumlah <= 0) {
                cout << "Jumlah harus positif." << endl;
            } else {
                saldo += jumlah;
                cout << "Setor tunai berhasil. Saldo Anda sekarang: " << formatSaldo(saldo) << endl;
            }
        } else if (pilihan == 4) {
            cout << "Masukkan rekening tujuan: ";
            string rekening;
            getline(cin, rekening);
            if (rekening.empty()) {
                cout << "Rekening tujuan tidak boleh kosong." << endl;
            } else {
                cout << "Masukkan jumlah transfer: ";
                int jumlah;
                cin >> jumlah;
                cin.ignore();
                if (jumlah <= 0) {
                    cout << "Jumlah harus positif." << endl;
                } else if (jumlah > saldo) {
                    cout << "Saldo tidak cukup." << endl;
                } else {
                    saldo -= jumlah;
                    cout << "Transfer ke " << rekening << " berhasil. Saldo Anda sekarang: " << formatSaldo(saldo) << endl;
                }
            }
        } else if (pilihan == 5) {
            cout << "Terima kasih telah menggunakan ATM." << endl;
            return 0;
        } else {
            cout << "Pilihan tidak valid." << endl;
        }
    }

    return 0;
}
