package container.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    public List<Course> coursesList;

    public TestGeneric(){
        this.coursesList = new ArrayList<Course>();
    }

    public void testAdd(){
        Course course9 = new Course("9","昕爷");
        Course course10 = new Course("10","王晓斌");
        coursesList.add(course9);
        coursesList.add(course10);
        System.out.println("通过泛型，指定元素类型来向集合中添加元素:"+course9.name+","+course10.name);
    }

    public void testForEach(){
        //for (Object object : coursesList){
        //    Course course = (Course) coursesList;
        //}
        for (Course course : coursesList){
            System.out.println(course.id+","+course.name);
        }
    }

    //泛型集合可以添加泛型子类型的对象实例
    public void testChild(){
        ChildCourse childCourse = new ChildCourse();
        coursesList.add(childCourse);
        childCourse.id = "12";
        childCourse.name = "赛赛";
        System.out.println("泛型子类向集合中添加元素：");
    }

    //泛型不能使用基本数据类型
    public void testType(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本数据类型必须使用包装类作为泛型："+list.get(0));
    }

    public static void main(String[] args) {
        TestGeneric testGeneric = new TestGeneric();
        testGeneric.testAdd();
        testGeneric.testForEach();
        testGeneric.testChild();
        testGeneric.testForEach();
        testGeneric.testType();
    }
}
