import java.util.*;
public class PerformanceTest {
    public static void main(String[] args) {
        int size = 100_000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            arrayList.add(size / 2, 99);
        long end = System.nanoTime();
        System.out.println("ArrayList ortaya ekleme:   " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            linkedList.add(size / 2, 99);
        end = System.nanoTime();
        System.out.println("LinkedList ortaya ekleme:  " + (end - start) / 1_000_000 + " ms");

        // 2. RASTGELE ERİŞİM
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            arrayList.get(size / 2);
        end = System.nanoTime();
        System.out.println("\nArrayList rastgele erişim:  " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            linkedList.get(size / 2);
        end = System.nanoTime();
        System.out.println("LinkedList rastgele erişim: " + (end - start) / 1_000_000 + " ms");
    }
}