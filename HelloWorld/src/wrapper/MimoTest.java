package wrapper;

public class MimoTest {
    public static void main(String[] args) {
        Mimo Mimo = new Mimo();
        System.out.println("Mimo的名字："+Mimo.name);
        System.out.println("Mimo的年龄："+Mimo.month);
        //与month不同的是，month2是Integer类型，Integer类和String类一样是对象，所以输出的默认值不再是0而是null
        System.out.println("Mimo的年龄："+Mimo.month2);
        System.out.println("Mimo的体重："+Mimo.weigth);

    }
}
