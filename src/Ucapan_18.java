import java.util.Scanner;

public class Ucapan_18 {
    
    public static String PenerimaUcapan() {
        Scanner input18 = new Scanner(System.in);
        System.out.print("\nTuliskan nama orang yang ingin anda beri ucapan : ");
        String namaOrang = input18.nextLine();
        input18.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("\nThank you " + nama + "\nMay the force be with you\n");
    }
}
