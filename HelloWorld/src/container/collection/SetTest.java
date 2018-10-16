package container.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

    public List<Course> coursesList;

    public SetTest() {
        coursesList = new ArrayList<Course>();
    }

    //新建一个方法，用于往coursesList中添加课程
    public void testAdd() {
        //创建一个课程对象，通过调用add方法，将课程添加到coursesList中
        Course course1 = new Course("1", "掌中宝");
        coursesList.add(course1);
        //对象存入集合的时候，如不指定类型，会自动变成一个Object类型，取出时需要转换成所需类型
        Course getCourse1 = (Course) coursesList.get(0);
        //System.out.println("取出添加的课程course1：" + getCourse1.id + "," + getCourse1.name);

        //指定位置添加元素
        Course course2 = new Course("2", "跑步鸡");
        coursesList.add(0, course2);
        Course getCourse2 = (Course) coursesList.get(0);
        //System.out.println("取出添加的课程course2：" + getCourse2.id + "," + getCourse2.name);

        //addAll方法1
        Course[] course3 = {new Course("3", "肉松饼"), new Course("4", "Scott吉吉")};
        coursesList.addAll(Arrays.asList(course3));
        Course getCourse3 = (Course) coursesList.get(2);
        Course getCourse4 = (Course) coursesList.get(3);
        //System.out.println("取出添加的课程course3：" + getCourse3.id + "," + getCourse3.name + "," + getCourse4.id + "," +
        //        getCourse4.name);

        //addAll方法2
        Course course4[] = {new Course("5", "三轮车"), new Course("6", "流星雨")};
        coursesList.addAll(0, Arrays.asList(course4));
        Course getCourse5 = (Course) coursesList.get(0);
        Course getCourse6 = (Course) coursesList.get(1);
        //System.out.println("取出添加的课程course4：" + getCourse5.id + "," + getCourse5.name + "," + getCourse6.id + "," +
        //        getCourse6.name);

        //添加重复数据
        //Course course7 = new Course(2, "跑步鸡");
        //coursesList.add(course7);
        //Course getCourse7 = (Course) coursesList.get(6);
        //int getIndexOfCourse7 = coursesList.indexOf(course7);
        //System.out.println("取出添加的课程course7：" + getCourse7.id + "," + getCourse7.name + "," + "course7的索引：" +
        //        getIndexOfCourse7);
    }

    //通过forEach方法遍历所添加课程
    public void testForEach() {
        for (Object object : coursesList) {
            Course course = (Course) object;
            System.out.println("有如下待选课程：" + course.id + "," + course.name);
        }
    }

    public void testForEachForSet(Student student){
        System.out.println("共选择了"+student.courses.size()+"门课程");
        //打印输出学生所选课程，只能用forEach或iterator
        for (Course course : student.courses){
            System.out.println("选择了课程："+","+course.id+","+course.name);
        }
    }

    public static void main(String[] args) {
        SetTest setTest = new SetTest();
        setTest.testAdd();
        setTest.testForEach();
        //创建一个学生对象
        Student student = new Student("1", "Tom");
        System.out.println("欢迎" + student.name + "来选课！");
        //创建一个Scanner对象，用于接收从键盘输入的id
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入所选课程id(1-6):");
            String courseID = input.next();
            for (Course course : setTest.coursesList) {
                if (courseID.equals(course.id)) {
                    student.courses.add(course);
                    //验证Set中不允许包含相同元素
                    student.courses.add(course);
                    //添加空对象
                    student.courses.add(null);
                }
            }
        }
        setTest.testForEachForSet(student);
    }

}
