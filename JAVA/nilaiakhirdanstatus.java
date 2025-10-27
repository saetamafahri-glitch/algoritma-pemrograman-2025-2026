import java.util.Scanner;
import java.util.scanner;

public class main{
    public static void main(string[]args){
        Scanner sc = new scanner(system.in);
        system.out.print("masukan nilai tugas:");
        doubble tugas = sc.nextDouble();
        system.out.print("masukan nilai uts:");
        double uts = sc.nextDouble();
        System.out.print("masukan nilai uas:");
        double uas = sc.nextDouble();

        double nilaiAkhir = (0.3 * tugas) + (0.35 * uts) + (0.35 * uas);
        system.out.println("nilai akhir= " + nilaiAkhir);
        if(nilaiakhir>=60)
        system.out.println("status: LULUS");
        else
        system.out.println("status: TIDAK LULUS");
    }
}