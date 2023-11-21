import java.util.Scanner;

public class Percobaan618 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("\nMasukkan panjang : ");
        p = input18.nextInt();
        System.out.print("Masukkan lebar   : ");
        l = input18.nextInt();
        System.out.print("Masukkan tinggi  : ");
        t = input18.nextInt();

        L = HitungLuas(p, l);
        System.out.println("\nLuas persegi panjang adalah " + L);

        vol = HitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);

    }

    static int HitungLuas(int panjang, int lebar) {
        int Luas = panjang * lebar;
        return Luas;
    }

    static int HitungVolume(int tinggi, int a, int b) {
        int volume = HitungLuas(a,b) * tinggi;
        return volume;
    }
}
