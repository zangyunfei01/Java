package containerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    List<Course> courseList;

    public SetTest() {
        courseList = new ArrayList<Course>();
    }

    public void testAdd() {
        Course course1 = new Course("1", "掌中宝");
        courseList.add(course1);
        Course getCourese1 = (Course) courseList.get(0);
        //System.out.println("成功添加课程：" + course1.id + "," + course1.name);
        Course course2 = new Course("2", "跑步鸡");
        courseList.add(0, course2);
        //System.out.println("成功添加课程：" + course2.id + "," + course2.name);
        Course[] course34 = {new Course("3", "肉松饼"), new Course("4", "Scott吉吉")};
        courseList.addAll(Arrays.asList(course34));
        Course course3 = (Course) courseList.get(2);
        Course course4 = (Course) courseList.get(3);
        //System.out.println("成功添加课程：" + course3.id + "," + course3.name);
        //System.out.println("成功添加课程：" + course4.id + "," + course4.name);
        Course[] course56 = {new Course("5", "流星雨"), new Course("6", "三轮车")};
        courseList.addAll(0, Arrays.asList(course56));
        Course course5 = (Course) courseList.get(0);
        Course course6 = (Course) courseList.get(1);
        //System.out.println("成功添加课程：" + course5.id + "," + course5.name);
        //System.out.println("成功添加课程：" + course6.id + "," + course6.name);
        Course course7 = new Course("2", "跑步鸡");
        Course course8 = new Course("1", "掌中宝");
        //courseList.add(course7);
        //courseList.add(course8);
    }

    public void testForEach() {
        for (Course course : courseList) {
            System.out.println("可选的课程有：" + course.id + "," + course.name);
        }
    }

    public void testForEachForWhatDoesTomSelect(Student student) {
        for (Course course : student.courseIWantToSelect) {
            System.out.println("选了如下课程：" + course.id+","+course.name);
        }
    }


    public static void main(String[] args) {
        SetTest setTest = new SetTest();
        setTest.testAdd();
        setTest.testForEach();
        Student student = new Student("1", "Tom");
        System.out.println("欢迎" + student.name + "来选课！");
        System.out.println("请输入课程ID（1-6）：");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String courseID = input.next();
            for (Course course : setTest.courseList) {
                if (courseID.equals(course.id)) {
                    student.courseIWantToSelect.add(course);
                    student.courseIWantToSelect.add(course);
                    //student.courseIWantToSelect.add(null);
                    System.out.println("已选择课程：" + course.id + "," + course.name);
                }
            }
        }
        setTest.testForEachForWhatDoesTomSelect(student);
    }
}
