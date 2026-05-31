import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class AsalCarpanlar {
    public static void main(String[] args) {

    }

    // Asal çarpanları bulan metod
    public static List<Integer> AsalCarpanlariBul(int sayi) {
        List<Integer> asalCarpanlar = new ArrayList<>();

        // 2 ile başla,çünkü 2 en küçük asal sayıdır
        while (sayi % 2 == 0) {
            asalCarpanlar.add(2);
            sayi /= 2;
        }
        // 3'ten başlayarak tek sayılarla devam et
        for (int i = 3; i <= Math.sqrt(sayi); i += 2) {
            while (sayi % i == 0) {
                asalCarpanlar.add(i);
                sayi /= i;
            }
        }
        // Eğer sayi hala büyük bir asal sayıysa,onu ekle
        if (sayi > 2) {
            asalCarpanlar.add(sayi);
        }

        return asalCarpanlar;
    }

    public static void add(int i) {
    }

    public Object getAsalCarpanlar() {
        List<Integer> AsalCarpanlar = null;
        List<Integer> asalCarpanlar = AsalCarpanlar;
        return asalCarpanlar;

        // Örnek bir sayı
    }
    System.out.println(ss )

}



