package cTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    List<Course> courseList;

    public ListTest() {
        courseList = new ArrayList<Course>();
    }

    public void testAdd() {
        Course course1 = new Course("1", "掌中宝");
        courseList.add(course1);
        Course getCourese1 = (Course) courseList.get(0);
        System.out.println("成功添加课程：" + course1.id + "," + course1.name);
        Course course2 = new Course("2", "跑步鸡");
        courseList.add(0, course2);
        System.out.println("成功添加课程：" + course2.id + "," + course2.name);
        Course[] course34 = {new Course("3", "肉松饼"), new Course("4", "Scott吉吉")};
        courseList.addAll(Arrays.asList(course34));
        Course course3 = (Course) courseList.get(2);
        Course course4 = (Course) courseList.get(3);
        System.out.println("成功添加课程：" + course3.id + "," + course3.name);
        System.out.println("成功添加课程：" + course4.id + "," + course4.name);
        Course[] course56 = {new Course("5", "流星雨"), new Course("6", "三轮车")};
        courseList.addAll(0, Arrays.asList(course56));
        Course course5 = (Course) courseList.get(0);
        Course course6 = (Course) courseList.get(1);
        System.out.println("成功添加课程：" + course5.id + "," + course5.name);
        System.out.println("成功添加课程：" + course6.id + "," + course6.name);
        Course course7 = new Course("2","跑步鸡");
        Course course8 = new Course("1","掌中宝");
        courseList.add(course7);
        courseList.add(course8);
    }

    public void testRemoveAll(){
        Course []courseRemove = {(Course) courseList.get(2),(Course) courseList.get(3)};
        System.out.println("即将删除课程："+((Course) courseList.get(2)).name+","+((Course) courseList.get(3)).name);
        courseList.removeAll(Arrays.asList(courseRemove));
        System.out.println("删除后的课程为：");
        testForEach();
    }

    public void testModify(){
        System.out.println("修改index = 1 位置上的数据-------------");
        courseList.set(1,new Course("6","阿史三轮车证代办处"));
    }

    public void testGetCourse() {
        for (int i = 0; i < courseList.size(); i++) {
            Course course = (Course) courseList.get(i);
            System.out.println("courseList集合中的课程有：" + course.id + "," + course.name);
        }
    }

    public void testIterator() {
        Iterator iterator = courseList.iterator();
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            System.out.println("courseList中的课程有：" + course.id + "," + course.name);
        }
    }

    public void testForEach() {
        //for (Object object : courseList) {
        //    Course course = (Course) object;
        //    System.out.println("可选的课程有：" + course.id + "," + course.name);
        //}
        for (Course course : courseList){
            System.out.println("可选的课程有：" + course.id + "," + course.name);
        }
    }


    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.testAdd();
        //listTest.testGetCourse();
        //listTest.testIterator();
        listTest.testForEach();
        listTest.testRemoveAll();
        listTest.testModify();
        listTest.testForEach();

    }
}
