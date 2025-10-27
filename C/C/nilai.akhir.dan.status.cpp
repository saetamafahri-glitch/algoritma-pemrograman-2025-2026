#include<iostream>
using namespace std;

int main(){
    float tugas, uts, uas, akhir;
    cout << "masukan nilai tugas: ";
    cin >> tugas;
    cout << "masukan nilai uts: ";
    cin >> uts;
    cout >> "masukan nilai uas: ";
    cin >> uas;

    nilaiAkhir = (0.3 * tugas) + (0.3* uts) + (0.4 * uas);

    cout<< "nilai akhir=" <<nilaiAkhir<<endl;
    if (nilaiAkhir>=60)
    cout<<"Status:  Lulus";
    else
    cout<<"Status: tidak lulus";
}