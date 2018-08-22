package interfac;

//新建SmartPhone类，通过extends继承Phone类。Phone类是抽象类，所以子类中必须要重写抽象类中所有抽象方法，普通方法可以不重写
public class SmartPhone extends Phone implements ICommonMethod {
    @Override
    public void call() {
        System.out.println("子类SmartPhone，重写Phone类中抽象方法call()");
    }

    @Override
    public void message() {
        System.out.println("子类SmartPhone，重写Phone类中抽象方法message()");
    }

    //这里用到了接口，接口是抽象的，继承接口的时候，一定要重写接口所有的方法。
    //开始接口里只写了一个方法，所以这里重写了一个方法。
    //然后我再在接口里新增了一个方法，此时类名一行会报错，提示要么把SmartPhone携程抽象类，要么把接口中另一个方法也得重写。
    @Override
    public void playGame() {
        System.out.println("SmartPhone类重写接口的playGame方法");
    }

    @Override
    public void watchVideo() {
        System.out.println("SmartPhone类重写接口的watchVideo方法");

    }
}
