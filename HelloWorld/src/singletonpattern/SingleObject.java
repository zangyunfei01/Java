package singletonpattern;

public class SingleObject {

    //构造方法设为私有，这样SingleObject类就无法在其他类中被实例化
    private SingleObject() {
    }

    //创建一个SingleObject类的静态私有实例对象
    private static SingleObject instance = new SingleObject();

    //创建一个公共的静态方法，获取SingleObject类的唯一对象
    public static SingleObject getInstance() {
        return new SingleObject();
    }

    public void sayHello(){
        System.out.println("Hello,单例模式已创建完成");
    }

}
