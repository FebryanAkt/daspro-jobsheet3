import java.util.Scanner;

public class GajiKaryawan10 {
    public static void main(String[] args) {
        
        //deklarasi scanner dan variabel
        Scanner sc = new Scanner(System.in);
        float jamKerja, upahPerJam, gajiTotal, potonganPajak, bonus, gajiKotor;
        
        // masukkan
        System.out.print("Jam kerja karyawan: ");
        jamKerja = sc.nextFloat();
        System.out.print("Upah kerja karyawan: RP ");
        upahPerJam = sc.nextFloat();

        //gaji, pajak, bonus
        gajiKotor = jamKerja * upahPerJam;
        bonus = upahPerJam * 10/100;
        gajiTotal = (jamKerja * 10/100) + (upahPerJam * 10/100);
        potonganPajak = gajiTotal * 5/100;

        //tampilan nilai akhir
        System.out.println("Gaji kotor: " + gajiKotor);
        System.out.println("Jumlah bonus: " + bonus);
        System.out.println("Jumlah pajak: " + potonganPajak);
        System.out.println("Gaji bersih: " + gajiTotal);
    
    
    }
}
