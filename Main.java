

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Print Nomor 1
        System.out.println("Animal and Cat:");
        Animal a = new Cat();
        a.sound();
        System.out.println();

        // Print Nomor 2
        System.out.println("Vehicle and Car:");
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        v1.move();
        v2.move();
        System.out.println();

        // Print Nomor 3
        System.out.println("Employee and Programmer:");
        Employee e = new Programmer();
        e.work();
        e.attendMeeting();
        System.out.println();
    }
}