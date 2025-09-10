public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Iza";
        manager.sayHello("Tony");

        var vicePresident = new VicePresident();
        vicePresident.name = "John";
        vicePresident.sayHello("Jane");
    }
}
