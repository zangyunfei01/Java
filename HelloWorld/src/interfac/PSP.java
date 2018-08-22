package interfac;
//PSP不是Phone的子类，这里直接继承接口，实现接口的所有抽象方法
public class PSP implements ICommonMethod {

    @Override
    public void playGame() {
        System.out.println("PSP类重写接口的playGame方法");
    }

    @Override
    public void watchVideo() {
        System.out.println("PSP类重写接口的playGame方法");
    }
}
