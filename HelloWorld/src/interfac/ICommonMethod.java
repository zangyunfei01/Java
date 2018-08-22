package interfac;

//接口，可以理解为比抽象类更抽象的类。
//SmartPhone类不但可以打电话，发短信，还可以玩游戏，这是CellPhone所不具备的功能，同时又是PSP具有的功能。
//而PSP又不属于Phone类的子类，所以可以把玩游戏和看电视抽象出来写成一个ICommonMethod的接口，这样即使不同类也能通过implements继承接口来调用不同类间共有的方法
//接口其实隐式的用了abstract修饰，当然也可以显示的加上，public abstract interface ICommonMethod{}，一般是不加的
public interface ICommonMethod {
   //接口中的方法也都是抽象方法，系统默认加了abstract关键字，手动加上也是可以的，一般是不加的
    public abstract void playGame();

    public  void watchVideo();
}
