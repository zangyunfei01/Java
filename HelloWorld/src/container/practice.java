package container;

import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("掌中宝");
        list.add("跑步鸡");
        list.add(0,"肉松饼");
        System.out.println("list集合的长度是:"+list.size());
    }
}
