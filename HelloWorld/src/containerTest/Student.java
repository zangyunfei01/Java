package containerTest;

import java.util.HashSet;
import java.util.Set;

public class Student {
    String id;
    String name;
    //添加一个Set类型的集合，用于存放学生所选的课程
    Set courseThatTomWantToSelect;
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courseThatTomWantToSelect = new HashSet();
    }
}
