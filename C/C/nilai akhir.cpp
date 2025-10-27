#include<iostream>
using namespace std;

int main(){
    float tugas, uts, uas, akhir;
    cout << "masukan nilai tugas: ";
    cin >> tugas;
    cout << "masukan nilai uts: ";
    cin >> uts;
    cout << "masukan nilai uas: ";
    cin >> uas;

    akhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);

    cout << "nilai akhir=" << akhir << endl;
    if (akhir >= 60) {
        cout << "Status: Lulus" << endl;
    } else {
        cout << "Status: tidak lulus" << endl;
    }
    return 0;
}
