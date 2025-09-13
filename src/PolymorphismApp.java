public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Tony");
        employee.sayHello("Iza");

        employee = new Manager("Riza");
        employee.sayHello("Michael");

        employee = new VicePresident("John");
        employee.sayHello("Jane");

        sayHello(new Employee("Tony"));
        sayHello(new Manager("Riza"));
        sayHello(new VicePresident("John"));

    }
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
