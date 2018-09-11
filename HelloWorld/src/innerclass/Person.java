package innerclass;

public class Person {

    int age;
    //成员内部类Heart，直接定义在Person类内部，与成员变量age位于同一位置
    class Heart {
        public String beat() {
            return "心脏在跳动";
        }
    }

    //为内部类准备get方法，这里只对内部类进行了初始化，而没有返回值,直接调用该方法不会报错，但是不return，就没办法调用内部类的属性和方法了
    public void getHeart() {
        Heart heart = new Heart();
    }

    public Heart getHeart2() {
        Heart heart = new Heart();
        return heart;
    }

    public Heart getHeart3() {
        return new Heart();
    }


}
