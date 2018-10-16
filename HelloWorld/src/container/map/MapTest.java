package container.map;

import com.sun.xml.internal.bind.v2.model.core.ID;
import container.collection.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    /***
     *      通过Map对学生信息进行管理、
     *      key为学生id，value为学生类型的对象
     *      通过键入学生信息，对集合中学生信息进行增删改查操作
     */

    //新建一个Map类型的属性，用于存放学生类型的对象
    public Map<String, Student> students;

    //新建一个构造方法，用于初始化学生students的属性
    //public MapTest() {
    //    students = new HashMap<String, Student>();
    //}

    /***
     * 测试添加：输入学生id，判断是否被占用
     * 若id未被占用，则输入学生姓名，创建新的学生对象并添加到students集合中
     */
    public void testPut() {
        students = new HashMap<String, Student>();
        //新建一个Scanner对象，用于获取输入的学生id和姓名
        Scanner input = new Scanner(System.in);
        //创建一个循环，输入三组学生的id和姓名
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID：");
            String ID = input.next();
            Student testID = students.get(ID);
            if (testID == null) {
                System.out.println("请输入学生姓名：");
                String name = input.next();
                Student student = new Student(ID, name);
                students.put(ID, student);
                i++;
            } else {
                System.out.println("该学生id已被占用");
                continue;
            }
        }
    }

    //输入完毕后，遍历打印输出集合中的学生信息
    public void testKeySet() {
        System.out.println("学生数量为：" + students.size());
        //通过keySet方法，返回Map中所有"键"的集合
        Set<String> studentKeySet = students.keySet();
        //遍历keySet，取得keySet中返回的每一个键；再调用get方法，取得每一个键所对应的值
        for (String studentID : studentKeySet) {
            Student studentValue = students.get(studentID);
            if (studentValue != null) {
                System.out.println(studentValue.name);
            }
        }
    }

    //通过endtySet方法来遍历集合，返回Map中的所有键值对
    public void testEntrySet() {
        //Entry本身带有泛型
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println("取得的键是：" + entry.getKey());
            System.out.println("所对应的值是：" + entry.getValue().name);
        }
    }

    //Map的删除方法，用于删除Map中的映射
    public void testRemove() {
        while (true) {
            System.out.println("请输入要删除学生的ID：");
            Scanner input = new Scanner(System.in);
            String ID = input.next();
            //判断是否有与输入ID相对应的学生信息
            Student student = students.get(ID);
            if (student == null) {
                System.out.println("该学生信息不存在！");
                continue;
            } else {
                students.remove(ID);
                System.out.println("成功删除" + student.name + "！");
                break;
            }
        }
    }

    //用put方法，修改Map中已有的映射
    public void testModify() {
        while (true) {
            System.out.println("请输入要修改的学生ID：");
            Scanner input = new Scanner(System.in);
            //取得输入的学生ID
            String studentID = input.next();
            //从Map集合students中查找是否有与之对应的对象
            Student student = students.get(studentID);
            if (student == null) {
                System.out.println("该学生信息不存在！");
                continue;
            }
            System.out.println("当前学生姓名是：" + student.name);
            System.out.println("请输入新的学生姓名：");
            String newName = input.next();
            Student newStudent = new Student(studentID, newName);
            students.put(studentID, newStudent);
            System.out.println("修改成功");
            break;
        }
    }


    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.testPut();
        mapTest.testKeySet();
        //mapTest.testRemove();
        //mapTest.testEntrySet();
        mapTest.testModify();
        mapTest.testEntrySet();
    }
}
