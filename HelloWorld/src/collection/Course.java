package collection;

public class Course {
    //练习用，所以参数的属性设置成了public
    //实际应用过程中需要通过private关键字把属性私有化，然后通过getter和setter方法去访问属性

    public int id;
    public String name;

    public Course(){}

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
