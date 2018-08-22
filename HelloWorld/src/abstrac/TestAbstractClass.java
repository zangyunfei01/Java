package abstrac;

//新建一个测试类，调用其他类的方法
public class TestAbstractClass {
    public static void main(String[] args) {
        //我这里想写个Phone phone1 = new Phone();但是编译器告诉我Phone是抽象类，抽象类是无法被实例化的，所以不能这样写。
        //如果非要这样写的话Phone（）后面是要加方法体的，而且必须重写所有的抽象方法，并在方法体后面以；结束
        //抽象类包含子类的属性和方法，具体要在子类中去实现的，所以这里实例化用的是抽象类的父类引用，指向一个子类对象
        //到这里，也就明白了抽象类的第五点：抽象类不能直接创建，通常是定义引用变量，指向子类对象
        Phone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.message();
        smartPhone.game();

        Phone cellPhone = new CellPhone();
        cellPhone.call();
        cellPhone.message();
        cellPhone.game();

        Phone phone = new Phone() {
            @Override
            public void call() {
                System.out.println("这里也是匿名内部类的使用");
            }

            @Override
            public void message() {
                System.out.println("这也是");
            }
        };
        phone.call();
        phone.message();


        //匿名内部类我理解是帮助接口和抽象类假性实例化，这样就可以用他们的方法了
        //抽象类中可以有普通的方法，所以这里虽然没有重写，但是也可以用抽象类中的game()方法
        new Phone(){
            @Override
            public void call() {
                System.out.println("这也是");
            }

            @Override
            public void message() {
                System.out.println("这也是");
            }
        }.game();
    }
}
