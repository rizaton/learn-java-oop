package coding.rizaton.application;

import coding.rizaton.data.Animal;
import coding.rizaton.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
