import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] notlar = new int[5];
        int girilen = 0;
        int not;
        do {
            System.out.print("Not gir (çıkmak için -1): ");
            not = input.nextInt();
            if (not == -1) {
                break;
            }
            if (not >= 0 && not <= 100) {
                notlar[girilen] = not;
                girilen++;
            } else {
                System.out.println("Geçersiz not!");
            }
        } while (girilen < 5);
        double ort = ortalamaHesapla(notlar, girilen);
        System.out.println("Ortalama: " + ort);
        if (ort >= 60) {
            System.out.println("Durum: Geçti");
        } else {
            System.out.println("Durum: Kaldı");
        }
        System.out.println("Harf Notu: " + harfNotu(ort));
        System.out.print("Kaçıncı notu güncellemek istiyorsun? (1-" + girilen + "): ");
        int index = input.nextInt();
        if (index >= 1 && index <= girilen) {
            System.out.print("Yeni notu gir: ");
            int yeniNot = input.nextInt();
            notlar[index - 1] = yeniNot;
        }
        System.out.println("Güncel Notlar:");
        for (int i = 0; i < girilen; i++) {
            System.out.print(notlar[i] + " ");
        }
    }
    public static double ortalamaHesapla(int[] notlar, int adet) {
        int sum = 0;
        for (int i = 0; i < adet; i++) {
            sum += notlar[i];
        }
        return (double) sum / adet;
    }

    public static String harfNotu(double ort) {
        if (ort >= 85) return "AA";
        else if (ort >= 70) return "BB";
        else if (ort >= 50) return "CC";
        else return "FF";
    }
}
