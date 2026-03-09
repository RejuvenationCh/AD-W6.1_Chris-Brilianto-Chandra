public class Animal {
    void sound() {
    System.out.println("Some animal sound");
    }
}

 class Cat extends Animal {
    @Override
    void sound() {
    System.out.println("Meow");
}
}
