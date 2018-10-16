package container.collection;


import java.util.HashSet;
import java.util.Set;

public class Student {
    public String id;
    public String name;
    //用Set存放课程信息，先暂时用一下Set，稍后介绍Set的用法
    public Set<Course> courses;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
        //通过HashSet对所选课程的属性进行初始化
        this.courses = new HashSet<Course>();

    }
}
