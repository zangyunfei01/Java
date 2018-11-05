package cTest;


import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    //定义一个Map类型的对象用于盛装ID和学生的映射
    Map<String, Student> studentMap;

    //创建一个构造方法，用于初始化studentMap的属性
    public MapTest() {
        this.studentMap = new HashMap<String, Student>();
    }

    /***
     * 测试添加：输入学生ID，判断是否被占用
     * 若，未被占用，则，继续输入姓名，创建新的学生对象，并添加到Map中
     * 若，被占用，则，返回一个空对象null值
     */

    public void testPut() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID:");
            String studentID = input.next();
            /***
             * 判断学生ID是否被占用：
             * 调用Map的get方法，get方法，会把Map中的key作为参数传入，来获取Map的value值
             */
            Student student = studentMap.get(studentID);

            //判断学生ID是否被占用
            if (student == null) {
                System.out.println("请输入学生姓名：");
                String studentName = input.next();
                Student newStudent = new Student(studentID, studentName);
                studentMap.put(studentID, newStudent);
                System.out.println("成功添加学生:" + newStudent.id + "," + newStudent.name);
                i++;
            } else {
                System.out.println("该学生ID已被占用");
                continue;
            }
        }
    }

    //Map的keySet方法，返回的是所有key的一个set集合
    public void testKeySet() {
        Set<String> keySet = studentMap.keySet();
        System.out.println("总共有" + studentMap.size() + "个学生");
        //通过foreach方法遍历keySet中中每一个键的值
        for (String ID : keySet) {
            //通过Map的get方法取得键所对应的值
            Student student = studentMap.get(ID);
            if (ID != null) {
                System.out.println("studentMap中的学生有：" + student.id + "，" + student.name);
            }
        }
    }

    public void testRemove() {

        while (true) {
            System.out.println("请输入要删除学生的ID：");
            Scanner input = new Scanner(System.in);
            String ID = input.next();
            Student student = studentMap.get(ID);
            if (student == null) {
                System.out.println("该ID不存在");
                continue;
            }
            studentMap.remove(ID);
            System.out.println("成功删除学生:" + student.id + "," + student.name);
            break;
        }

    }

    //entrySet返回的是一个键值对的集合
    public void testEntrySet() {
        Set<Map.Entry<String, Student>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println("取得键值:" + entry.getKey());
            System.out.println("对应的学生姓名为：" + entry.getValue().name);
        }

    }

    public void testModify(){
        System.out.println("请输入要修改的学生id");
        Scanner input = new Scanner(System.in);
        while (true){
            String ID = input.next();
            Student student = studentMap.get(ID);
            if (student == null){
                System.out.println("该id不存在，请重新输入");
                continue;
            }
            System.out.println("当前id对应的姓名为"+student.name);
            System.out.println("请输入新的学生姓名：");
            String newName = input.next();
            Student newStudent = new Student(ID,newName);
            System.out.println("修改成功");
            break;
        }
    }

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.testPut();
        mapTest.testKeySet();
        mapTest.testRemove();
        mapTest.testEntrySet();
        mapTest.testModify();
        mapTest.testEntrySet();
    }

}
