package wrapper;

//通过包装类可以让基本数据类型获取对象一样的特征，拥有属性方法，行使对象一样的权益，对象化交互。

public class WrapperTestOne {
    public static void main(String[] args) {

        int i1 = 2;
        //自动装箱
        Integer i2 = i1;
        //手动装箱
        Integer i3 = new Integer(i1);
        System.out.println("int:"+i1);
        System.out.println("自动装箱Integer1:"+i2);
        System.out.println("手动装箱Integer2:"+i3);

        Integer i4 = 4;
        //自动拆箱
        int i5 = i4;
        //手动拆箱
        int i6 = i4.intValue();
        //手动拆箱
        double i7 = i4.doubleValue();
        System.out.println("Integer:"+i4);
        System.out.println("自动拆箱int1:"+i5);
        System.out.println("手动拆箱int2:"+i6);
        System.out.println("自动拆箱double:"+i7);

    }
}

