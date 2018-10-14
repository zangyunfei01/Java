package innerclass.pet;

public class Pet {

    public static void main(String[] args) {
        new Pet().test1("cat");
        //test2方法到这里是实现了接口，并没有调用接口中的方法，相当于test1中的PetWantToDo petWantToDo = new PetWantToDo()，
        //而test1中的写法，是实现了接口并同时调用了接口中的两个方法，所以调用test1，接口中的两个方法会同时调用
        new Pet().test2("dunk");
        new Pet().test2("dog").sleep();
    }

    public void test1(String pet) {
        PetWantToDo petWantToDo = new PetWantToDo() {
            @Override
            public void sleep() {
                System.out.println("test1 " + pet + " want to sleep");
            }

            @Override
            public void eat() {
                System.out.println("test1 " + pet + " want to eat");
            }
        };
        petWantToDo.eat();
        petWantToDo.sleep();
    }

    public PetWantToDo test2 (String pet){

        return new PetWantToDo() {
            @Override
            public void sleep() {
                System.out.println("test2 " + pet + " want to sleep");
            }

            @Override
            public void eat() {
                System.out.println("test2 " + pet + " want to sleep");
            }
        };
    }

}

