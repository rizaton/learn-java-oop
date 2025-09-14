package coding.rizaton.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
