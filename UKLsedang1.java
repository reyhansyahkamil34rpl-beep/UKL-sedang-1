import java.util.Scanner;

public class UKLsedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Bilangan;
        int Faktorial =1;

        System.out.println("Masukkan sebuah bilangan bulat: ");
        Bilangan = input.nextInt();

        // Cek apakah bilangan yang dimasukkan non-negatif
        if (Bilangan < 0)
            System.out.println("Tidak dapat menghitung faktorial");
            else {
                // Hitung faktorial menggunakan perulangan for
                for (int i = 1 ; i <= Bilangan; i++) {
                    Faktorial *= i;
                // Menampilkan proses perkalian
                    if (i < Bilangan) {
                        System.out.print(i + " x ");
                    } else {
                        System.out.print(i + " = ");
                    }

                }
                System.out.println("Faktorial dari " + Bilangan + " adalah: " + Faktorial);
            }

        input.close();
    }
}