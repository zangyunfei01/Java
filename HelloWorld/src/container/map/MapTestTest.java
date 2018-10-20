package container.map;

import container.collection.Student;

import java.util.HashMap;
import java.util.Map;

public class MapTestTest {
    /***
     *      通过Map对学生信息进行管理、
     *      key为学生id，value为学生类型的对象
     *      通过键入学生信息，对集合中学生信息进行增删改查操作
     */

    public Map<String,Student> students;

    //在构造器中初始化students的属性
    public MapTestTest(){
        this.students = new HashMap<String, Student>();
    }


}
