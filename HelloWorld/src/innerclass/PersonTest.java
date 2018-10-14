package innerclass;

public class PersonTest {
    public static void main(String[] args) {

        //内部类隐藏在外部类里面，先初始化外部类，然后通过外部类去初始化内部类
        Person person = new Person();
        person.age = 12;

        //初始化内部类，获取内部类的实例
        Person.Heart heart = person.new Heart();
        Person.Heart heart2 = new Person().new Heart();
        //通常会给内部类准备一个get方法，在get方法内对内部类进行初始化
        //person.getHeart()是无返回值的，而给变量heart3赋值是需要返回值的，所以会这里直接用person.getHeart()方法会报错
        //Student.Heart heart3 = person.getHeart();

        Person.Heart heart4 = person.getHeart2();
        System.out.println(heart4.beat());
        System.out.println(person.getHeart2().beat());
        Person.Heart heart5 = person.getHeart3();
        System.out.println(heart5.beat());

    }
}
