package object;

public class toStringTest {

    public static void main(String[] args) {
        Dog dog = new Dog("buddy",2);
        System.out.println(dog);
        System.out.println(dog.age);
        System.out.println(dog.toString());
    }
}
