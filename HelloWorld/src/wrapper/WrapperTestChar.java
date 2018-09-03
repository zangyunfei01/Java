package wrapper;

public class WrapperTestChar {
    public static void main(String[] args) {
        int t1 =1;
        Integer t2 =2;
        //通过toString把int类型转为String类型
        String t3 = Integer.toString(t1);
        String t4 = Integer.toString(t2);
        System.out.println("int转为String："+t3);
        System.out.println("Integer转为String："+t4);
        //字符串转为基本数据类型
        //1.包装类的parse方法
        int t5 = Integer.parseInt(t3);
        //2.valueOf方法是对parse方法的封装，使用valueOf是先将字符串转为包装类，再通过自动拆箱拆箱转为基本数据类型
        int t6 = Integer.valueOf(t4);
        System.out.println("String类型通过parse方法转为int类型："+t5);
        System.out.println("String类型通过valueOf方法转为int类型："+t6);

    }
}
