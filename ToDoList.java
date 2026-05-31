import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- TO-DO LIST ---");
            System.out.println("1. Görev Ekle");
            System.out.println("2. Görevleri Listele");
            System.out.println("3. Görev Sil");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Yeni görevi girin: ");
                    String task = input.nextLine();
                    tasks.add(task);
                    System.out.println("Görev eklendi!");
                    break;
                case 2:
                    System.out.println("\nGörevleriniz:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i+1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Silmek istediğiniz görevin numarasını girin: ");
                    int index = input.nextInt();
                    input.nextLine();
                    if(index > 0 && index <= tasks.size()) {
                        tasks.remove(index-1);
                        System.out.println("Görev silindi!");
                    } else {
                        System.out.println("Geçersiz numara.");
                    }
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        } while(choice != 4);

        input.close();
    }
}