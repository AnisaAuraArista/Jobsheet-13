import java.util.Scanner;
public class MenghitungPangkat04 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;   
        } else {
            return x * hitungPangkat(x, y - 1);  
        }
    }
     static void cetakDeretPangkat(int x, int y) {
        System.out.print("Deret: ");
        for (int i = 0; i < y; i++) {
            if (i == y - 1)
                System.out.print(x + "x1");   
            else
                System.out.print(x + "x");
        }
        System.out.println();
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        cetakDeretPangkat(bilangan, pangkat);
        System.out.println(" hasil: "+hitungPangkat(bilangan, pangkat));
        sc.close();
    }
}
