package interfac;

//新建一个测试类，调用其他类的方法
public class TestInterface {
    public static void main(String[] args) {
        ICommonMethod smartPhone = new SmartPhone();
        smartPhone.playGame();
        smartPhone.watchVideo();

        ICommonMethod psp = new PSP();
        psp.playGame();
        psp.watchVideo();

        //接口和匿名内部类一起使用
        //接口无法实例化，系统自动帮我们创建了一个类，只是类名在代码里是隐藏的，所以称为匿名。而匿名，指的就是隐藏了类名。
        //这里直接用new关键字创建了一个对象，这个对象就是匿名内部类创建的对象。
        new ICommonMethod() {
            @Override
            public void playGame() {
                System.out.println("匿名内部类中重写ICommenMethod接口的playGame()方法，并直接调用");
            }

            @Override
            public void watchVideo() {
                System.out.println("匿名内部类中重写ICommenMethod接口的watchVideo()方法");
            }
        }.playGame();

        //另一种写法
        ICommonMethod iCommonMethod = new ICommonMethod() {
            @Override
            public void playGame() {
                System.out.println("匿名内部类中重写ICommenMethod接口的playGame()方法");
            }

            @Override
            public void watchVideo() {
                System.out.println("匿名内部类中重写ICommenMethod接口的watchVideo()方法");
            }
        };
        iCommonMethod.watchVideo();
    }
}
