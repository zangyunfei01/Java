package containerTest;

import container.collection.SetTest;

import java.util.Scanner;

public class SetList {

    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.testAdd();
        Student tom = new Student("1", "Tom");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入所选课程id(1-6):");
            String courseID = input.next();
            for (containerTest.Course course : listTest.courseList) {
                if (courseID.equals(course.id)) {
                    tom.courseThatTomWantToSelect.add(course);
                    tom.courseThatTomWantToSelect.add(course);
                    tom.courseThatTomWantToSelect.add(null);
                    System.out.println("已选课程" + course.name);
                }
            }
        }

    }
}
