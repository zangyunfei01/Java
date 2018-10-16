package container.collection;

import java.util.*;

public class ListTest {

    //用List容器存放备选课程
    public List coursesList;

    //新建一个构造方法，用于初始化ListTest的coursesList;
    public ListTest() {
        this.coursesList = new ArrayList();
    }

    //新建一个方法，用于往coursesList中添加课程
    public void testAdd() {
        //创建一个课程对象，通过调用add方法，将课程添加到coursesList中
        Course course1 = new Course("1", "掌中宝");
        coursesList.add(course1);
        //对象存入集合的时候，如不指定类型，会自动变成一个Object类型，取出时需要转换成所需类型
        Course getCourse1 = (Course) coursesList.get(0);
        System.out.println("取出添加的课程course1：" + getCourse1.id + "," + getCourse1.name);

        //指定位置添加元素
        Course course2 = new Course("2", "跑步鸡");
        coursesList.add(0, course2);
        Course getCourse2 = (Course) coursesList.get(0);
        System.out.println("取出添加的课程course2：" + getCourse2.id + "," + getCourse2.name);

        //addAll方法1
        Course[] course3 = {new Course("3", "肉松饼"), new Course("4", "Scott吉吉")};
        coursesList.addAll(Arrays.asList(course3));
        Course getCourse3 = (Course) coursesList.get(2);
        Course getCourse4 = (Course) coursesList.get(3);
        System.out.println("取出添加的课程course3：" + getCourse3.id + "," + getCourse3.name + "," + getCourse4.id + "," +
                getCourse4.name);

        //addAll方法2
        Course course4[] = {new Course("5", "三轮车"), new Course("6", "流星雨")};
        coursesList.addAll(0, Arrays.asList(course4));
        Course getCourse5 = (Course) coursesList.get(0);
        Course getCourse6 = (Course) coursesList.get(1);
        System.out.println("取出添加的课程course4：" + getCourse5.id + "," + getCourse5.name + "," + getCourse6.id + "," +
                getCourse6.name);

        //添加重复数据
        Course course7 = new Course("2", "跑步鸡");
        coursesList.add(course7);
        Course getCourse7 = (Course) coursesList.get(6);
        int getIndexOfCourse7 = coursesList.indexOf(course7);
        System.out.println("取出添加的课程course7：" + getCourse7.id + "," + getCourse7.name + "," + "course7的索引：" +
                getIndexOfCourse7);
    }

    //for循环遍历查询所添加课程
    public void testGet() {
        int size = coursesList.size();
        for (int i = 0; i < size; i++) {
            Course getCourse = (Course) coursesList.get(i);
            System.out.println("所有课程：" + getCourse.id + "," + getCourse.name);
        }
    }

    //通过迭代器查询所添加的课程
    public void testIterator() {
        Iterator iterator = coursesList.iterator();
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            System.out.println("通过迭代器遍历所有课程：" + course.id + "," + course.name);
        }
    }

    //通过forEach方法遍历所添加课程
    public void testForEach() {
        for (Object object : coursesList) {
            Course course = (Course) object;
            System.out.println("通过迭代器的forEach方法遍历所有课程：" + course.id + "," + course.name);
        }
    }

    //修改List中的元素
    public void testModify() {
        coursesList.set(2, new Course("7", "炸只鸡"));
    }

    //删除List中的元素
    public void testRemove() {
        Course course = (Course) coursesList.get(6);
        System.out.println("即将删除:" + course.id + "," + course.name);
        coursesList.remove(course);
        //coursesList.remove(6);
        System.out.println("删除后的课程为：");
        testForEach();
    }

    //removeAll方法，删除该集合中也包含在其他指定集合中的所有元素
    public void testRemoveAll() {
        Course course8 = (Course) coursesList.get(2);
        Course course9 = (Course) coursesList.get(3);
        System.out.println("即将删除:" + course8.name + "," + course9.name);
        Course[] courses = {(Course) coursesList.get(2), (Course) coursesList.get(3)};
        coursesList.removeAll(Arrays.asList(courses));
        testForEach();
    }

    //测试往集合中添加其他类型的对象


    //泛型，规定向集合中添加指定类型的元素

    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.testAdd();
        //listTest.testGet();
        listTest.testIterator();
        //listTest.testModify();
        //listTest.testForEach();
        //listTest.testRemove();
        listTest.testRemoveAll();
    }


    //String[] name = {"掌中宝","跑步鸡","Scott吉吉","肉松饼"};
    //
    ////通过指定泛型为String，这个集合就是用来存放String类型的，放入其他类型都会报错
    //List<String> list = new ArrayList<String>();
    //
    //public static void main(String[] args) {
    //    ListTest listTest = new ListTest();
    //    System.out.println(listTest.name.length);
    //    System.out.println(listTest.list.size());
    //}
}


