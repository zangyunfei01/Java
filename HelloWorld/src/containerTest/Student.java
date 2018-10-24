package containerTest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Student {
    String id;
    String name;
    Set<Course> courseIWantToSelect;

    public Student(String id,String name){
        this.id = id;
        this.name = name;
        this.courseIWantToSelect = new HashSet<Course>();
    }
}
