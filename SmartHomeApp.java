class Device {
    private String brand;
    private double powerConsumption;
    private boolean isOn;

    public Device(String brand, double powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
     }

    @Override
    public String toString() {
        String status = isOn ? "AÇIK" : "KAPALI";
        return brand + " [" + status + "] - Tüketim: " + powerConsumption + "W";
    }
}
class Television extends Device {
    private int volume;

    public Television(String brand, double powerConsumption) {
        super(brand, powerConsumption);
        this.volume = 10;
    }

    public void volumeUp() {
        volume++; }
    @Override
    public String toString() {
        return super.toString() + " | Ses Seviyesi: " + volume;
    }
}
class SmartLight extends Device {
    private int brightness;

    public SmartLight(String brand, double powerConsumption) {
        super(brand, powerConsumption);
        this.brightness = 100;
    }

    public void dim(int amount) {
        brightness -= amount;
        if (brightness < 0) brightness = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Parlaklık: %" + brightness;
    }
}
public class SmartHomeApp {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 150.0);
        SmartLight light = new SmartLight("Philips Hue", 9.5);

        System.out.println("--- Başlangıç Durumu ---");
        System.out.println(tv);
        System.out.println(light);

        System.out.println("--- İşlemler Yapılıyor ---");
        tv.turnOn();
        tv.volumeUp();
        light.turnOn();
        light.dim(30);

        System.out.println("--- Son Durum ---");
        System.out.println(tv);
        System.out.println(light);
    }
}