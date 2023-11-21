import java.util.Scanner;

public class UcapanTerimaKasih_18_1 {
    private static Scanner input18 = new Scanner(System.in);

    public static String PenerimaUcapan() {
        System.out.print("\nTuliskan nama orang yang ingin anda beri ucapan : ");
        return  input18.nextLine();
    
    }

    public static void UcapanTerimaKasih(String nama) {
        
        System.out.println("\nThank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.\n");
    }

    public static void UcapanTambahan(String nama) {
        
        System.out.println("I'm really sorry for you " + nama + ", maybe i made a mistakes or i do anything wrong, i'm so sorry\n");
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        UcapanTerimaKasih(nama);
        UcapanTambahan(nama);

        input18.close();
    }
}
