package interfac;

//抽象类用于约束子类
public abstract class Phone {
    //抽象类中的方法，用abstract修饰后，子类必须要有该方法，不需要有方法体，具体的方法在子类中去实现
    //手机都有打电话和发短信的功能
    public abstract void call();

    public abstract void message();

    //抽象类中可以有普通方法，即不用abstract关键字修饰，普通方法需要有方法体
    public void game() {
        System.out.println("抽象父类Phone，手机有玩游戏的功能");
    }
}
