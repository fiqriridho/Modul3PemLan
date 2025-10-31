import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah nilai: ");
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

        System.out.println("ahahahaahhahah");
//        public void hitungDiskonTambahan() {
//            if (getStok() > 100) {
//                double hargaBaru = getHarga() * 0.9;
//                System.out.println("Diskon tambahan 10%! Harga baru: Rp. " + hargaBaru);
//            } else {
//                System.out.println("Tidak ada diskon tambahan.");
//            }
//        }

    }
}
