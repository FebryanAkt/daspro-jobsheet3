import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        //deklarasi scanner dan variabel
        Scanner sc = new Scanner(System.in);
        double jamKerja, upahPerJam;
        double totalGajiKaryawan;

        //masukkan
        System.out.print("Jam kerja karyawan: ");
        jamKerja = sc.nextInt();
        System.out.print("Upah kerja karyawan: ");
        upahPerJam = sc.nextInt();

        //total gaji
        totalGajiKaryawan = (jamKerja * 10/100 + upahPerJam * 10/100) / 5/100;
        
        //tampilkan nilai akhir
        System.out.println("Gaji total karyawan: " + totalGajiKaryawan);
    }
}
