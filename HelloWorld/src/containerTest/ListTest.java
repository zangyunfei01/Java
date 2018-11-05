package containerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    List<Course> courseList = new ArrayList<Course>();

    public void testAdd(){

        Course course1 =new Course("1","掌中宝");
        courseList.add(course1);
        //元素添加到集合中后，会忽略元素类型而转化成Object类型，取出来的时候需要类型强转，转化为我们需要的类型
        Course getCourse1 = courseList.get(0);
        //System.out.println("添加了课程:"+getCourse1.id+","+getCourse1.name);
        Course course2 = new Course("2","跑步鸡");
        courseList.add(0,course2);

        Course[] course34 = {new Course("3","肉松饼"),new Course("4","Scott吉吉")};
        courseList.addAll(Arrays.asList(course34));
        Course getCourse3 =  courseList.get(2);
        Course getCourse4 = (Course) courseList.get(3);
        //System.out.println("添加了课程："+getCourse3.id+","+getCourse3.name);
        //System.out.println("添加了课程："+getCourse4.id+","+getCourse4.name);
        //先创建一个数组，然后把数组转化成集合，再把创建的集合用addAll方法添加到coureseList集合中去
        Course[] course56 = {new Course("5","阿史三轮车代办处"),new Course("6","流星雨")};
        courseList.addAll(0,Arrays.asList(course56));
        //测试List中可以存放相同的元素
        //Course course7 = new Course("5","阿史三轮车代办处");
        //Course course8 = new Course("6","流星雨");
        //courseList.add(course7);
        //courseList.add(course8);
    }

    public void testRemove(){
        courseList.remove(6);
        courseList.remove(6);
    }

    public void testCourse(){
        for (int i = 0; i < courseList.size(); i ++){
            Course course = (Course) courseList.get(i);
            System.out.println("集合中的元素有："+course.id+","+course.name);
        }
    }

    public void testIterator(){
        Iterator iterator = courseList.iterator();
        while (iterator.hasNext()){
            Course course = (Course) iterator.next();
            System.out.println("用Iterator方法遍历集合中的元素："+course.id+","+course.name);
        }
    }

    public void testSet(){
        courseList.set(0,new Course("7","波波"));
        courseList.set(1,new Course("8","昕爷"));
    }

    public void testForEach(){
        for (Object object : courseList){
            Course course = (Course) object;
            System.out.println("用ForEach方法遍历集合中的元素："+course.id+","+course.name);
        }
    }



    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.testAdd();
        //listTest.testCourse();
        //listTest.testRemove();
        //System.out.println("删除后的元素还有：");
        //listTest.testCourse();
        //listTest.testIterator();
        listTest.testForEach();
        listTest.testSet();
        System.out.println("替换后的元素为：");
        System.out.println("courseList集合中共有"+listTest.courseList.size()+"门课程");
        listTest.testForEach();
    }
}
