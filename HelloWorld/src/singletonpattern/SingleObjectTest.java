package singletonpattern;

public class SingleObjectTest {

    public static void main(String[] args) {

        //SingleObject类的构造方法是私有的，所以不能在其他类实例化：'SingleObject()' has private access in 'singletonpattern.SingleObject'
        //SingleObject singleObject = new SingleObject();

        //想要用SingleObject类的方法，需要调用SingleObject类的getInstance()方法，来返回一个SingObject类的实例
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.sayHello();
    }
}
