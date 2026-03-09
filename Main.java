

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        v1.move();
        v2.move();

        Employee e = new Programmer();
        e.work();
        e.attendMeeting();
    }
}