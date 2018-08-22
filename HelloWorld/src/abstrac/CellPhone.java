package abstrac;

//新建CellPhone类，继承Phone类。Phone类是抽象类，所以子类中必须要重写抽象类中所有抽象方法，普通方法可以不重写
public class CellPhone extends Phone {
    @Override
    public void call() {
        System.out.println("子类CellPhone，重写Phone类中抽象方法call()");
    }

    @Override
    public void message() {
        System.out.println("子类CellPhone，重写Phone类中抽象方法call()");
    }
}
