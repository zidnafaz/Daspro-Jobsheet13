import java.util.Scanner;

public class UcapanTerimaKasih_18 {

    public static String PenerimaUcapan() {
        Scanner input18 = new Scanner(System.in);
        System.out.print("\nTuliskan nama orang yang ingin anda beri ucapan : ");
        String namaOrang = input18.nextLine();
        input18.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("\nThank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.\n");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
