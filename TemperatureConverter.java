import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            TemperatureConverter convert = new TemperatureConverter();
        System.out.print("Bir sıcaklık değeri girin: ");
        double degree = input.nextDouble();

        System.out.println("Seçiminizi yapın:");
        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        int choice = input.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = convert.toFahrenheit(degree);
                System.out.println(degree + "°C = " + result + "°F");
                break;
            case 2:
                result = convert.toCelsius(degree);
                System.out.println(degree + "°F = " + result + "°C");
                break;
            default:
                System.out.println("Geçersiz seçim!");
        }
    }
        public double toFahrenheit ( double celsius){
            return celsius * 9 / 5.0 + 32;
        }

        public  double toCelsius ( double fahrenheit){
            return (fahrenheit - 32) * 5 / 9;
        }
    }


