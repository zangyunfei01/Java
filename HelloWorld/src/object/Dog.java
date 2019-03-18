package object;

public class Dog {
    public String name;
    public int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    //重写Object的toString方法，让打印dog对象的时候不再输出dog对象在内存中的地址，而是输出我们想要的对象的属性值
    @Override
    public String toString(){
        return "name:"+name+",age:"+age;
    }
}
