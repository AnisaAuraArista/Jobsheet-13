import java.util.Scanner;
public class Tugas04 {

      static int jumlahRekursif(int[] data, int n) {
        if (n == 0) {
            return 0;  
        } else {
            return data[n - 1] + jumlahRekursif(data, n - 1); 
        }
    }
    
    static int jumlahIteratif(int[] data, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += data[i];
        }
        return total;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();
        int[] angka = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int hasilRekursif = jumlahRekursif(angka, N);
        int hasilIteratif = jumlahIteratif(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + hasilIteratif);
        System.out.println("(Hasil Rekursif: " + hasilRekursif + ")");
        sc.close();
    } 
}
