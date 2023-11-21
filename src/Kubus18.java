import java.util.Scanner;

public class Kubus18 {

    public static int InputSisi() {
        Scanner input18 = new Scanner(System.in);
        System.out.print("\nMasukkan panjang sisi kubus   : ");
        int sisi = input18.nextInt();
        return sisi;
    }

    public static int HitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int HitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        int sisiKubus = InputSisi();
        int volumeKubus = HitungVolume(sisiKubus);
        int luasPermukaanKubus = HitungLuasPermukaan(sisiKubus);

        System.out.println("\nVolume kubus                  : " + volumeKubus);
        System.out.println("Luas permukaan kubus          : " + luasPermukaanKubus);
    }
}
