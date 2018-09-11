package innerclass;

import sun.reflect.generics.tree.VoidDescriptor;

public class Animal {
    private String animalName = "dog";
    private static final String NAME = "cat";

    public void getName(){
        int a = 1;
        class Mouse{
            private int A = 2;

            void get(){
                System.out.println(a);
            }
        }
        Mouse mouse = new Mouse();
        System.out.println();
        mouse.get();
    }

    class Dog {
        private String animalName = "dog";
        public void getName(){
            //内部类可以直接用外部类的
            System.out.println(animalName);
            System.out.println(NAME);
        }
    }

    static class Cat{
        private String animalName = "cat";
        private static int age = 3;
        public void getName(){
            System.out.println(animalName);
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = animal.new Dog();

        Animal.Cat cat = new Animal.Cat();

    }
}
