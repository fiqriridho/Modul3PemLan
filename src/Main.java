import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = input.nextInt();

        double[] nilai = new double[jumlah];
        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }

        double rataRata = total / jumlah;

        System.out.println("\nHasil Perhitungan");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }
        if (rataRata <= 60){
            System.out.println("\nBelajar lagi dek");
        }else if (rataRata <=79){
            System.out.println("\nWow kamu sedikit keren, belajar lebih giat yaa! ");
        }else {
            System.out.println("\nKAMU KEREN BRO!!!!");
        }

        System.out.println("\nRata-rata   : " + rataRata);

        input.close();
    }
}
