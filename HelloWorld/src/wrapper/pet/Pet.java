package wrapper.pet;

public class Pet {
    public PetWantToDo test(String pet) {
        //接口不能实例化，用匿名内部类的方式实现接口
        return new PetWantToDo() {
            @Override
            public void sleep() {
                System.out.println(pet + " want to sleep");
            }

            @Override
            public void eat() {
                System.out.println(pet + "want to eat");
            }
        };
    }



    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.test("dog").sleep();
        pet.test("dog").eat();
    }


    public PetWantToDo test2(String pet){
        return new PetWantToDo() {
            @Override
            public void sleep() {
                System.out.println(pet + "want to eat");
            }

            @Override
            public void eat() {
                System.out.println(pet + "want to eat");
            }
        };
    }
}
